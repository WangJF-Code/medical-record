package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.FollowupDrugRecordDTO;
import com.nickel.medicalrecord.model.entity.FollowupDrugRecord;

public interface IFollowupDrugRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowupDrugRecord record);

    int insertSelective(FollowupDrugRecord record);

    FollowupDrugRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowupDrugRecord record);

    int updateByPrimaryKey(FollowupDrugRecord record);

    void deleteByFollowupRecordsId(String followupRecordsId);

    FollowupDrugRecordDTO selectByFollowupRecordsId(String followupRecordsId);
}