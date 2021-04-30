package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.DetectThirteenBloodLipids;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectThirteenBloodLipidsService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:19
 * @Version 1.0
 */
public interface IDetectThirteenBloodLipidsService {
    List<DetectThirteenBloodLipids> getList(Integer type, String dataId);

    DetectThirteenBloodLipids get(Integer id);

    void update(DetectThirteenBloodLipids updateDTO);

    void create(DetectThirteenBloodLipids createDTO);
}
