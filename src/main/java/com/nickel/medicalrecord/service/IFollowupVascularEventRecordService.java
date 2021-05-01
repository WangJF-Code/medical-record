package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.FollowupVascularEventRecordCreateDTO;
import com.nickel.medicalrecord.model.dto.FollowupVascularEventRecordDTO;
import com.nickel.medicalrecord.model.dto.FollowupVascularEventRecordUpdateDTO;

import java.util.List;

public interface IFollowupVascularEventRecordService {
    List<FollowupVascularEventRecordDTO> getList(String followupRecordsId);

    FollowupVascularEventRecordDTO get(Integer id);

    void update(FollowupVascularEventRecordUpdateDTO updateDTO);

    void create(FollowupVascularEventRecordCreateDTO createDTO);
}
