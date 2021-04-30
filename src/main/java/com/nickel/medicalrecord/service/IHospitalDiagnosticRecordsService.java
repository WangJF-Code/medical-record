package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.HospitalDiagnosticRecordsCreateDTO;
import com.nickel.medicalrecord.model.dto.HospitalDiagnosticRecordsDTO;
import com.nickel.medicalrecord.model.dto.HospitalDiagnosticRecordsUpdateDTO;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IHospitalDiagnosticRecordsService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 17:40
 * @Version 1.0
 */
public interface IHospitalDiagnosticRecordsService {

    List<HospitalDiagnosticRecordsDTO> getList(String hospitalRecordsId);

    HospitalDiagnosticRecordsDTO get(Integer id);

    void update(HospitalDiagnosticRecordsUpdateDTO updateDTO);

    void create(HospitalDiagnosticRecordsCreateDTO createDTO);

}
