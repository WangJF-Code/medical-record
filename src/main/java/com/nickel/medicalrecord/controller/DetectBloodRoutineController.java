package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.DetectBloodRoutineCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectBloodRoutineDTO;
import com.nickel.medicalrecord.model.dto.DetectBloodRoutineUpdateDTO;
import com.nickel.medicalrecord.service.IDetectBloodRoutineService;
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
 * @ClassName DetectBloodRoutineController
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:22
 * @Version 1.0
 */
@Api(tags = "辅助检查-血常规相关接口")
@RestController
@RequestMapping("/api/bloodRoutine")
public class DetectBloodRoutineController {

    private IDetectBloodRoutineService service;

    @Autowired
    public void setService(IDetectBloodRoutineService service) {
        this.service = service;
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<DetectBloodRoutineDTO>> list(@ApiParam(required = true, value = "type") @RequestParam Integer type,
                                                    @ApiParam(required = true, value = "dataId") @RequestParam String dataId) {
        List<DetectBloodRoutineDTO> list = service.getList(type, dataId);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<DetectBloodRoutineDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        DetectBloodRoutineDTO info = service.get(id);
        return ApiResultUtil.okay(info);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody DetectBloodRoutineUpdateDTO updateDTO) {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody DetectBloodRoutineCreateDTO createDTO) {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}
