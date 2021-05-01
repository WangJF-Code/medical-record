package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.FollowupCheckBodyCreateDTO;
import com.nickel.medicalrecord.model.dto.FollowupCheckBodyDTO;
import com.nickel.medicalrecord.model.dto.FollowupCheckBodyUpdateDTO;
import com.nickel.medicalrecord.model.entity.CheckBodyIndex;
import com.nickel.medicalrecord.model.entity.FollowupCheckBody;
import com.nickel.medicalrecord.repository.ICheckBodyIndexMapper;
import com.nickel.medicalrecord.repository.IFollowupCheckBodyMapper;
import com.nickel.medicalrecord.service.IFollowupCheckBodyService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class FollowupCheckBodyService implements IFollowupCheckBodyService {

    private IFollowupCheckBodyMapper mapper;

    private ICheckBodyIndexMapper bodyIndexMapper;

    @Autowired
    public void setMapper(IFollowupCheckBodyMapper mapper) {
        this.mapper = mapper;
    }

    @Autowired
    public void setBodyIndexMapper(ICheckBodyIndexMapper bodyIndexMapper) {
        this.bodyIndexMapper = bodyIndexMapper;
    }

    @Override
    public List<FollowupCheckBodyDTO> getList(String followupRecordsId) {
        return mapper.selectList(followupRecordsId);
    }

    @Override
    public FollowupCheckBodyDTO get(Integer id) {
        return mapper.selectInfo(id);
    }

    @Override
    @Transactional
    public void update(FollowupCheckBodyUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
        if (Objects.nonNull(updateDTO.getBodyIndex()) && Objects.nonNull(updateDTO.getCheckBodyIndexId())) {
            CheckBodyIndex bodyIndex = EntityTransformUtils.transform(updateDTO.getBodyIndex());
            bodyIndex.setId(updateDTO.getCheckBodyIndexId());
            bodyIndex.setPatientId(updateDTO.getPatientId());
            bodyIndexMapper.updateByPrimaryKeySelective(bodyIndex);
        }
    }

    @Override
    @Transactional
    public void create(FollowupCheckBodyCreateDTO createDTO) {
        CheckBodyIndex checkBodyIndex = EntityTransformUtils.transform(createDTO.getBodyIndex());
        checkBodyIndex.setPatientId(createDTO.getPatientId());
        bodyIndexMapper.insert(checkBodyIndex);
        FollowupCheckBody followupCheckBody = EntityTransformUtils.transform(createDTO);
        followupCheckBody.setCheckBodyIndexId(checkBodyIndex.getId());
        mapper.insert(followupCheckBody);
    }
}
