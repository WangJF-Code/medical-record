package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.MedicationDrugRecord;

public interface IMedicationDrugRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicationDrugRecord record);

    int insertSelective(MedicationDrugRecord record);

    MedicationDrugRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MedicationDrugRecord record);

    int updateByPrimaryKey(MedicationDrugRecord record);

    void deleteByMedicationRecordId(Integer medicationRecordId);
}