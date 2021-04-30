package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.MedicationRecordDTO;
import com.nickel.medicalrecord.model.entity.MedicationRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IMedicationRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicationRecord record);

    int insertSelective(MedicationRecord record);

    MedicationRecordDTO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MedicationRecord record);

    int updateByPrimaryKey(MedicationRecord record);

    List<MedicationRecordDTO> getList(@Param("type") Integer type, @Param("dataId") String dataId);
}