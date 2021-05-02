package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.DetectBiochemicalFullItemCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectBiochemicalFullItemDTO;
import com.nickel.medicalrecord.model.dto.DetectBiochemicalFullItemUpdateDTO;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectBiochemicalFullItemService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 22:46
 * @Version 1.0
 */
public interface IDetectBiochemicalFullItemService {

    List<DetectBiochemicalFullItemDTO> getList(Integer type, String dataId);

    DetectBiochemicalFullItemDTO get(Integer id);

    void update(DetectBiochemicalFullItemUpdateDTO updateDTO);

    void create(DetectBiochemicalFullItemCreateDTO createDTO);
}
