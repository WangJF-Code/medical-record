package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.DetectAntiplateletDrugGenes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDetectAntiplateletDrugGenesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetectAntiplateletDrugGenes record);

    int insertSelective(DetectAntiplateletDrugGenes record);

    DetectAntiplateletDrugGenes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetectAntiplateletDrugGenes record);

    int updateByPrimaryKey(DetectAntiplateletDrugGenes record);

    List<DetectAntiplateletDrugGenes> selectList(@Param("type") Integer type, @Param("dataId") String dataId);
}