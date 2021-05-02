package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.DetectBloodRoutineCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectBloodRoutineDTO;
import com.nickel.medicalrecord.model.dto.DetectBloodRoutineUpdateDTO;
import com.nickel.medicalrecord.model.entity.DetectBloodRoutine;
import com.nickel.medicalrecord.repository.IDetectBloodRoutineMapper;
import com.nickel.medicalrecord.service.IDetectBloodRoutineService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<DetectBloodRoutineDTO> getList(Integer type, String dataId) {
        List<DetectBloodRoutine> list = mapper.selectList(type, dataId);
        return list.stream().map(EntityTransformUtils::transform).collect(Collectors.toList());
    }

    @Override
    public DetectBloodRoutineDTO get(Integer id) {
        DetectBloodRoutine routine = mapper.selectByPrimaryKey(id);
        return EntityTransformUtils.transform(routine);
    }

    @Override
    public void update(DetectBloodRoutineUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectBloodRoutineCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

}
