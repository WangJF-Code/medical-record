package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.DetectAntiplateletDrugGenesDTO;
import com.nickel.medicalrecord.service.IDetectAntiplateletDrugGenesService;
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
 * @ClassName DetectAntiplateletDrugGenesController
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 22:33
 * @Version 1.0
 */
@Api(tags = "辅助检查-抗血小板药物基因检测相关接口")
@RestController
@RequestMapping("/api/drugGenes")
public class DetectAntiplateletDrugGenesController {

    private IDetectAntiplateletDrugGenesService service;

    @Autowired
    public void setService(IDetectAntiplateletDrugGenesService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<DetectAntiplateletDrugGenesDTO>> list(@ApiParam(required = true, value = "type") Integer type,
                                                                @ApiParam(required = true, value = "dataId") String dataId) {
        return ApiResultUtil.okay(service.getList(type, dataId));
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<DetectAntiplateletDrugGenesDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        return ApiResultUtil.okay(service.get(id));
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody DetectAntiplateletDrugGenesDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody DetectAntiplateletDrugGenesDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}
