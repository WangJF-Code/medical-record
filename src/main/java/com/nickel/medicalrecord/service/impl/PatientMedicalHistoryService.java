package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.PatientMedicalHistory;
import com.nickel.medicalrecord.repository.IPatientMedicalHistoryMapper;
import com.nickel.medicalrecord.service.IPatientMedicalHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PatientMedicalHistoryService implements IPatientMedicalHistoryService {

    private IPatientMedicalHistoryMapper mapper;

    @Autowired
    public void setMapper(IPatientMedicalHistoryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void create(PatientMedicalHistory medicalHistory) {
        mapper.insert(medicalHistory);
    }

    @Override
    public void update(PatientMedicalHistory medicalHistory) {
        mapper.updateByPrimaryKeySelective(medicalHistory);
    }

    @Override
    public List<PatientMedicalHistory> getList(PatientMedicalHistory medicalHistory) {
        return mapper.findList(medicalHistory);
    }

    @Override
    public PatientMedicalHistory get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PatientMedicalHistory> getList(String patientId) {
        return mapper.findListByPatientId(patientId);
    }
}
