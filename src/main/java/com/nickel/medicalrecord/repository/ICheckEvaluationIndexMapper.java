package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.CheckEvaluationIndex;

public interface ICheckEvaluationIndexMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckEvaluationIndex record);

    int insertSelective(CheckEvaluationIndex record);

    CheckEvaluationIndex selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckEvaluationIndex record);

    int updateByPrimaryKey(CheckEvaluationIndex record);
}