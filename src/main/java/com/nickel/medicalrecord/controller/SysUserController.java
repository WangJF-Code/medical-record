package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.error.ServerException;
import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.SysUserConditionDTO;
import com.nickel.medicalrecord.model.dto.SysUserCreateDTO;
import com.nickel.medicalrecord.model.dto.SysUserDTO;
import com.nickel.medicalrecord.model.dto.SysUserUpdateDTO;
import com.nickel.medicalrecord.service.ISysUserService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "系统用户相关接口")
@RestController
@RequestMapping("/api/user")
public class SysUserController {

    private ISysUserService service;

    @Autowired
    public void setService(ISysUserService service) {
        this.service = service;
    }

    @ApiOperation("重置密码")
    @PostMapping("/updatePassword")
    public ApiResult updatePassword(@ApiParam(value = "密码") @RequestParam String oldPassword,
                                    @ApiParam(value = "密码") @RequestParam String newPassword) {
        service.updatePassword(oldPassword, newPassword);
        return ApiResultUtil.okay();
    }

    @ApiOperation("重置密码")
    @PostMapping("/reset")
    public ApiResult resetPassword(@ApiParam(value = "账号") @RequestParam String account,
                                   @ApiParam(value = "验证码") @RequestParam String authCode) {
        service.resetPassword(account, authCode);
        return ApiResultUtil.okay();
    }

    @ApiOperation("登陆")
    @PostMapping("/login")
    public ApiResult<SysUserDTO> login(@ApiParam(value = "账号") @RequestParam String account,
                                       @ApiParam(value = "密码") @RequestParam String password,
                                       @ApiParam(value = "验证码") @RequestParam String authCode) {
        SysUserDTO dto = service.login(account, password, authCode);
        return ApiResultUtil.okay(dto);
    }

    @ApiOperation("分页列表信息")
    @PostMapping("/page")
    public ApiResult<Page<SysUserDTO>> list(@ApiParam(value = "当前页号", defaultValue = "1") @RequestParam(required = false, defaultValue = "1") Integer pageCurrent,
                                            @ApiParam(value = "每页显示条数", defaultValue = "10") @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                            @RequestBody SysUserConditionDTO conditionDTO) {
        if (pageCurrent < 1) {
            pageCurrent = 1;
        }
        Page<SysUserDTO> page = service.getPage(conditionDTO, pageCurrent, pageSize);
        return ApiResultUtil.okay(page);
    }

    @ApiOperation("列表信息")
    @PostMapping("/list")
    public ApiResult<List<SysUserDTO>> list(@RequestBody SysUserConditionDTO conditionDTO) {
        List<SysUserDTO> list = service.getList(conditionDTO);
        return ApiResultUtil.okay(list);
    }

    @ApiOperation("详细信息")
    @GetMapping("/{id}")
    public ApiResult<SysUserDTO> info(@ApiParam(required = true, value = "id") @PathVariable Integer id) {
        SysUserDTO dto = service.get(id);
        return ApiResultUtil.okay(dto);
    }

    @ApiOperation("修改信息")
    @PutMapping
    public ApiResult update(@RequestBody SysUserUpdateDTO updateDTO) throws ServerException {
        service.update(updateDTO);
        return ApiResultUtil.okay();
    }

    @ApiOperation("创建信息")
    @PostMapping
    public ApiResult create(@RequestBody SysUserCreateDTO createDTO) throws ServerException {
        service.create(createDTO);
        return ApiResultUtil.okay();
    }

}
