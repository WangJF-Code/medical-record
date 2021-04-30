package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.DetectAntiplateletDrugGenesDTO;
import com.nickel.medicalrecord.repository.IDetectAntiplateletDrugGenesMapper;
import com.nickel.medicalrecord.service.IDetectAntiplateletDrugGenesService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return mapper.selectList(type, dataId);
    }

    @Override
    public DetectAntiplateletDrugGenesDTO get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(DetectAntiplateletDrugGenesDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectAntiplateletDrugGenesDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }
}
