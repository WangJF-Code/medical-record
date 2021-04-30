package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.DetectBiochemicalFullItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDetectBiochemicalFullItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetectBiochemicalFullItem record);

    int insertSelective(DetectBiochemicalFullItem record);

    DetectBiochemicalFullItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetectBiochemicalFullItem record);

    int updateByPrimaryKey(DetectBiochemicalFullItem record);

    List<DetectBiochemicalFullItem> selectList(@Param("type") Integer type, @Param("dataId") String dataId);
}