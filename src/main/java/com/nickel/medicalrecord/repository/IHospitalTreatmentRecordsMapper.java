package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.HospitalTreatmentRecordsDTO;
import com.nickel.medicalrecord.model.entity.HospitalTreatmentRecords;

import java.util.List;

public interface IHospitalTreatmentRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HospitalTreatmentRecords record);

    int insertSelective(HospitalTreatmentRecords record);

    HospitalTreatmentRecordsDTO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HospitalTreatmentRecords record);

    int updateByPrimaryKey(HospitalTreatmentRecords record);

    List<HospitalTreatmentRecordsDTO> selectByHospitalRecordsId(String hospitalRecordsId);
}