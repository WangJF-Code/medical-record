package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.FollowupVascularEventRecordDTO;
import com.nickel.medicalrecord.model.entity.FollowupVascularEventRecord;

import java.util.List;

public interface IFollowupVascularEventRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowupVascularEventRecord record);

    int insertSelective(FollowupVascularEventRecord record);

    FollowupVascularEventRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowupVascularEventRecord record);

    int updateByPrimaryKey(FollowupVascularEventRecord record);

    FollowupVascularEventRecordDTO selectInfo(Integer id);

    List<FollowupVascularEventRecordDTO> selectList(String followupRecordsId);
}