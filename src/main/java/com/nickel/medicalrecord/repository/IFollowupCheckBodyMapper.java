package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.FollowupCheckBodyDTO;
import com.nickel.medicalrecord.model.entity.FollowupCheckBody;

import java.util.List;

public interface IFollowupCheckBodyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowupCheckBody record);

    int insertSelective(FollowupCheckBody record);

    FollowupCheckBody selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowupCheckBody record);

    int updateByPrimaryKey(FollowupCheckBody record);

    FollowupCheckBodyDTO selectInfo(Integer id);

    List<FollowupCheckBodyDTO> selectList(String followupRecordsId);
}