package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.HospitalTreatmentRecordsCreateDTO;
import com.nickel.medicalrecord.model.dto.HospitalTreatmentRecordsDTO;
import com.nickel.medicalrecord.model.dto.HospitalTreatmentRecordsUpdateDTO;
import com.nickel.medicalrecord.repository.IHospitalTreatmentRecordsMapper;
import com.nickel.medicalrecord.service.IHospitalTreatmentService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName HospitalTreatmentService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 18:22
 * @Version 1.0
 */
@Service
@Slf4j
public class HospitalTreatmentService implements IHospitalTreatmentService {

    private IHospitalTreatmentRecordsMapper mapper;

    @Autowired
    public void setMapper(IHospitalTreatmentRecordsMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<HospitalTreatmentRecordsDTO> getList(String hospitalRecordsId) {
        return mapper.selectByHospitalRecordsId(hospitalRecordsId);
    }

    @Override
    public HospitalTreatmentRecordsDTO get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(HospitalTreatmentRecordsUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(HospitalTreatmentRecordsCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }
}
