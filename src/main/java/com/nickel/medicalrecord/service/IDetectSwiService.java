package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.DetectSwiCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectSwiDTO;
import com.nickel.medicalrecord.model.dto.DetectSwiUpdateDTO;

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
    List<DetectSwiDTO> getList(Integer type, String dataId);

    DetectSwiDTO get(Integer id);

    void update(DetectSwiUpdateDTO updateDTO);

    void create(DetectSwiCreateDTO createDTO);
}
