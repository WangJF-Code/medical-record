package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.FollowupOnsetRecordDTO;
import com.nickel.medicalrecord.model.dto.FollowupOnsetRecordSaveDTO;
import com.nickel.medicalrecord.service.IFollowupOnsetRecordService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "随访-发病记录相关接口")
@RestController
@RequestMapping("/api/followupOnsetRecord")
public class FollowupOnsetRecordController {

    private IFollowupOnsetRecordService service;

    @Autowired
    public void setService(IFollowupOnsetRecordService service) {
        this.service = service;
    }

    @ApiOperation("详细信息")
    @GetMapping("/{followupRecordsId}")
    public ApiResult<FollowupOnsetRecordDTO> info(@ApiParam(required = true, value = "followupRecordsId") @PathVariable String followupRecordsId) {
        FollowupOnsetRecordDTO dto = service.get(followupRecordsId);
        return ApiResultUtil.okay(dto);
    }

    @ApiOperation("保存信息")
    @PutMapping
    public ApiResult save(@ApiParam(required = true, value = "saveDTO") @RequestBody FollowupOnsetRecordSaveDTO saveDTO) {
        service.save(saveDTO);
        return ApiResultUtil.okay();
    }

}
