package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.FollowupRecordsConditionDTO;
import com.nickel.medicalrecord.model.dto.FollowupRecordsCreateDTO;
import com.nickel.medicalrecord.model.dto.FollowupRecordsDTO;
import com.nickel.medicalrecord.model.dto.FollowupRecordsUpdateDTO;
import com.nickel.medicalrecord.service.IFollowupRecordsService;
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
 * @ClassName FollowupRecordsController
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 11:18
 * @Version 1.0
 */
@Api(tags = "随访相关接口")
@RestController
@RequestMapping("/api/followupRecords")
public class FollowupRecordsController {

    private IFollowupRecordsService service;

    @Autowired
    public void setService(IFollowupRecordsService service) {
        this.service = service;
    }

    @ApiOperation("分页列表信息")
    @PostMapping("/page")
    public ApiResult<Page<FollowupRecordsDTO>> list(@ApiParam(value = "当前页号", defaultValue = "1") @RequestParam(required = false, defaultValue = "1") Integer pageCurrent,
                                                    @ApiParam(value = "每页显示条数", defaultValue = "10") @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                                    @RequestBody FollowupRecordsConditionDTO conditionDTO) {
        if (pageCurrent < 1) {
            pageCurrent = 1;
        }
        Page<FollowupRecordsDTO> page = service.getPage(conditionDTO, pageCurrent, pageSize);
        return ApiResultUtil.okay(page);
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<FollowupRecordsDTO>> list(@RequestBody FollowupRecordsConditionDTO conditionDTO) {
        List<FollowupRecordsDTO> list = service.getList(conditionDTO);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<FollowupRecordsDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        FollowupRecordsDTO dto = service.get(id);
        return ApiResultUtil.okay(dto);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody FollowupRecordsUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody FollowupRecordsCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}
