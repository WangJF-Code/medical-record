package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.PatientDrugHistory;
import com.nickel.medicalrecord.repository.IPatientDrugHistoryMapper;
import com.nickel.medicalrecord.service.IPatientDrugHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PatientDrugHistoryService implements IPatientDrugHistoryService {

    private IPatientDrugHistoryMapper mapper;

    @Autowired
    public void setMapper(IPatientDrugHistoryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void create(PatientDrugHistory drugHistory) {
        mapper.insert(drugHistory);
    }

    @Override
    public void update(PatientDrugHistory drugHistory) {
        mapper.updateByPrimaryKeySelective(drugHistory);
    }

    @Override
    public List<PatientDrugHistory> getList(PatientDrugHistory patientDrugHistory) {
        return mapper.findList(patientDrugHistory);
    }

    @Override
    public List<PatientDrugHistory> getList(String patientId) {
        return mapper.findListByPatientId(patientId);
    }

    @Override
    public PatientDrugHistory get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }
}
