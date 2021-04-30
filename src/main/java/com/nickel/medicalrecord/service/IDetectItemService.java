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

    void update(DetectItemValueDTO updateDTO);

    void create(DetectItemValueDTO createDTO);

    List<DetectItemSingleDTO> getListSingle(Integer type, String dataId, Integer detectType);

    DetectItemSingleDTO getSingle(Integer id);

    void update(DetectItemSingleDTO updateDTO);

    void create(DetectItemSingleDTO createDTO);

    List<DetectItemMultipleDTO> getListMultiple(Integer type, String dataId, Integer detectType);

    DetectItemMultipleDTO getMultiple(Integer id);

    void update(DetectItemMultipleDTO updateDTO);

    void create(DetectItemMultipleDTO createDTO);

    List<DetectItemMultipleSingleDTO> getListMultipleSingle(Integer type, String dataId, Integer detectType);

    DetectItemMultipleSingleDTO getMultipleSingle(Integer id);

    void update(DetectItemMultipleSingleDTO updateDTO);

    void create(DetectItemMultipleSingleDTO createDTO);

    List<DetectItemOutcomeDTO> getListOutcome(Integer type, String dataId, Integer detectType);

    DetectItemOutcomeDTO getOutcome(Integer id);

    void update(DetectItemOutcomeDTO updateDTO);

    void create(DetectItemOutcomeDTO createDTO);
}
