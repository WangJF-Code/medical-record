package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.entity.Patient;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IUserService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/18 1:32
 * @Version 1.0
 */
public interface IPatientService {

    void create(Patient patient);

    void update(Patient patient);

    List<Patient> getList(Patient patient);

    Page<Patient> getPage(Patient patient, Integer pageIndex, Integer pageSize);

    Patient get(String id);
}
