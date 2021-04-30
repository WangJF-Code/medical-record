package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.DetectItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDetectItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetectItem record);

    int insertSelective(DetectItem record);

    DetectItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetectItem record);

    int updateByPrimaryKey(DetectItem record);

    List<DetectItem> selectList(@Param("type") Integer type, @Param("dataId") String dataId, @Param("detectType") Integer detectType);
}