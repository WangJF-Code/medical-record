package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.DetectAntiplateletDrugGenesCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectAntiplateletDrugGenesDTO;
import com.nickel.medicalrecord.model.dto.DetectAntiplateletDrugGenesUpdateDTO;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectAntiplateletDrugGenesService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 22:32
 * @Version 1.0
 */
public interface IDetectAntiplateletDrugGenesService {

    List<DetectAntiplateletDrugGenesDTO> getList(Integer type, String dataId);

    DetectAntiplateletDrugGenesDTO get(Integer id);

    void update(DetectAntiplateletDrugGenesUpdateDTO updateDTO);

    void create(DetectAntiplateletDrugGenesCreateDTO createDTO);
}
