package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.entity.Patient;
import com.nickel.medicalrecord.service.IPatientService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Api(tags = "患者相关接口")
@RestController
@RequestMapping("/api/patient")
public class PatientController {

    private IPatientService service;

    @Autowired
    public void setService(IPatientService service) {
        this.service = service;
    }

    @ApiOperation("患者列表信息")
    @PostMapping("/page")
    public ApiResult<Page<Patient>> list(@ApiParam(value = "当前页号", defaultValue = "1") @RequestParam(required = false, defaultValue = "1") Integer pageCurrent,
                                         @ApiParam(value = "每页显示条数", defaultValue = "10") @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                         @RequestBody Patient patient) {
        checkParam(patient);
        if (pageCurrent < 1) {
            pageCurrent = 1;
        }
        return ApiResultUtil.okay(service.getPage(patient, pageCurrent, pageSize));
    }

    @ApiOperation("患者列表信息")
    @PostMapping("/list")
    public ApiResult<List<Patient>> list(@RequestBody Patient patient) {
        checkParam(patient);
        return ApiResultUtil.okay(service.getList(patient));
    }

    @ApiOperation("患者信息")
    @GetMapping("/{id}")
    public ApiResult<Patient> info(@ApiParam(required = true, value = "id") @PathVariable String id) {
        return ApiResultUtil.okay(service.get(id));
    }

    @ApiOperation("创建患者信息")
    @PostMapping
    public ApiResult<String> create(@RequestBody Patient patient) {
        checkParam(patient);
        service.create(patient);
        return ApiResultUtil.okay(patient.getId());
    }

    @ApiOperation("修改患者信息")
    @PutMapping
    public ApiResult update(@RequestBody Patient patient) {
        checkParam(patient);
        service.update(patient);
        return ApiResultUtil.okay();
    }

    private void checkParam(Patient patient) {
        if (Objects.isNull(patient)) {
            patient = Patient.builder().build();
        }
    }

}
