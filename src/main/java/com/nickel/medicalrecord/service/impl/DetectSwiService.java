package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.DetectSwi;
import com.nickel.medicalrecord.repository.IDetectSwiMapper;
import com.nickel.medicalrecord.service.IDetectSwiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName DetectSwiService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:18
 * @Version 1.0
 */
@Service
@Slf4j
public class DetectSwiService implements IDetectSwiService {

    private IDetectSwiMapper mapper;

    @Autowired
    public void setMapper(IDetectSwiMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<DetectSwi> getList(Integer type, String dataId) {
        return mapper.selectList(type, dataId);
    }

    @Override
    public DetectSwi get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(DetectSwi updateDTO) {
        mapper.updateByPrimaryKeySelective(updateDTO);
    }

    @Override
    public void create(DetectSwi createDTO) {
        mapper.insert(createDTO);
    }

}
