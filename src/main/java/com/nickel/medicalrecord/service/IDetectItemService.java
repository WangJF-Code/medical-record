package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.*;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectItemService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/29 0:09
 * @Version 1.0
 */
public interface IDetectItemService {

    List<DetectItemValueDTO> getListValue(Integer type, String dataId, Integer detectType);

    DetectItemValueDTO getValue(Integer id);

    void update(DetectItemValueUpdateDTO updateDTO);

    void create(DetectItemValueCreateDTO createDTO);

    List<DetectItemSingleDTO> getListSingle(Integer type, String dataId, Integer detectType);

    DetectItemSingleDTO getSingle(Integer id);

    void update(DetectItemSingleUpdateDTO updateDTO);

    void create(DetectItemSingleCreateDTO createDTO);

    List<DetectItemMultipleDTO> getListMultiple(Integer type, String dataId, Integer detectType);

    DetectItemMultipleDTO getMultiple(Integer id);

    void update(DetectItemMultipleUpdateDTO updateDTO);

    void create(DetectItemMultipleCreateDTO createDTO);

    List<DetectItemMultipleSingleDTO> getListMultipleSingle(Integer type, String dataId, Integer detectType);

    DetectItemMultipleSingleDTO getMultipleSingle(Integer id);

    void update(DetectItemMultipleSingleUpdateDTO updateDTO);

    void create(DetectItemMultipleSingleCreateDTO createDTO);

    List<DetectItemOutcomeDTO> getListOutcome(Integer type, String dataId, Integer detectType);

    DetectItemOutcomeDTO getOutcome(Integer id);

    void update(DetectItemOutcomeUpdateDTO updateDTO);

    void create(DetectItemOutcomeCreateDTO createDTO);
}
