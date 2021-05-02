package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.DetectSwiCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectSwiDTO;
import com.nickel.medicalrecord.model.dto.DetectSwiUpdateDTO;
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
    public ApiResult<List<DetectSwiDTO>> list(@ApiParam(required = true, value = "type") @RequestParam Integer type,
                                              @ApiParam(required = true, value = "dataId") @RequestParam String dataId) {
        List<DetectSwiDTO> list = service.getList(type, dataId);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<DetectSwiDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        DetectSwiDTO info = service.get(id);
        return ApiResultUtil.okay(info);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody DetectSwiUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody DetectSwiCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}