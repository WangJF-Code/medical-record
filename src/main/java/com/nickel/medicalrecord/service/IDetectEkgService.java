package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.DetectEkgCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectEkgDTO;
import com.nickel.medicalrecord.model.dto.DetectEkgUpdateDTO;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName IDetectEkgService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:16
 * @Version 1.0
 */
public interface IDetectEkgService {
    List<DetectEkgDTO> getList(Integer type, String dataId);

    DetectEkgDTO get(Integer id);

    void update(DetectEkgUpdateDTO updateDTO);

    void create(DetectEkgCreateDTO createDTO);
}
