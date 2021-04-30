package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.entity.PatientDrugHistory;
import com.nickel.medicalrecord.model.entity.PatientLifestyle;
import com.nickel.medicalrecord.service.IPatientDrugHistoryService;
import com.nickel.medicalrecord.service.IPatientLifestyleService;
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
@Api(tags = "生活方式相关接口")
@RestController
@RequestMapping("/api/lifestyle")
public class PatientLifestyleController {

    private IPatientLifestyleService service;

    @Autowired
    public void setService(IPatientLifestyleService service) {
        this.service = service;
    }

    @ApiOperation("生活方式列表信息")
    @PostMapping("/list")
    public ApiResult<List<PatientLifestyle>> getList(@RequestBody PatientLifestyle lifestyle) {
        return ApiResultUtil.okay(service.getList(lifestyle));
    }

    @ApiOperation("生活方式列表信息")
    @GetMapping("/list/{patientId}")
    public ApiResult<List<PatientLifestyle>> getList(@PathVariable String patientId) {
        return ApiResultUtil.okay(service.getList(patientId));
    }

    @ApiOperation("生活方式信息")
    @GetMapping("/{id}")
    public ApiResult<PatientLifestyle> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        return ApiResultUtil.okay(service.get(id));
    }

    @ApiOperation("创建生活方式信息")
    @PostMapping
    public ApiResult<Integer> create(@RequestBody PatientLifestyle lifestyle) {
        service.create(lifestyle);
        return ApiResultUtil.okay(lifestyle.getId());
    }

    @ApiOperation("修改生活方式信息")
    @PutMapping
    public ApiResult update(@RequestBody PatientLifestyle lifestyle) {
        service.update(lifestyle);
        return ApiResultUtil.okay();
    }

}
