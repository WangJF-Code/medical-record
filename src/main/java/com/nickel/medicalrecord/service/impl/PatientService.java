package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.entity.Patient;
import com.nickel.medicalrecord.repository.IPatientMapper;
import com.nickel.medicalrecord.service.IPatientService;
import com.nickel.medicalrecord.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class PatientService implements IPatientService {

    public static final String ID_HEAD = "ID";

    private IPatientMapper patientMapper;

    @Autowired
    public void setPatientMapper(IPatientMapper patientMapper) {
        this.patientMapper = patientMapper;
    }

    @Override
    @Transactional
    public void create(Patient patient) {
        Integer count = patientMapper.findTodayCount(IdUtil.getToday(ID_HEAD));
        patient.setId(IdUtil.getUserId(ID_HEAD, count));
        patientMapper.insert(patient);
    }

    @Override
    @Transactional
    public void update(Patient patient) {
        patientMapper.updateByPrimaryKeySelective(patient);
    }

    @Override
    public List<Patient> getList(Patient patient) {
        return patientMapper.findList(patient);
    }

    @Override
    public Page<Patient> getPage(Patient patient, Integer pageIndex, Integer pageSize) {
        Integer count = patientMapper.findCount(patient);
        List<Patient> list = patientMapper.findPage(patient, pageIndex * pageSize - pageSize, pageSize);
        return Page.<Patient>builder()
                .count(count)
                .currPage(pageIndex)
                .pageSize(pageSize)
                .data(list)
                .build();
    }

    @Override
    public Patient get(String id) {
        return patientMapper.selectByPrimaryKey(id);
    }
}
