package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.DetectInflammatoryMediaCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectInflammatoryMediaDTO;
import com.nickel.medicalrecord.model.dto.DetectInflammatoryMediaUpdateDTO;
import com.nickel.medicalrecord.model.entity.DetectInflammatoryMedia;
import com.nickel.medicalrecord.repository.IDetectInflammatoryMediaMapper;
import com.nickel.medicalrecord.service.IDetectInflammatoryMediaService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 类描述：
 *
 * @ClassName DetectInflammatoryMediaService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:17
 * @Version 1.0
 */
@Service
@Slf4j
public class DetectInflammatoryMediaService implements IDetectInflammatoryMediaService {

    private IDetectInflammatoryMediaMapper mapper;

    @Autowired
    public void setMapper(IDetectInflammatoryMediaMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<DetectInflammatoryMediaDTO> getList(Integer type, String dataId) {
        List<DetectInflammatoryMedia> list = mapper.selectList(type, dataId);
        return list.stream().map(EntityTransformUtils::transform).collect(Collectors.toList());
    }

    @Override
    public DetectInflammatoryMediaDTO get(Integer id) {
        DetectInflammatoryMedia detectInflammatoryMedia = mapper.selectByPrimaryKey(id);
        return EntityTransformUtils.transform(detectInflammatoryMedia);
    }

    @Override
    public void update(DetectInflammatoryMediaUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectInflammatoryMediaCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

}
