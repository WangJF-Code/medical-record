package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.DetectThyroidFunction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDetectThyroidFunctionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetectThyroidFunction record);

    int insertSelective(DetectThyroidFunction record);

    DetectThyroidFunction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetectThyroidFunction record);

    int updateByPrimaryKey(DetectThyroidFunction record);

    List<DetectThyroidFunction> selectList(@Param("type") Integer type, @Param("dataId") String dataId);

}