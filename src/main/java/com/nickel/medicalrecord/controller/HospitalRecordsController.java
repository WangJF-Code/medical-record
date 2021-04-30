package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.HospitalRecordsConditionDTO;
import com.nickel.medicalrecord.model.dto.HospitalRecordsCreateDTO;
import com.nickel.medicalrecord.model.dto.HospitalRecordsDTO;
import com.nickel.medicalrecord.model.dto.HospitalRecordsUpdateDTO;
import com.nickel.medicalrecord.model.entity.HospitalRecords;
import com.nickel.medicalrecord.service.IHospitalRecordsService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName HospitalRecordsController
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 11:18
 * @Version 1.0
 */
@Api(tags = "病例相关接口")
@RestController
@RequestMapping("/api/hospitalRecords")
public class HospitalRecordsController {

    private IHospitalRecordsService service;

    @Autowired
    public void setService(IHospitalRecordsService service) {
        this.service = service;
    }

    @ApiOperation("分页列表信息")
    @PostMapping("/page")
    public ApiResult<Page<HospitalRecordsDTO>> list(@ApiParam(value = "当前页号", defaultValue = "1") @RequestParam(required = false, defaultValue = "1") Integer pageCurrent,
                                                    @ApiParam(value = "每页显示条数", defaultValue = "10") @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                                    @RequestBody HospitalRecordsConditionDTO conditionDTO) {
        if (pageCurrent < 1) {
            pageCurrent = 1;
        }
        return ApiResultUtil.okay(service.getPage(conditionDTO, pageCurrent, pageSize));
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<HospitalRecordsDTO>> list(@RequestBody HospitalRecordsConditionDTO conditionDTO) {
        return ApiResultUtil.okay(service.getList(conditionDTO));
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<HospitalRecordsDTO> info(@ApiParam(required = true, value = "id") @PathVariable String id) {
        return ApiResultUtil.okay(service.get(id));
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody HospitalRecordsCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody HospitalRecordsUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

}
