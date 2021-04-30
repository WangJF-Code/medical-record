package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.DetectEkg;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectEkgService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:16
 * @Version 1.0
 */
public interface IDetectEkgService {
    List<DetectEkg> getList(Integer type, String dataId);

    DetectEkg get(Integer id);

    void update(DetectEkg updateDTO);

    void create(DetectEkg createDTO);
}
