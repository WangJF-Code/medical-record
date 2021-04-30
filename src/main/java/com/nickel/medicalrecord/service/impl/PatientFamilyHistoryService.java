package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.PatientFamilyHistory;
import com.nickel.medicalrecord.repository.IPatientFamilyHistoryMapper;
import com.nickel.medicalrecord.service.IPatientFamilyHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PatientFamilyHistoryService implements IPatientFamilyHistoryService {

    private IPatientFamilyHistoryMapper mapper;

    @Autowired
    public void setMapper(IPatientFamilyHistoryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void create(PatientFamilyHistory familyHistory) {
        mapper.insert(familyHistory);
    }

    @Override
    public void update(PatientFamilyHistory familyHistory) {
        mapper.updateByPrimaryKeySelective(familyHistory);
    }

    @Override
    public List<PatientFamilyHistory> getList(PatientFamilyHistory patientFamilyHistory) {
        return mapper.findList(patientFamilyHistory);
    }

    @Override
    public PatientFamilyHistory get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PatientFamilyHistory> getList(String patientId) {
        return mapper.findListByPatientId(patientId);
    }
}
