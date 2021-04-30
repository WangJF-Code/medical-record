package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.PatientLifestyle;

import java.util.List;

public interface IPatientLifestyleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientLifestyle lifestyle);

    int insertSelective(PatientLifestyle lifestyle);

    PatientLifestyle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientLifestyle lifestyle);

    int updateByPrimaryKey(PatientLifestyle lifestyle);

    List<PatientLifestyle> findListByPatientId(String patientId);

    List<PatientLifestyle> findList(PatientLifestyle lifestyle);

}