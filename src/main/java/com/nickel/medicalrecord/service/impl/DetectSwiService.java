package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.DetectSwiCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectSwiDTO;
import com.nickel.medicalrecord.model.dto.DetectSwiUpdateDTO;
import com.nickel.medicalrecord.model.entity.DetectSwi;
import com.nickel.medicalrecord.repository.IDetectSwiMapper;
import com.nickel.medicalrecord.service.IDetectSwiService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<DetectSwiDTO> getList(Integer type, String dataId) {
        List<DetectSwi> list = mapper.selectList(type, dataId);
        return list.stream().map(EntityTransformUtils::transform).collect(Collectors.toList());
    }

    @Override
    public DetectSwiDTO get(Integer id) {
        DetectSwi detectSwi = mapper.selectByPrimaryKey(id);
        return EntityTransformUtils.transform(detectSwi);
    }

    @Override
    public void update(DetectSwiUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectSwiCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

}
