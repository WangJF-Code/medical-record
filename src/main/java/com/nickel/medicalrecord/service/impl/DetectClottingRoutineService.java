package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.DetectClottingRoutineCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectClottingRoutineDTO;
import com.nickel.medicalrecord.model.dto.DetectClottingRoutineUpdateDTO;
import com.nickel.medicalrecord.model.entity.DetectClottingRoutine;
import com.nickel.medicalrecord.repository.IDetectClottingRoutineMapper;
import com.nickel.medicalrecord.service.IDetectClottingRoutineService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<DetectClottingRoutineDTO> getList(Integer type, String dataId) {
        List<DetectClottingRoutine> list = mapper.selectList(type, dataId);
        return list.stream().map(EntityTransformUtils::transform).collect(Collectors.toList());
    }

    @Override
    public DetectClottingRoutineDTO get(Integer id) {
        DetectClottingRoutine detectClottingRoutine = mapper.selectByPrimaryKey(id);
        return EntityTransformUtils.transform(detectClottingRoutine);
    }

    @Override
    public void update(DetectClottingRoutineUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectClottingRoutineCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

}
