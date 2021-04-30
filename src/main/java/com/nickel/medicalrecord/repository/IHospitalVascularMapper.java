package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.HospitalVascularDTO;
import com.nickel.medicalrecord.model.entity.HospitalVascular;

import java.util.List;

public interface IHospitalVascularMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HospitalVascular record);

    int insertSelective(HospitalVascular record);

    HospitalVascularDTO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HospitalVascular record);

    int updateByPrimaryKey(HospitalVascular record);

    List<HospitalVascularDTO> selectByHospitalRecordsId(String hospitalRecordsId);

}