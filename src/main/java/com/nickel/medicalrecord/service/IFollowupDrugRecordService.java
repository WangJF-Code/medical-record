package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.FollowupDrugRecordDTO;
import com.nickel.medicalrecord.model.dto.FollowupDrugRecordSaveDTO;

public interface IFollowupDrugRecordService {
    FollowupDrugRecordDTO get(String followupRecordsId);

    void save(FollowupDrugRecordSaveDTO updateDTO);

}
