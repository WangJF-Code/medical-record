package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.HospitalDiagnosticRecordsDTO;
import com.nickel.medicalrecord.model.entity.HospitalDiagnosticRecords;

import java.util.List;

public interface IHospitalDiagnosticRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HospitalDiagnosticRecords record);

    int insertSelective(HospitalDiagnosticRecords record);

    HospitalDiagnosticRecordsDTO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HospitalDiagnosticRecords record);

    int updateByPrimaryKey(HospitalDiagnosticRecords record);

    List<HospitalDiagnosticRecordsDTO> selectByHospitalRecordsId(String hospitalRecordsId);
}