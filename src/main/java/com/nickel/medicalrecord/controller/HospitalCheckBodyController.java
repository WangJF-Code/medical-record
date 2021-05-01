package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.*;
import com.nickel.medicalrecord.model.entity.CheckBodyIndex;
import com.nickel.medicalrecord.model.entity.CheckEvaluationIndex;
import com.nickel.medicalrecord.model.entity.HospitalCheckBody;
import com.nickel.medicalrecord.model.entity.HospitalRecords;
import com.nickel.medicalrecord.service.IHospitalCheckBodyService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName HospitalCheckBodyController
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 14:49
 * @Version 1.0
 */
@Api(tags = "病例-入院查体及出院评估相关接口")
@RestController
@RequestMapping("/api/hospitalCheckBody")
public class HospitalCheckBodyController {

    private IHospitalCheckBodyService service;

    @Autowired
    public void setService(IHospitalCheckBodyService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list/{hospitalRecordsId}")
    public ApiResult<List<HospitalCheckBodyDTO>> list(@ApiParam(required = true, value = "id") @PathVariable String hospitalRecordsId) {
        return ApiResultUtil.okay(service.getList(hospitalRecordsId));
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<HospitalCheckBodyDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        return ApiResultUtil.okay(service.get(id));
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody HospitalCheckBodyCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody HospitalCheckBodyUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

}
