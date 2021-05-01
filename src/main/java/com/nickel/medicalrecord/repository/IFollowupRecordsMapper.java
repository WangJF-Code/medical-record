package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.FollowupRecordsConditionDTO;
import com.nickel.medicalrecord.model.dto.FollowupRecordsDTO;
import com.nickel.medicalrecord.model.entity.FollowupRecords;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IFollowupRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowupRecords record);

    int insertSelective(FollowupRecords record);

    FollowupRecords selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowupRecords record);

    int updateByPrimaryKey(FollowupRecords record);

    List<FollowupRecordsDTO> selectList(FollowupRecordsConditionDTO conditionDTO);

    FollowupRecordsDTO selectInfo(Integer id);

    Integer findCount(FollowupRecordsConditionDTO conditionDTO);

    List<FollowupRecordsDTO> findPage(@Param("conditionDTO") FollowupRecordsConditionDTO conditionDTO, @Param("index") Integer index, @Param("size") Integer size);
}