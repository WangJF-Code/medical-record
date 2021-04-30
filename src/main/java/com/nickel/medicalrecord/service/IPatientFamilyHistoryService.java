package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.PatientFamilyHistory;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IPatientFamilyHistoryService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/19 0:02
 * @Version 1.0
 */
public interface IPatientFamilyHistoryService {

    void create(PatientFamilyHistory familyHistory);

    void update(PatientFamilyHistory familyHistory);

    List<PatientFamilyHistory> getList(PatientFamilyHistory patientFamilyHistory);

    PatientFamilyHistory get(Integer id);

    List<PatientFamilyHistory> getList(String patientId);
}
