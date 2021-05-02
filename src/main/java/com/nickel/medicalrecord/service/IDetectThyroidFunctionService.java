package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.DetectThyroidFunctionCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectThyroidFunctionDTO;
import com.nickel.medicalrecord.model.dto.DetectThyroidFunctionUpdateDTO;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectThyroidFunctionService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:20
 * @Version 1.0
 */
public interface IDetectThyroidFunctionService {
    List<DetectThyroidFunctionDTO> getList(Integer type, String dataId);

    DetectThyroidFunctionDTO get(Integer id);

    void update(DetectThyroidFunctionUpdateDTO updateDTO);

    void create(DetectThyroidFunctionCreateDTO createDTO);
}
