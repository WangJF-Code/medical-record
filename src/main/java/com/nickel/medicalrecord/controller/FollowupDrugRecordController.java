package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.FollowupDrugRecordDTO;
import com.nickel.medicalrecord.model.dto.FollowupDrugRecordSaveDTO;
import com.nickel.medicalrecord.service.IFollowupDrugRecordService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "随访-服药记录相关接口")
@RestController
@RequestMapping("/api/followupDrugRecord")
public class FollowupDrugRecordController {

    private IFollowupDrugRecordService service;

    @Autowired
    public void setService(IFollowupDrugRecordService service) {
        this.service = service;
    }

    @ApiOperation("详细信息")
    @GetMapping("/{followupRecordsId}")
    public ApiResult<FollowupDrugRecordDTO> info(@ApiParam(required = true, value = "followupRecordsId") @PathVariable String followupRecordsId) {
        FollowupDrugRecordDTO dto = service.get(followupRecordsId);
        return ApiResultUtil.okay(dto);
    }

    @ApiOperation("保存信息")
    @PutMapping
    public ApiResult save(@RequestBody FollowupDrugRecordSaveDTO saveDTO) {
        service.save(saveDTO);
        return ApiResultUtil.okay();
    }

}
