package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.PatientDrugHistory;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IPatientDrugHistoryService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/18 23:30
 * @Version 1.0
 */
public interface IPatientDrugHistoryService {

    void create(PatientDrugHistory drugHistory);

    void update(PatientDrugHistory drugHistory);

    List<PatientDrugHistory> getList(PatientDrugHistory drugHistory);

    List<PatientDrugHistory> getList(String patientId);

    PatientDrugHistory get(Integer id);

}
