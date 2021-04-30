package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.FollowupRecords;

public interface IFollowupRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowupRecords record);

    int insertSelective(FollowupRecords record);

    FollowupRecords selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowupRecords record);

    int updateByPrimaryKey(FollowupRecords record);
}