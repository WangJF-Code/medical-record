package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.MedicationRecordDTO;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IMedicationRecordService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 21:45
 * @Version 1.0
 */
public interface IMedicationRecordService {

    List<MedicationRecordDTO> getList(Integer type, String dataId);

    MedicationRecordDTO get(Integer id);

    void update(MedicationRecordDTO updateDTO);

    void create(MedicationRecordDTO createDTO);
}
