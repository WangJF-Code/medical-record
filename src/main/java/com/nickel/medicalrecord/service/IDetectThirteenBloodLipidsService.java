package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.DetectThirteenBloodLipidsCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectThirteenBloodLipidsDTO;
import com.nickel.medicalrecord.model.dto.DetectThirteenBloodLipidsUpdateDTO;

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
    List<DetectThirteenBloodLipidsDTO> getList(Integer type, String dataId);

    DetectThirteenBloodLipidsDTO get(Integer id);

    void update(DetectThirteenBloodLipidsUpdateDTO updateDTO);

    void create(DetectThirteenBloodLipidsCreateDTO createDTO);
}
