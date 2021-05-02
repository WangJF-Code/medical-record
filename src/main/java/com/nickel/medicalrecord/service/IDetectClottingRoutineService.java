package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.DetectClottingRoutineCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectClottingRoutineDTO;
import com.nickel.medicalrecord.model.dto.DetectClottingRoutineUpdateDTO;

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
    List<DetectClottingRoutineDTO> getList(Integer type, String dataId);

    DetectClottingRoutineDTO get(Integer id);

    void update(DetectClottingRoutineUpdateDTO updateDTO);

    void create(DetectClottingRoutineCreateDTO createDTO);
}
