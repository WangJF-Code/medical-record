package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.DetectSwi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDetectSwiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetectSwi record);

    int insertSelective(DetectSwi record);

    DetectSwi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetectSwi record);

    int updateByPrimaryKey(DetectSwi record);

    List<DetectSwi> selectList(@Param("type") Integer type, @Param("dataId") String dataId);

}