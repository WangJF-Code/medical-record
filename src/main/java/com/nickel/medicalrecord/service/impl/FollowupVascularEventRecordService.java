package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.FollowupVascularEventRecordCreateDTO;
import com.nickel.medicalrecord.model.dto.FollowupVascularEventRecordDTO;
import com.nickel.medicalrecord.model.dto.FollowupVascularEventRecordUpdateDTO;
import com.nickel.medicalrecord.model.entity.CheckEvaluationIndex;
import com.nickel.medicalrecord.model.entity.FollowupVascularEventRecord;
import com.nickel.medicalrecord.repository.ICheckEvaluationIndexMapper;
import com.nickel.medicalrecord.repository.IFollowupVascularEventRecordMapper;
import com.nickel.medicalrecord.service.IFollowupVascularEventRecordService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class FollowupVascularEventRecordService implements IFollowupVascularEventRecordService {

    private IFollowupVascularEventRecordMapper mapper;

    private ICheckEvaluationIndexMapper evaluationIndexMapper;

    @Autowired
    public void setMapper(IFollowupVascularEventRecordMapper mapper) {
        this.mapper = mapper;
    }

    @Autowired
    public void setEvaluationIndexMapper(ICheckEvaluationIndexMapper evaluationIndexMapper) {
        this.evaluationIndexMapper = evaluationIndexMapper;
    }

    @Override
    public List<FollowupVascularEventRecordDTO> getList(String followupRecordsId) {
        return mapper.selectList(followupRecordsId);
    }

    @Override
    public FollowupVascularEventRecordDTO get(Integer id) {
        return mapper.selectInfo(id);
    }

    @Override
    @Transactional
    public void update(FollowupVascularEventRecordUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
        if (Objects.nonNull(updateDTO.getEvaluationIndex()) && Objects.nonNull(updateDTO.getCheckEvaluationIndexId())) {
            CheckEvaluationIndex evaluationIndex = EntityTransformUtils.transform(updateDTO.getEvaluationIndex());
            evaluationIndex.setPatientId(updateDTO.getPatientId());
            evaluationIndex.setId(updateDTO.getCheckEvaluationIndexId());
            evaluationIndexMapper.updateByPrimaryKeySelective(evaluationIndex);
        }
    }

    @Override
    @Transactional
    public void create(FollowupVascularEventRecordCreateDTO createDTO) {
        CheckEvaluationIndex evaluationIndex = EntityTransformUtils.transform(createDTO.getEvaluationIndexDTO());
        evaluationIndex.setPatientId(createDTO.getPatientId());
        evaluationIndexMapper.insert(evaluationIndex);
        FollowupVascularEventRecord vascularEventRecord = EntityTransformUtils.transform(createDTO);
        vascularEventRecord.setCheckEvaluationIndexId(evaluationIndex.getId());
        mapper.insert(vascularEventRecord);
    }
}
