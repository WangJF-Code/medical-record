package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.SysUserConditionDTO;
import com.nickel.medicalrecord.model.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> selectList(SysUserConditionDTO conditionDTO);

    Integer selectPageCount(SysUserConditionDTO conditionDTO);

    List<SysUser> selectPage(@Param("conditionDTO") SysUserConditionDTO conditionDTO, @Param("index") Integer index, @Param("size") Integer size);

    Integer selectByAccountCount(String account);

    Integer selectByPhoneNumberCount(String phoneNumber);
}