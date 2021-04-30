package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.DetectBloodRoutine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDetectBloodRoutineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetectBloodRoutine record);

    int insertSelective(DetectBloodRoutine record);

    DetectBloodRoutine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetectBloodRoutine record);

    int updateByPrimaryKey(DetectBloodRoutine record);

    List<DetectBloodRoutine> selectList(@Param("type") Integer type, @Param("dataId") String dataId);
}