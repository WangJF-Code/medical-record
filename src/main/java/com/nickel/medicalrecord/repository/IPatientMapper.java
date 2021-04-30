package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.Patient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IPatientMapper {
    int deleteByPrimaryKey(String id);

    int insert(Patient patient);

    int insertSelective(Patient patient);

    Patient selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Patient patient);

    int updateByPrimaryKey(Patient patient);

    Integer findCount(Patient patient);

    List<Patient> findPage(@Param("patient") Patient patient, @Param("index") Integer index, @Param("size") Integer size);

    List<Patient> findList(Patient patient);

    Integer findTodayCount(String id);
}