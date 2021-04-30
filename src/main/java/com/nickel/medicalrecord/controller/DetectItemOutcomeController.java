package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.DetectItemOutcomeDTO;
import com.nickel.medicalrecord.service.IDetectItemService;
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
 * @ClassName DetectItemController
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/29 0:10
 * @Version 1.0
 */
@Api(tags = "辅助检查-单结果类检查项相关接口")
@RestController
@RequestMapping("/api/detectItem/outcome")
public class DetectItemOutcomeController {

    private IDetectItemService service;

    @Autowired
    public void setService(IDetectItemService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<DetectItemOutcomeDTO>> list(@ApiParam(required = true, value = "type") Integer type,
                                                      @ApiParam(required = true, value = "dataId") String dataId,
                                                      @ApiParam(required = true, value = "detectType") Integer detectType) {
        List<DetectItemOutcomeDTO> list = service.getListOutcome(type, dataId, detectType);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<DetectItemOutcomeDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        DetectItemOutcomeDTO info = service.getOutcome(id);
        return ApiResultUtil.okay(info);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody DetectItemOutcomeDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody DetectItemOutcomeDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }


}
