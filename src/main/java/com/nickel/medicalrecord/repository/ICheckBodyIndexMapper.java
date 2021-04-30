package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.CheckBodyIndex;

public interface ICheckBodyIndexMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckBodyIndex record);

    int insertSelective(CheckBodyIndex record);

    CheckBodyIndex selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckBodyIndex record);

    int updateByPrimaryKey(CheckBodyIndex record);
}