package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.MedicationDrugRecordDTO;
import com.nickel.medicalrecord.model.dto.MedicationRecordDTO;
import com.nickel.medicalrecord.repository.IMedicationDrugRecordMapper;
import com.nickel.medicalrecord.repository.IMedicationRecordMapper;
import com.nickel.medicalrecord.service.IMedicationRecordService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName MedicationRecordService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 21:45
 * @Version 1.0
 */
@Service
@Slf4j
public class MedicationRecordService implements IMedicationRecordService {

    private IMedicationRecordMapper mapper;

    private IMedicationDrugRecordMapper drugRecordMapper;

    @Autowired
    public void setMapper(IMedicationRecordMapper mapper) {
        this.mapper = mapper;
    }

    @Autowired
    public void setDrugRecordMapper(IMedicationDrugRecordMapper drugRecordMapper) {
        this.drugRecordMapper = drugRecordMapper;
    }

    @Override
    public List<MedicationRecordDTO> getList(Integer type, String dataId) {
        return mapper.getList(type, dataId);
    }

    @Override
    public MedicationRecordDTO get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(MedicationRecordDTO updateDTO) {
        drugRecordMapper.deleteByMedicationRecordId(updateDTO.getId());
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
        for (MedicationDrugRecordDTO drugRecordDTO : updateDTO.getDrugRecordDTOList()) {
            drugRecordMapper.insert(EntityTransformUtils.transform(drugRecordDTO));
        }
    }

    @Override
    @Transactional
    public void create(MedicationRecordDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
        for (MedicationDrugRecordDTO drugRecordDTO : createDTO.getDrugRecordDTOList()) {
            drugRecordMapper.insert(EntityTransformUtils.transform(drugRecordDTO));
        }
    }
}
