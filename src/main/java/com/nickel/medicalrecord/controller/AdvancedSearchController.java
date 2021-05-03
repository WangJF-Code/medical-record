package com.nickel.medicalrecord.controller;


import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.*;
import com.nickel.medicalrecord.service.IAdvancedSearchService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "高级搜索相关接口")
@RestController
@RequestMapping("/api/search")
public class AdvancedSearchController {

    private IAdvancedSearchService service;

    @Autowired
    public void setService(IAdvancedSearchService service) {
        this.service = service;
    }

    @ApiOperation("病历列表信息")
    @PostMapping("/hospitalList")
    public ApiResult<Page<HospitalRecordsDTO>> hospitalList(@ApiParam(value = "当前页号", defaultValue = "1") @RequestParam(required = false, defaultValue = "1") Integer pageCurrent,
                                                            @ApiParam(value = "每页显示条数", defaultValue = "10") @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                                            @RequestBody AdvancedSearchHospitalDTO search) {
        Page<HospitalRecordsDTO> page = service.hospitalList(search, pageCurrent, pageSize);
        return ApiResultUtil.okay(page);
    }

    @ApiOperation("随访列表信息")
    @PostMapping("/followupList")
    public ApiResult<Page<HospitalFollowupDTO>> followupList(@ApiParam(value = "当前页号", defaultValue = "1") @RequestParam(required = false, defaultValue = "1") Integer pageCurrent,
                                                             @ApiParam(value = "每页显示条数", defaultValue = "10") @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                                             @RequestBody AdvancedSearchFollowupDTO search) {
        Page<HospitalFollowupDTO> page = service.followupList(search, pageCurrent, pageSize);
        return ApiResultUtil.okay(page);
    }

    @ApiOperation("辅助检查列表信息")
    @PostMapping("/auxiliaryCheck")
    public ApiResult<AuxiliaryCheckDTO> getAuxiliaryCheck(@ApiParam(required = true, value = "type") @RequestParam Integer type,
                                                          @ApiParam(required = true, value = "dataId") @RequestParam String dataId) {
        AuxiliaryCheckDTO dto = service.getAuxiliaryCheck(type, dataId);
        return ApiResultUtil.okay(dto);
    }

}
