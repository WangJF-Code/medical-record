package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.DetectThirteenBloodLipids;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDetectThirteenBloodLipidsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetectThirteenBloodLipids record);

    int insertSelective(DetectThirteenBloodLipids record);

    DetectThirteenBloodLipids selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetectThirteenBloodLipids record);

    int updateByPrimaryKey(DetectThirteenBloodLipids record);

    List<DetectThirteenBloodLipids> selectList(@Param("type") Integer type, @Param("dataId") String dataId);

}