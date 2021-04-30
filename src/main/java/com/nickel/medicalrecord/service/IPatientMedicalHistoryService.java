package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.PatientMedicalHistory;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IPatientMedicalHistoryService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/19 0:09
 * @Version 1.0
 */
public interface IPatientMedicalHistoryService {

    void create(PatientMedicalHistory medicalHistory);

    void update(PatientMedicalHistory medicalHistory);

    List<PatientMedicalHistory> getList(PatientMedicalHistory medicalHistory);

    PatientMedicalHistory get(Integer id);

    List<PatientMedicalHistory> getList(String patientId);
}
