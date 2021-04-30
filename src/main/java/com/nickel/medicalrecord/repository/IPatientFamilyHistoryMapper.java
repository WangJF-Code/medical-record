package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.PatientFamilyHistory;

import java.util.List;

public interface IPatientFamilyHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientFamilyHistory familyHistory);

    int insertSelective(PatientFamilyHistory familyHistory);

    PatientFamilyHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientFamilyHistory familyHistory);

    int updateByPrimaryKey(PatientFamilyHistory familyHistory);

    List<PatientFamilyHistory> findList(PatientFamilyHistory familyHistory);

    List<PatientFamilyHistory> findListByPatientId(String patientId);

}