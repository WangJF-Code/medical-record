package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.DetectEkg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDetectEkgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetectEkg record);

    int insertSelective(DetectEkg record);

    DetectEkg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetectEkg record);

    int updateByPrimaryKey(DetectEkg record);

    List<DetectEkg> selectList(@Param("type") Integer type, @Param("dataId") String dataId);

}