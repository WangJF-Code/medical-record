package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.FollowupOnsetRecordDTO;
import com.nickel.medicalrecord.model.entity.FollowupOnsetRecord;

public interface IFollowupOnsetRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowupOnsetRecord record);

    int insertSelective(FollowupOnsetRecord record);

    FollowupOnsetRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowupOnsetRecord record);

    int updateByPrimaryKey(FollowupOnsetRecord record);

    void deleteByFollowupRecordsId(String followupRecordsId);

    FollowupOnsetRecordDTO selectByFollowupRecordsId(String followupRecordsId);
}