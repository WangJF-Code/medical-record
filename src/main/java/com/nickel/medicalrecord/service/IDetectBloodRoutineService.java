package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.DetectBloodRoutineCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectBloodRoutineDTO;
import com.nickel.medicalrecord.model.dto.DetectBloodRoutineUpdateDTO;

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
    List<DetectBloodRoutineDTO> getList(Integer type, String dataId);

    DetectBloodRoutineDTO get(Integer id);

    void update(DetectBloodRoutineUpdateDTO updateDTO);

    void create(DetectBloodRoutineCreateDTO createDTO);
}
