package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.HospitalVascularDTO;
import com.nickel.medicalrecord.model.dto.HospitalVascularEventDTO;
import com.nickel.medicalrecord.model.entity.HospitalVascular;
import com.nickel.medicalrecord.model.entity.HospitalVascularEvent;
import com.nickel.medicalrecord.repository.IHospitalVascularEventMapper;
import com.nickel.medicalrecord.repository.IHospitalVascularMapper;
import com.nickel.medicalrecord.service.IHospitalVascularService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName HospitalVascularEventService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 18:42
 * @Version 1.0
 */
@Service
@Slf4j
public class HospitalVascularService implements IHospitalVascularService {

    private IHospitalVascularMapper mapper;

    private IHospitalVascularEventMapper eventMapper;

    @Autowired
    public void setMapper(IHospitalVascularMapper mapper) {
        this.mapper = mapper;
    }

    @Autowired
    public void setEventMapper(IHospitalVascularEventMapper eventMapper) {
        this.eventMapper = eventMapper;
    }

    @Override
    public List<HospitalVascularDTO> getList(String hospitalRecordsId) {
        return mapper.selectByHospitalRecordsId(hospitalRecordsId);
    }

    @Override
    public HospitalVascularDTO get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void update(HospitalVascularDTO updateDTO) {
        eventMapper.deleteByHospitalVascularId(updateDTO.getId());
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
        for (HospitalVascularEventDTO hospitalVascularEventDTO : updateDTO.getEventList()) {
            HospitalVascularEvent vascularEvent = EntityTransformUtils.transform(hospitalVascularEventDTO);
            vascularEvent.setHospitalVascularId(updateDTO.getId());
            eventMapper.insert(EntityTransformUtils.transform(hospitalVascularEventDTO));
        }
    }

    @Override
    @Transactional
    public void create(HospitalVascularDTO createDTO) {
        HospitalVascular hospitalVascular = EntityTransformUtils.transform(createDTO);
        mapper.insert(hospitalVascular);
        for (HospitalVascularEventDTO hospitalVascularEventDTO : createDTO.getEventList()) {
            HospitalVascularEvent vascularEvent = EntityTransformUtils.transform(hospitalVascularEventDTO);
            vascularEvent.setHospitalVascularId(hospitalVascular.getId());
            eventMapper.insert(vascularEvent);
        }
    }

}
