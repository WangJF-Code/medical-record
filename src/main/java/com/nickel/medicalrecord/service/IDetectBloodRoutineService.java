package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.DetectBloodRoutine;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectBloodRoutineService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:12
 * @Version 1.0
 */
public interface IDetectBloodRoutineService {
    List<DetectBloodRoutine> getList(Integer type, String dataId);

    DetectBloodRoutine get(Integer id);

    void update(DetectBloodRoutine updateDTO);

    void create(DetectBloodRoutine createDTO);
}
