package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.entity.DetectThyroidFunction;

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
    List<DetectThyroidFunction> getList(Integer type, String dataId);

    DetectThyroidFunction get(Integer id);

    void update(DetectThyroidFunction updateDTO);

    void create(DetectThyroidFunction createDTO);
}
