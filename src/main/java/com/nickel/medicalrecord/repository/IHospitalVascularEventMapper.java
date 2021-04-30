package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.entity.HospitalVascularEvent;

public interface IHospitalVascularEventMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HospitalVascularEvent record);

    int insertSelective(HospitalVascularEvent record);

    HospitalVascularEvent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HospitalVascularEvent record);

    int updateByPrimaryKey(HospitalVascularEvent record);

    void deleteByHospitalVascularId(Integer hospitalVascularId);
}