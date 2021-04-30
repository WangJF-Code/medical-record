package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.PatientDrugHistory;

import java.util.List;

public interface IPatientDrugHistoryMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientDrugHistory drugHistory);

    int insertSelective(PatientDrugHistory drugHistory);

    PatientDrugHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDrugHistory drugHistory);

    int updateByPrimaryKey(PatientDrugHistory drugHistory);

    List<PatientDrugHistory> findListByPatientId(String patientId);

    List<PatientDrugHistory> findList(PatientDrugHistory drugHistory);

}