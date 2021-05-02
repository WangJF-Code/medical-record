package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.DetectInflammatoryMediaCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectInflammatoryMediaDTO;
import com.nickel.medicalrecord.model.dto.DetectInflammatoryMediaUpdateDTO;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectInflammatoryMediaService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:17
 * @Version 1.0
 */
public interface IDetectInflammatoryMediaService {
    List<DetectInflammatoryMediaDTO> getList(Integer type, String dataId);

    DetectInflammatoryMediaDTO get(Integer id);

    void update(DetectInflammatoryMediaUpdateDTO updateDTO);

    void create(DetectInflammatoryMediaCreateDTO createDTO);
}
