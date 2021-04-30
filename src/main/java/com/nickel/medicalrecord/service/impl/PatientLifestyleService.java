package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.PatientLifestyle;
import com.nickel.medicalrecord.repository.IPatientLifestyleMapper;
import com.nickel.medicalrecord.service.IPatientLifestyleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PatientLifestyleService implements IPatientLifestyleService {

    private IPatientLifestyleMapper mapper;

    @Autowired
    public void setMapper(IPatientLifestyleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void create(PatientLifestyle lifestyle) {
        mapper.insert(lifestyle);
    }

    @Override
    public void update(PatientLifestyle lifestyle) {
        mapper.updateByPrimaryKeySelective(lifestyle);
    }

    @Override
    public List<PatientLifestyle> getList(String patientId) {
        return mapper.findListByPatientId(patientId);
    }

    @Override
    public List<PatientLifestyle> getList(PatientLifestyle lifestyle) {
        return mapper.findList(lifestyle);
    }

    @Override
    public PatientLifestyle get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }
}
