package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.dto.HospitalRecordsConditionDTO;
import com.nickel.medicalrecord.model.dto.HospitalRecordsCreateDTO;
import com.nickel.medicalrecord.model.dto.HospitalRecordsDTO;
import com.nickel.medicalrecord.model.dto.HospitalRecordsUpdateDTO;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IHospitalRecordsService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 11:15
 * @Version 1.0
 */
public interface IHospitalRecordsService {

    void create(HospitalRecordsCreateDTO createDTO);

    void update(HospitalRecordsUpdateDTO updateDTO);

    HospitalRecordsDTO get(String id);

    List<HospitalRecordsDTO> getList(HospitalRecordsConditionDTO conditionDTO);

    Page<HospitalRecordsDTO> getPage(HospitalRecordsConditionDTO conditionDTO, Integer pageCurrent, Integer pageSize);
}
