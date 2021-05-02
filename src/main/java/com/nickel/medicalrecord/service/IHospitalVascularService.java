package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.HospitalVascularCreateDTO;
import com.nickel.medicalrecord.model.dto.HospitalVascularDTO;
import com.nickel.medicalrecord.model.dto.HospitalVascularUpdateDTO;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IHospitalVascularEventService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 18:41
 * @Version 1.0
 */
public interface IHospitalVascularService {

    List<HospitalVascularDTO> getList(String hospitalRecordsId);

    HospitalVascularDTO get(Integer id);

    void update(HospitalVascularUpdateDTO updateDTO);

    void create(HospitalVascularCreateDTO createDTO);
}
