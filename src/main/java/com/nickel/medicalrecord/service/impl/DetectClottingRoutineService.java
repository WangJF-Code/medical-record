package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.DetectClottingRoutine;
import com.nickel.medicalrecord.repository.IDetectClottingRoutineMapper;
import com.nickel.medicalrecord.service.IDetectClottingRoutineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName DetectClottingRoutineService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:13
 * @Version 1.0
 */
@Service
@Slf4j
public class DetectClottingRoutineService implements IDetectClottingRoutineService {

    private IDetectClottingRoutineMapper mapper;

    @Autowired
    public void setMapper(IDetectClottingRoutineMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<DetectClottingRoutine> getList(Integer type, String dataId) {
        return mapper.selectList(type, dataId);
    }

    @Override
    public DetectClottingRoutine get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(DetectClottingRoutine updateDTO) {
        mapper.updateByPrimaryKeySelective(updateDTO);
    }

    @Override
    public void create(DetectClottingRoutine createDTO) {
        mapper.insert(createDTO);
    }

}
