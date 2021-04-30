package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.FollowupCheckBody;

public interface IFollowupCheckBodyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowupCheckBody record);

    int insertSelective(FollowupCheckBody record);

    FollowupCheckBody selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowupCheckBody record);

    int updateByPrimaryKey(FollowupCheckBody record);
}