package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.DetectThyroidFunctionCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectThyroidFunctionDTO;
import com.nickel.medicalrecord.model.dto.DetectThyroidFunctionUpdateDTO;
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
    public ApiResult<List<DetectThyroidFunctionDTO>> list(@ApiParam(required = true, value = "type") @RequestParam Integer type,
                                                          @ApiParam(required = true, value = "dataId") @RequestParam String dataId) {
        List<DetectThyroidFunctionDTO> list = service.getList(type, dataId);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<DetectThyroidFunctionDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        DetectThyroidFunctionDTO info = service.get(id);
        return ApiResultUtil.okay(info);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody DetectThyroidFunctionUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody DetectThyroidFunctionCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}