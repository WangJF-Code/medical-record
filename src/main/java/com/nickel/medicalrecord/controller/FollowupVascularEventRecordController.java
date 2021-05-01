package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.FollowupVascularEventRecordCreateDTO;
import com.nickel.medicalrecord.model.dto.FollowupVascularEventRecordDTO;
import com.nickel.medicalrecord.model.dto.FollowupVascularEventRecordUpdateDTO;
import com.nickel.medicalrecord.service.IFollowupVascularEventRecordService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "随访-血管事件测评记录相关接口")
@RestController
@RequestMapping("/api/followupVascularEventRecord")
public class FollowupVascularEventRecordController {

    private IFollowupVascularEventRecordService service;

    @Autowired
    public void setService(IFollowupVascularEventRecordService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list/{followupRecordsId}")
    public ApiResult<List<FollowupVascularEventRecordDTO>> list(@ApiParam(required = true, value = "id") @PathVariable String followupRecordsId) {
        List<FollowupVascularEventRecordDTO> list = service.getList(followupRecordsId);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<FollowupVascularEventRecordDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        FollowupVascularEventRecordDTO dto = service.get(id);
        return ApiResultUtil.okay(dto);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody FollowupVascularEventRecordUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody FollowupVascularEventRecordCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}
