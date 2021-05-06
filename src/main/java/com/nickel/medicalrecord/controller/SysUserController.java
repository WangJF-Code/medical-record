package com.nickel.medicalrecord.controller;

import com.nickel.medicalrecord.consts.ServerConsts;
import com.nickel.medicalrecord.error.ServerException;
import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.api.ApiCode;
import com.nickel.medicalrecord.model.api.ApiResult;
import com.nickel.medicalrecord.model.dto.SysUserConditionDTO;
import com.nickel.medicalrecord.model.dto.SysUserCreateDTO;
import com.nickel.medicalrecord.model.dto.SysUserDTO;
import com.nickel.medicalrecord.model.dto.SysUserUpdateDTO;
import com.nickel.medicalrecord.model.entity.SysUser;
import com.nickel.medicalrecord.service.ISysUserService;
import com.nickel.medicalrecord.util.ApiResultUtil;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    @ApiOperation("修改密码")
    @PostMapping("/updatePassword")
    public ApiResult updatePassword(HttpServletRequest request, @ApiParam(value = "密码") @RequestParam String oldPassword,
                                    @ApiParam(value = "密码") @RequestParam String newPassword) {
        HttpSession session = request.getSession(false);
        SysUser user = (SysUser) session.getAttribute(ServerConsts.CURRENT_USER);
        if (!user.getPassword().equals(oldPassword)) {
            return ApiResultUtil.result(ApiCode.PARAMS_EXCEPTION, "密码错误", null);
        }
        try {
            service.updatePassword(user.getAccount(), newPassword);
            session.invalidate();
            return ApiResultUtil.okay();
        } catch (ServerException e) {
            return ApiResultUtil.error(e);
        }
    }

    @ApiOperation("重置密码")
    @PostMapping("/reset")
    public ApiResult resetPassword(@ApiParam(value = "账号") @RequestParam String account,
                                   @ApiParam(value = "验证码") @RequestParam String authCode) {
        service.resetPassword(account, authCode);
        return ApiResultUtil.okay();
    }

    @ApiOperation("获取验证码")
    @PostMapping("/authCode")
    public ApiResult getAuthCode(@ApiParam(value = "账号") @RequestParam String account) {
        service.getAuthCode(account);
        return ApiResultUtil.okay();
    }

    @ApiOperation("登陆")
    @PostMapping("/login")
    public ApiResult<SysUserDTO> login(HttpServletRequest request, @ApiParam(value = "账号") @RequestParam String account,
                                       @ApiParam(value = "密码") @RequestParam String password,
                                       @ApiParam(value = "验证码") @RequestParam String authCode) {
        try {
            SysUser user = service.login(account, password, authCode);
            HttpSession session = request.getSession(true);
            session.setAttribute(ServerConsts.CURRENT_USER, user);
            return ApiResultUtil.okay(EntityTransformUtils.transform(user));
        } catch (ServerException e) {
            return ApiResultUtil.error(e);
        }
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
