package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.MedicationRecordDTO;
import com.nickel.medicalrecord.service.IMedicationRecordService;
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
 * @ClassName MedicationRecordController
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 21:46
 * @Version 1.0
 */
@Api(tags = "用药记录相关接口")
@RestController
@RequestMapping("/api/medicationRecord")
public class MedicationRecordController {

    private IMedicationRecordService service;

    @Autowired
    public void setService(IMedicationRecordService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<MedicationRecordDTO>> list(@ApiParam(required = true, value = "type") @RequestParam Integer type,
                                                     @ApiParam(required = true, value = "dataId") @RequestParam String dataId) {
        return ApiResultUtil.okay(service.getList(type, dataId));
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<MedicationRecordDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        return ApiResultUtil.okay(service.get(id));
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody MedicationRecordDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody MedicationRecordDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}
