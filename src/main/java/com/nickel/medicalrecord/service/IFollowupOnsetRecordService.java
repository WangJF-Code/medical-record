package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.FollowupOnsetRecordDTO;
import com.nickel.medicalrecord.model.dto.FollowupOnsetRecordSaveDTO;

public interface IFollowupOnsetRecordService {
    FollowupOnsetRecordDTO get(String followupRecordsId);

    void save(FollowupOnsetRecordSaveDTO saveDTO);
}
