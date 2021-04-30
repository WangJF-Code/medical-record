package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.DetectBloodRoutine;
import com.nickel.medicalrecord.repository.IDetectBloodRoutineMapper;
import com.nickel.medicalrecord.service.IDetectBloodRoutineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName DetectBloodRoutineService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:12
 * @Version 1.0
 */
@Service
@Slf4j
public class DetectBloodRoutineService implements IDetectBloodRoutineService {

    private IDetectBloodRoutineMapper mapper;

    @Autowired
    public void setMapper(IDetectBloodRoutineMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<DetectBloodRoutine> getList(Integer type, String dataId) {
        return mapper.selectList(type, dataId);
    }

    @Override
    public DetectBloodRoutine get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(DetectBloodRoutine updateDTO) {
        mapper.updateByPrimaryKeySelective(updateDTO);
    }

    @Override
    public void create(DetectBloodRoutine createDTO) {
        mapper.insert(createDTO);
    }

}
