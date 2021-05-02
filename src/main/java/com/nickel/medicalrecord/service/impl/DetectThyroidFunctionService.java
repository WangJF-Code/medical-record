package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.DetectThyroidFunctionCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectThyroidFunctionDTO;
import com.nickel.medicalrecord.model.dto.DetectThyroidFunctionUpdateDTO;
import com.nickel.medicalrecord.model.entity.DetectThyroidFunction;
import com.nickel.medicalrecord.repository.IDetectThyroidFunctionMapper;
import com.nickel.medicalrecord.service.IDetectThyroidFunctionService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<DetectThyroidFunctionDTO> getList(Integer type, String dataId) {
        List<DetectThyroidFunction> list = mapper.selectList(type, dataId);
        return list.stream().map(EntityTransformUtils::transform).collect(Collectors.toList());
    }

    @Override
    public DetectThyroidFunctionDTO get(Integer id) {
        DetectThyroidFunction entity = mapper.selectByPrimaryKey(id);
        return EntityTransformUtils.transform(entity);
    }

    @Override
    public void update(DetectThyroidFunctionUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectThyroidFunctionCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

}
