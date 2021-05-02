package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.DetectAntiplateletDrugGenesCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectAntiplateletDrugGenesDTO;
import com.nickel.medicalrecord.model.dto.DetectAntiplateletDrugGenesUpdateDTO;
import com.nickel.medicalrecord.model.entity.DetectAntiplateletDrugGenes;
import com.nickel.medicalrecord.repository.IDetectAntiplateletDrugGenesMapper;
import com.nickel.medicalrecord.service.IDetectAntiplateletDrugGenesService;
import com.nickel.medicalrecord.util.DateTimeUtil;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 类描述：
 *
 * @ClassName DetectAntiplateletDrugGenesService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 22:32
 * @Version 1.0
 */
@Service
@Slf4j
public class DetectAntiplateletDrugGenesService implements IDetectAntiplateletDrugGenesService {

    private IDetectAntiplateletDrugGenesMapper mapper;

    @Autowired
    public void setMapper(IDetectAntiplateletDrugGenesMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<DetectAntiplateletDrugGenesDTO> getList(Integer type, String dataId) {
        List<DetectAntiplateletDrugGenes> list = mapper.selectList(type, dataId);
        return list.stream().map(EntityTransformUtils::transform).collect(Collectors.toList());
    }

    @Override
    public DetectAntiplateletDrugGenesDTO get(Integer id) {
        DetectAntiplateletDrugGenes entity = mapper.selectByPrimaryKey(id);
        return EntityTransformUtils.transform(entity);
    }

    @Override
    public void update(DetectAntiplateletDrugGenesUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectAntiplateletDrugGenesCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }
}
