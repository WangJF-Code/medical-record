package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.entity.PatientFamilyHistory;
import com.nickel.medicalrecord.service.IPatientFamilyHistoryService;
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
@Api(tags = "家族病史相关接口")
@RestController
@RequestMapping("/api/familyHistory")
public class PatientFamilyHistoryController {

    private IPatientFamilyHistoryService service;

    @Autowired
    public void setService(IPatientFamilyHistoryService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<PatientFamilyHistory>> getList(@RequestBody PatientFamilyHistory patientFamilyHistory) {
        return ApiResultUtil.okay(service.getList(patientFamilyHistory));
    }

    @ApiOperation("列表信息")
    @GetMapping("/list/{patientId}")
    public ApiResult<List<PatientFamilyHistory>> getList(@PathVariable String patientId) {
        return ApiResultUtil.okay(service.getList(patientId));
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<PatientFamilyHistory> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        return ApiResultUtil.okay(service.get(id));
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult<Integer> create(@RequestBody PatientFamilyHistory familyHistory) {
        service.create(familyHistory);
        return ApiResultUtil.okay(familyHistory.getId());
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody PatientFamilyHistory familyHistory) {
        service.update(familyHistory);
        return ApiResultUtil.okay();
    }

}
