package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.DetectEkgCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectEkgDTO;
import com.nickel.medicalrecord.model.dto.DetectEkgUpdateDTO;
import com.nickel.medicalrecord.service.IDetectEkgService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "辅助检查-心电图相关接口")
@RestController
@RequestMapping("/api/ekg")
public class DetectEkgController {

    private IDetectEkgService service;

    @Autowired
    public void setService(IDetectEkgService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<DetectEkgDTO>> list(@ApiParam(required = true, value = "type") @RequestParam Integer type,
                                              @ApiParam(required = true, value = "dataId") @RequestParam String dataId) {
        List<DetectEkgDTO> list = service.getList(type, dataId);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<DetectEkgDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        DetectEkgDTO info = service.get(id);
        return ApiResultUtil.okay(info);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody DetectEkgUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody DetectEkgCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}