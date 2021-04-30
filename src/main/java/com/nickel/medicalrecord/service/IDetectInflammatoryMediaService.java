package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.DetectInflammatoryMedia;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectInflammatoryMediaService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:17
 * @Version 1.0
 */
public interface IDetectInflammatoryMediaService {
    List<DetectInflammatoryMedia> getList(Integer type, String dataId);

    DetectInflammatoryMedia get(Integer id);

    void update(DetectInflammatoryMedia updateDTO);

    void create(DetectInflammatoryMedia createDTO);
}
