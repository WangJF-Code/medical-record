package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.PatientLifestyle;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IPatientLifestyleService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/19 0:05
 * @Version 1.0
 */
public interface IPatientLifestyleService {

    void create(PatientLifestyle lifestyle);

    void update(PatientLifestyle lifestyle);

    List<PatientLifestyle> getList(String patientId);

    List<PatientLifestyle> getList(PatientLifestyle lifestyle);

    PatientLifestyle get(Integer id);

}
