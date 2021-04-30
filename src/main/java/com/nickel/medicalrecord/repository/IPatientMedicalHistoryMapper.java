package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.PatientMedicalHistory;

import java.util.List;

public interface IPatientMedicalHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientMedicalHistory medicalHistory);

    int insertSelective(PatientMedicalHistory medicalHistory);

    PatientMedicalHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientMedicalHistory medicalHistory);

    int updateByPrimaryKey(PatientMedicalHistory medicalHistory);

    List<PatientMedicalHistory> findListByPatientId(String patientId);

    List<PatientMedicalHistory> findList(PatientMedicalHistory medicalHistory);

}