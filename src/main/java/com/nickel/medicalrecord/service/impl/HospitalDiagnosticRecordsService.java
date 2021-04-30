package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.HospitalDiagnosticRecordsCreateDTO;
import com.nickel.medicalrecord.model.dto.HospitalDiagnosticRecordsDTO;
import com.nickel.medicalrecord.model.dto.HospitalDiagnosticRecordsUpdateDTO;
import com.nickel.medicalrecord.repository.IHospitalDiagnosticRecordsMapper;
import com.nickel.medicalrecord.service.IHospitalDiagnosticRecordsService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName HospitalDiagnosticRecordsService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 17:41
 * @Version 1.0
 */
@Service
@Slf4j
public class HospitalDiagnosticRecordsService implements IHospitalDiagnosticRecordsService {

    private IHospitalDiagnosticRecordsMapper mapper;

    @Autowired
    public void setMapper(IHospitalDiagnosticRecordsMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<HospitalDiagnosticRecordsDTO> getList(String hospitalRecordsId) {
        return mapper.selectByHospitalRecordsId(hospitalRecordsId);
    }

    @Override
    public HospitalDiagnosticRecordsDTO get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(HospitalDiagnosticRecordsUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(HospitalDiagnosticRecordsCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }
}
