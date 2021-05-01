package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.FollowupCheckBodyCreateDTO;
import com.nickel.medicalrecord.model.dto.FollowupCheckBodyDTO;
import com.nickel.medicalrecord.model.dto.FollowupCheckBodyUpdateDTO;
import com.nickel.medicalrecord.service.IFollowupCheckBodyService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "随访-查体相关接口")
@RestController
@RequestMapping("/api/followupCheckBody")
public class FollowupCheckBodyController {

    private IFollowupCheckBodyService service;

    @Autowired
    public void setService(IFollowupCheckBodyService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list/{followupRecordsId}")
    public ApiResult<List<FollowupCheckBodyDTO>> list(@ApiParam(required = true, value = "id") @PathVariable String followupRecordsId) {
        List<FollowupCheckBodyDTO> list = service.getList(followupRecordsId);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<FollowupCheckBodyDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        FollowupCheckBodyDTO dto = service.get(id);
        return ApiResultUtil.okay(dto);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody FollowupCheckBodyUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody FollowupCheckBodyCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}
