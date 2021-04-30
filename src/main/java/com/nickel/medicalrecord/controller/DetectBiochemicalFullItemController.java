package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.entity.DetectBiochemicalFullItem;
import com.nickel.medicalrecord.service.IDetectBiochemicalFullItemService;
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
 * @ClassName DetectBiochemicalFullItemController
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 22:47
 * @Version 1.0
 */
@Api(tags = "辅助检查-生化全项相关接口")
@RestController
@RequestMapping("/api/biochemicalFullItem")
public class DetectBiochemicalFullItemController {

    private IDetectBiochemicalFullItemService service;

    @Autowired
    public void setService(IDetectBiochemicalFullItemService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<DetectBiochemicalFullItem>> list(@ApiParam(required = true, value = "type") Integer type,
                                                           @ApiParam(required = true, value = "dataId") String dataId) {
        List<DetectBiochemicalFullItem> list = service.getList(type, dataId);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<DetectBiochemicalFullItem> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        DetectBiochemicalFullItem info = service.get(id);
        return ApiResultUtil.okay(info);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody DetectBiochemicalFullItem updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody DetectBiochemicalFullItem createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}
