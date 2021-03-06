package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.error.ServerException;
import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.dto.SysUserConditionDTO;
import com.nickel.medicalrecord.model.dto.SysUserCreateDTO;
import com.nickel.medicalrecord.model.dto.SysUserDTO;
import com.nickel.medicalrecord.model.dto.SysUserUpdateDTO;
import com.nickel.medicalrecord.model.entity.SysUser;

import java.util.List;

public interface ISysUserService {
    Page<SysUserDTO> getPage(SysUserConditionDTO conditionDTO, Integer pageCurrent, Integer pageSize);

    List<SysUserDTO> getList(SysUserConditionDTO conditionDTO);

    SysUserDTO get(Integer id);

    void update(SysUserUpdateDTO updateDTO) throws ServerException;

    void create(SysUserCreateDTO createDTO) throws ServerException;

    void updatePassword(String account, String newPassword) throws ServerException;

    void resetPassword(String account, String authCode);

    SysUser login(String account, String password, String authCode) throws ServerException;

    void getAuthCode(String account);
}
