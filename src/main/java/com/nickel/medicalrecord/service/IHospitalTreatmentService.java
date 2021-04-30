package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.HospitalTreatmentRecordsCreateDTO;
import com.nickel.medicalrecord.model.dto.HospitalTreatmentRecordsDTO;
import com.nickel.medicalrecord.model.dto.HospitalTreatmentRecordsUpdateDTO;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IHospitalTreatmentService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 18:22
 * @Version 1.0
 */
public interface IHospitalTreatmentService {

    List<HospitalTreatmentRecordsDTO> getList(String hospitalRecordsId);

    HospitalTreatmentRecordsDTO get(Integer id);

    void update(HospitalTreatmentRecordsUpdateDTO updateDTO);

    void create(HospitalTreatmentRecordsCreateDTO createDTO);
}
