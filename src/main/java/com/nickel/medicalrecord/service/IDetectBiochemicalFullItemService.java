package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.DetectBiochemicalFullItem;

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

    List<DetectBiochemicalFullItem> getList(Integer type, String dataId);

    DetectBiochemicalFullItem get(Integer id);

    void update(DetectBiochemicalFullItem updateDTO);

    void create(DetectBiochemicalFullItem createDTO);
}
