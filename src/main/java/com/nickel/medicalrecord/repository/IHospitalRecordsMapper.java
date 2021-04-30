package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.HospitalRecordsConditionDTO;
import com.nickel.medicalrecord.model.dto.HospitalRecordsDTO;
import com.nickel.medicalrecord.model.entity.HospitalRecords;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IHospitalRecordsMapper {

    int deleteByPrimaryKey(String id);

    int insert(HospitalRecords record);

    int insertSelective(HospitalRecords record);

    HospitalRecordsDTO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HospitalRecords record);

    int updateByPrimaryKey(HospitalRecords record);

    Integer findTodayCount(String today);

    List<HospitalRecordsDTO> selectList(HospitalRecordsConditionDTO conditionDTO);

    Integer findCount(HospitalRecordsConditionDTO conditionDTO);

    List<HospitalRecordsDTO> findPage(@Param("conditionDTO") HospitalRecordsConditionDTO conditionDTO, @Param("index") Integer index, @Param("size") Integer size);
}