package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.dto.FollowupRecordsConditionDTO;
import com.nickel.medicalrecord.model.dto.FollowupRecordsCreateDTO;
import com.nickel.medicalrecord.model.dto.FollowupRecordsDTO;
import com.nickel.medicalrecord.model.dto.FollowupRecordsUpdateDTO;
import com.nickel.medicalrecord.repository.IFollowupRecordsMapper;
import com.nickel.medicalrecord.service.IFollowupRecordsService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FollowupRecordsService implements IFollowupRecordsService {

    private IFollowupRecordsMapper mapper;

    @Autowired
    public void setMapper(IFollowupRecordsMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Page<FollowupRecordsDTO> getPage(FollowupRecordsConditionDTO conditionDTO, Integer pageCurrent, Integer pageSize) {
        Integer count = mapper.findCount(conditionDTO);
        List<FollowupRecordsDTO> list = mapper.findPage(conditionDTO, pageCurrent * pageSize - pageSize, pageSize);
        return Page.<FollowupRecordsDTO>builder()
                .count(count)
                .currPage(pageCurrent)
                .pageSize(pageSize)
                .data(list)
                .build();
    }

    @Override
    public List<FollowupRecordsDTO> getList(FollowupRecordsConditionDTO conditionDTO) {
        return mapper.selectList(conditionDTO);
    }

    @Override
    public FollowupRecordsDTO get(Integer id) {
        return mapper.selectInfo(id);
    }

    @Override
    public void update(FollowupRecordsUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(FollowupRecordsCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }
}
