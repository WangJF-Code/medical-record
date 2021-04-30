package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.DetectClottingRoutine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDetectClottingRoutineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetectClottingRoutine record);

    int insertSelective(DetectClottingRoutine record);

    DetectClottingRoutine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetectClottingRoutine record);

    int updateByPrimaryKey(DetectClottingRoutine record);

    List<DetectClottingRoutine> selectList(@Param("type") Integer type, @Param("dataId") String dataId);

}