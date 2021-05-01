package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.dto.FollowupRecordsConditionDTO;
import com.nickel.medicalrecord.model.dto.FollowupRecordsCreateDTO;
import com.nickel.medicalrecord.model.dto.FollowupRecordsDTO;
import com.nickel.medicalrecord.model.dto.FollowupRecordsUpdateDTO;

import java.util.List;

public interface IFollowupRecordsService {
    Page<FollowupRecordsDTO> getPage(FollowupRecordsConditionDTO conditionDTO, Integer pageCurrent, Integer pageSize);

    List<FollowupRecordsDTO> getList(FollowupRecordsConditionDTO conditionDTO);

    FollowupRecordsDTO get(Integer id);

    void update(FollowupRecordsUpdateDTO updateDTO);

    void create(FollowupRecordsCreateDTO createDTO);
}
