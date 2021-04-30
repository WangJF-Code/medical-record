package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.HospitalCheckBodyDTO;
import com.nickel.medicalrecord.model.entity.HospitalCheckBody;

import java.util.List;

public interface IHospitalCheckBodyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HospitalCheckBody record);

    int insertSelective(HospitalCheckBody record);

    HospitalCheckBodyDTO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HospitalCheckBody record);

    int updateByPrimaryKey(HospitalCheckBody record);

    List<HospitalCheckBodyDTO> selectByHospitalRecordsId(String hospitalRecordsId);
}