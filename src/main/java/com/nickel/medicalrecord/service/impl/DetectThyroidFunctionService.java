package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.DetectThyroidFunction;
import com.nickel.medicalrecord.repository.IDetectThyroidFunctionMapper;
import com.nickel.medicalrecord.service.IDetectThyroidFunctionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName DetectThyroidFunctionService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:20
 * @Version 1.0
 */
@Service
@Slf4j
public class DetectThyroidFunctionService implements IDetectThyroidFunctionService {

    private IDetectThyroidFunctionMapper mapper;

    @Autowired
    public void setMapper(IDetectThyroidFunctionMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<DetectThyroidFunction> getList(Integer type, String dataId) {
        return mapper.selectList(type, dataId);
    }

    @Override
    public DetectThyroidFunction get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(DetectThyroidFunction updateDTO) {
        mapper.updateByPrimaryKeySelective(updateDTO);
    }

    @Override
    public void create(DetectThyroidFunction createDTO) {
        mapper.insert(createDTO);
    }

}
