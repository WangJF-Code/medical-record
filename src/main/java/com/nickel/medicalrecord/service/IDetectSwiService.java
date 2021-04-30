package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.DetectSwi;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectSwiService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:18
 * @Version 1.0
 */
public interface IDetectSwiService {
    List<DetectSwi> getList(Integer type, String dataId);

    DetectSwi get(Integer id);

    void update(DetectSwi updateDTO);

    void create(DetectSwi createDTO);
}
