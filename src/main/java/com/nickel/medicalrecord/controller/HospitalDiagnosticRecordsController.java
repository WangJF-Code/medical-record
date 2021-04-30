package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.*;
import com.nickel.medicalrecord.service.IHospitalDiagnosticRecordsService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName HospitalDiagnosticRecordsController
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 17:39
 * @Version 1.0
 */
@Api(tags = "诊断记录相关接口")
@RestController
@RequestMapping("/api/hospitalDiagnostic")
public class HospitalDiagnosticRecordsController {

    private IHospitalDiagnosticRecordsService service;

    @Autowired
    public void setService(IHospitalDiagnosticRecordsService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list/{hospitalRecordsId}")
    public ApiResult<List<HospitalDiagnosticRecordsDTO>> list(@ApiParam(required = true, value = "id") @PathVariable String hospitalRecordsId) {
        return ApiResultUtil.okay(service.getList(hospitalRecordsId));
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<HospitalDiagnosticRecordsDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        return ApiResultUtil.okay(service.get(id));
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody HospitalDiagnosticRecordsCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody HospitalDiagnosticRecordsUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

}
