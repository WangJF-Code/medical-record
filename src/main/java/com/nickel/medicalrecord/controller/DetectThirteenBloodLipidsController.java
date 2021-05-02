package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.DetectThirteenBloodLipidsCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectThirteenBloodLipidsDTO;
import com.nickel.medicalrecord.model.dto.DetectThirteenBloodLipidsUpdateDTO;
import com.nickel.medicalrecord.service.IDetectThirteenBloodLipidsService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "辅助检查-血脂十三项相关接口")
@RestController
@RequestMapping("/api/thirteenBloodLipids")
public class DetectThirteenBloodLipidsController {

    private IDetectThirteenBloodLipidsService service;

    @Autowired
    public void setService(IDetectThirteenBloodLipidsService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<DetectThirteenBloodLipidsDTO>> list(@ApiParam(required = true, value = "type") @RequestParam Integer type,
                                                              @ApiParam(required = true, value = "dataId") @RequestParam String dataId) {
        List<DetectThirteenBloodLipidsDTO> list = service.getList(type, dataId);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<DetectThirteenBloodLipidsDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        DetectThirteenBloodLipidsDTO info = service.get(id);
        return ApiResultUtil.okay(info);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody DetectThirteenBloodLipidsUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody DetectThirteenBloodLipidsCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}