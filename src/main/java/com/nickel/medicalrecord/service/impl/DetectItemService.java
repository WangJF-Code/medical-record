package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.*;
import com.nickel.medicalrecord.model.entity.DetectItem;
import com.nickel.medicalrecord.repository.IDetectItemMapper;
import com.nickel.medicalrecord.service.IDetectItemService;
import com.nickel.medicalrecord.util.DateTimeUtil;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 类描述：
 *
 * @ClassName DetectItemService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/29 0:10
 * @Version 1.0
 */
@Service
@Slf4j
public class DetectItemService implements IDetectItemService {

    private IDetectItemMapper mapper;

    @Autowired
    public void setMapper(IDetectItemMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<DetectItemValueDTO> getListValue(Integer type, String dataId, Integer detectType) {
        List<DetectItem> list = mapper.selectList(type, dataId, detectType);
        if (!list.isEmpty()) {
            return list.stream().map(this::transformValue).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    public DetectItemValueDTO getValue(Integer id) {
        return transformValue(mapper.selectByPrimaryKey(id));
    }

    @Override
    public void update(DetectItemValueUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectItemValueCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

    @Override
    public List<DetectItemSingleDTO> getListSingle(Integer type, String dataId, Integer detectType) {
        List<DetectItem> list = mapper.selectList(type, dataId, detectType);
        if (!list.isEmpty()) {
            return list.stream().map(this::transformSingle).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    public DetectItemSingleDTO getSingle(Integer id) {
        return transformSingle(mapper.selectByPrimaryKey(id));
    }

    @Override
    public void update(DetectItemSingleUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectItemSingleCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

    @Override
    public List<DetectItemMultipleDTO> getListMultiple(Integer type, String dataId, Integer detectType) {
        List<DetectItem> list = mapper.selectList(type, dataId, detectType);
        if (!list.isEmpty()) {
            return list.stream().map(this::transformMultiple).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    public DetectItemMultipleDTO getMultiple(Integer id) {
        return transformMultiple(mapper.selectByPrimaryKey(id));
    }

    @Override
    public void update(DetectItemMultipleUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectItemMultipleCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

    @Override
    public List<DetectItemMultipleSingleDTO> getListMultipleSingle(Integer type, String dataId, Integer detectType) {
        List<DetectItem> list = mapper.selectList(type, dataId, detectType);
        if (!list.isEmpty()) {
            return list.stream().map(this::transformMultipleSingle).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    public DetectItemMultipleSingleDTO getMultipleSingle(Integer id) {
        return transformMultipleSingle(mapper.selectByPrimaryKey(id));
    }

    @Override
    public void update(DetectItemMultipleSingleUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectItemMultipleSingleCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

    @Override
    public List<DetectItemOutcomeDTO> getListOutcome(Integer type, String dataId, Integer detectType) {
        List<DetectItem> list = mapper.selectList(type, dataId, detectType);
        if (!list.isEmpty()) {
            return list.stream().map(this::transformOutcome).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    public DetectItemOutcomeDTO getOutcome(Integer id) {
        return transformOutcome(mapper.selectByPrimaryKey(id));
    }

    @Override
    public void update(DetectItemOutcomeUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectItemOutcomeCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

    private DetectItemValueDTO transformValue(DetectItem item) {
        DetectItemValueDTO dto = DetectItemValueDTO.builder().build();
        BeanUtils.copyProperties(item, dto);
        dto.setCheckTime(DateTimeUtil.timestampToString(item.getCheckTime()));
        return dto;
    }

    private DetectItemSingleDTO transformSingle(DetectItem item) {
        DetectItemSingleDTO dto = DetectItemSingleDTO.builder().build();
        BeanUtils.copyProperties(item, dto);
        dto.setCheckTime(DateTimeUtil.timestampToString(item.getCheckTime()));
        return dto;
    }

    private DetectItemMultipleDTO transformMultiple(DetectItem item) {
        DetectItemMultipleDTO dto = DetectItemMultipleDTO.builder().build();
        BeanUtils.copyProperties(item, dto);
        dto.setCheckTime(DateTimeUtil.timestampToString(item.getCheckTime()));
        return dto;
    }

    private DetectItemMultipleSingleDTO transformMultipleSingle(DetectItem item) {
        DetectItemMultipleSingleDTO dto = DetectItemMultipleSingleDTO.builder().build();
        BeanUtils.copyProperties(item, dto);
        dto.setCheckTime(DateTimeUtil.timestampToString(item.getCheckTime()));
        return dto;
    }

    private DetectItemOutcomeDTO transformOutcome(DetectItem item) {
        DetectItemOutcomeDTO dto = DetectItemOutcomeDTO.builder().build();
        BeanUtils.copyProperties(item, dto);
        dto.setCheckTime(DateTimeUtil.timestampToString(item.getCheckTime()));
        return dto;
    }


}
