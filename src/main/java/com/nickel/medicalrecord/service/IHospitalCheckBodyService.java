package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.HospitalCheckBodyCreateDTO;
import com.nickel.medicalrecord.model.dto.HospitalCheckBodyDTO;
import com.nickel.medicalrecord.model.dto.HospitalCheckBodyUpdateDTO;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IHospitalCheckBodyService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 14:51
 * @Version 1.0
 */
public interface IHospitalCheckBodyService {

    List<HospitalCheckBodyDTO> getList(String hospitalRecordsId);

    HospitalCheckBodyDTO get(Integer id);

    void update(HospitalCheckBodyUpdateDTO updateDTO);

    void create(HospitalCheckBodyCreateDTO createDTO);

}
