package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.entity.DetectSwi;
import com.nickel.medicalrecord.service.IDetectSwiService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "辅助检查-磁共振磁敏感成像(SWI)相关接口")
@RestController
@RequestMapping("/api/swi")
public class DetectSwiController {

    private IDetectSwiService service;

    @Autowired
    public void setService(IDetectSwiService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<DetectSwi>> list(@ApiParam(required = true, value = "type") Integer type,
                                           @ApiParam(required = true, value = "dataId") String dataId) {
        List<DetectSwi> list = service.getList(type, dataId);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<DetectSwi> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        DetectSwi info = service.get(id);
        return ApiResultUtil.okay(info);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody DetectSwi updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody DetectSwi createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}