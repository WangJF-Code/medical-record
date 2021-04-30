package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.entity.PatientDrugHistory;
import com.nickel.medicalrecord.service.IPatientDrugHistoryService;
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
@Api(tags = "个人用药史相关接口")
@RestController
@RequestMapping("/api/drugHistory")
public class PatientDrugHistoryController {

    private IPatientDrugHistoryService service;

    @Autowired
    public void setService(IPatientDrugHistoryService service) {
        this.service = service;
    }

    @ApiOperation("个人用药史列表信息")
    @PostMapping("/list")
    public ApiResult<List<PatientDrugHistory>> getList(@RequestBody PatientDrugHistory patientDrugHistory) {
        return ApiResultUtil.okay(service.getList(patientDrugHistory));
    }

    @ApiOperation("个人用药史列表信息")
    @GetMapping("/list/{patientId}")
    public ApiResult<List<PatientDrugHistory>> getList(@PathVariable String patientId) {
        return ApiResultUtil.okay(service.getList(patientId));
    }

    @ApiOperation("个人用药史信息")
    @GetMapping("/{id}")
    public ApiResult<PatientDrugHistory> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        return ApiResultUtil.okay(service.get(id));
    }

    @ApiOperation("创建个人用药史信息")
    @PostMapping
    public ApiResult<Integer> create(@RequestBody PatientDrugHistory drugHistory) {
        service.create(drugHistory);
        return ApiResultUtil.okay(drugHistory.getId());
    }

    @ApiOperation("修改个人用药史信息")
    @PutMapping
    public ApiResult update(@RequestBody PatientDrugHistory drugHistory) {
        service.update(drugHistory);
        return ApiResultUtil.okay();
    }

}
