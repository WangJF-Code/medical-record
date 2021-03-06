package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.DetectInflammatoryMediaCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectInflammatoryMediaDTO;
import com.nickel.medicalrecord.model.dto.DetectInflammatoryMediaUpdateDTO;
import com.nickel.medicalrecord.service.IDetectInflammatoryMediaService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "辅助检查-炎症介质相关接口")
@RestController
@RequestMapping("/api/inflammatoryMedia")
public class DetectInflammatoryMediaController {

    private IDetectInflammatoryMediaService service;

    @Autowired
    public void setService(IDetectInflammatoryMediaService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<DetectInflammatoryMediaDTO>> list(@ApiParam(required = true, value = "type") @RequestParam Integer type,
                                                         @ApiParam(required = true, value = "dataId") @RequestParam String dataId) {
        List<DetectInflammatoryMediaDTO> list = service.getList(type, dataId);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<DetectInflammatoryMediaDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        DetectInflammatoryMediaDTO info = service.get(id);
        return ApiResultUtil.okay(info);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody DetectInflammatoryMediaUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody DetectInflammatoryMediaCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}