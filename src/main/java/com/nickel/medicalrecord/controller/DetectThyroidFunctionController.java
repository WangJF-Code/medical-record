package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.entity.DetectThyroidFunction;
import com.nickel.medicalrecord.service.IDetectThyroidFunctionService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "辅助检查-甲状腺功能相关接口")
@RestController
@RequestMapping("/api/thyroidFunction")
public class DetectThyroidFunctionController {

    private IDetectThyroidFunctionService service;

    @Autowired
    public void setService(IDetectThyroidFunctionService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<DetectThyroidFunction>> list(@ApiParam(required = true, value = "type") Integer type,
                                                       @ApiParam(required = true, value = "dataId") String dataId) {
        List<DetectThyroidFunction> list = service.getList(type, dataId);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<DetectThyroidFunction> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        DetectThyroidFunction info = service.get(id);
        return ApiResultUtil.okay(info);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody DetectThyroidFunction updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody DetectThyroidFunction createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}