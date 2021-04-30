package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.entity.PatientMedicalHistory;
import com.nickel.medicalrecord.service.IPatientMedicalHistoryService;
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
 * @ClassName PatientDrugHistoryController
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/19 0:13
 * @Version 1.0
 */
@Api(tags = "既往病史相关接口")
@RestController
@RequestMapping("/api/medicalHistory")
public class PatientMedicalHistoryController {

    private IPatientMedicalHistoryService service;

    @Autowired
    public void setService(IPatientMedicalHistoryService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<PatientMedicalHistory>> getList(@RequestBody PatientMedicalHistory medicalHistory) {
        return ApiResultUtil.okay(service.getList(medicalHistory));
    }

    @ApiOperation("列表信息")
    @GetMapping("/list/{patientId}")
    public ApiResult<List<PatientMedicalHistory>> getList(@PathVariable String patientId) {
        return ApiResultUtil.okay(service.getList(patientId));
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<PatientMedicalHistory> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        return ApiResultUtil.okay(service.get(id));
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult<Integer> create(@RequestBody PatientMedicalHistory medicalHistory) {
        service.create(medicalHistory);
        return ApiResultUtil.okay(medicalHistory.getId());
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody PatientMedicalHistory medicalHistory) {
        service.update(medicalHistory);
        return ApiResultUtil.okay();
    }

}
