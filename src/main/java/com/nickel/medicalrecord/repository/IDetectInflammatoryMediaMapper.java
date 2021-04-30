package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.DetectInflammatoryMedia;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDetectInflammatoryMediaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetectInflammatoryMedia record);

    int insertSelective(DetectInflammatoryMedia record);

    DetectInflammatoryMedia selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetectInflammatoryMedia record);

    int updateByPrimaryKey(DetectInflammatoryMedia record);

    List<DetectInflammatoryMedia> selectList(@Param("type") Integer type, @Param("dataId") String dataId);

}