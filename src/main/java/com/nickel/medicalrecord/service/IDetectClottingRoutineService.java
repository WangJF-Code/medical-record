package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.DetectClottingRoutine;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectClottingRoutineServicr
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:13
 * @Version 1.0
 */
public interface IDetectClottingRoutineService {
    List<DetectClottingRoutine> getList(Integer type, String dataId);

    DetectClottingRoutine get(Integer id);

    void update(DetectClottingRoutine updateDTO);

    void create(DetectClottingRoutine createDTO);
}
