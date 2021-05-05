package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.error.ServerException;
import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.api.ApiCode;
import com.nickel.medicalrecord.model.dto.SysUserConditionDTO;
import com.nickel.medicalrecord.model.dto.SysUserCreateDTO;
import com.nickel.medicalrecord.model.dto.SysUserDTO;
import com.nickel.medicalrecord.model.dto.SysUserUpdateDTO;
import com.nickel.medicalrecord.model.entity.SysUser;
import com.nickel.medicalrecord.repository.ISysUserMapper;
import com.nickel.medicalrecord.service.ISysUserService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class SysUserService implements ISysUserService {

    private ISysUserMapper mapper;

    @Autowired
    public void setMapper(ISysUserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Page<SysUserDTO> getPage(SysUserConditionDTO conditionDTO, Integer pageCurrent, Integer pageSize) {
        Integer count = mapper.selectPageCount(conditionDTO);
        List<SysUser> list = mapper.selectPage(conditionDTO, pageCurrent * pageSize - pageSize, pageSize);
        return Page.<SysUserDTO>builder()
                .count(count)
                .currPage(pageCurrent)
                .pageSize(pageSize)
                .data(list.stream().map(EntityTransformUtils::transform).collect(Collectors.toList()))
                .build();
    }

    @Override
    public List<SysUserDTO> getList(SysUserConditionDTO conditionDTO) {
        List<SysUser> list = mapper.selectList(conditionDTO);
        return list.stream().map(EntityTransformUtils::transform).collect(Collectors.toList());
    }

    @Override
    public SysUserDTO get(Integer id) {
        SysUser sysUser = mapper.selectByPrimaryKey(id);
        return EntityTransformUtils.transform(sysUser);
    }

    @Override
    public void update(SysUserUpdateDTO updateDTO) throws ServerException {
        checkUser(updateDTO.getAccount(), updateDTO.getPhoneNumber());
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(SysUserCreateDTO createDTO) throws ServerException {
        checkUser(createDTO.getAccount(), createDTO.getPhoneNumber());
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

    @Override
    public void updatePassword(String oldPassword, String newPassword) {

    }

    @Override
    public void resetPassword(String account, String authCode) {
    }

    @Override
    public SysUserDTO login(String account, String password, String authCode) {
        return null;
    }

    @Override
    public void getAuthCode(String account) {

    }

    private void checkUser(String account, String phoneNumber) throws ServerException {
        Integer accountCount = mapper.selectByAccountCount(account);
        if (accountCount > 0) {
            throw new ServerException(ApiCode.PARAMS_EXCEPTION, "账号重复");
        }
        Integer phoneNumberCount = mapper.selectByPhoneNumberCount(phoneNumber);
        if (phoneNumberCount > 0) {
            throw new ServerException(ApiCode.PARAMS_EXCEPTION, "手机号重复");
        }
    }

}
