package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.HospitalCheckBodyCreateDTO;
import com.nickel.medicalrecord.model.dto.HospitalCheckBodyDTO;
import com.nickel.medicalrecord.model.dto.HospitalCheckBodyUpdateDTO;
import com.nickel.medicalrecord.model.entity.CheckBodyIndex;
import com.nickel.medicalrecord.model.entity.CheckEvaluationIndex;
import com.nickel.medicalrecord.model.entity.HospitalCheckBody;
import com.nickel.medicalrecord.repository.ICheckBodyIndexMapper;
import com.nickel.medicalrecord.repository.ICheckEvaluationIndexMapper;
import com.nickel.medicalrecord.repository.IHospitalCheckBodyMapper;
import com.nickel.medicalrecord.service.IHospitalCheckBodyService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * 类描述：
 *
 * @ClassName HospitalCheckBodyService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 14:51
 * @Version 1.0
 */
@Service
@Slf4j
public class HospitalCheckBodyService implements IHospitalCheckBodyService {

    private IHospitalCheckBodyMapper mapper;

    private ICheckBodyIndexMapper bodyIndexMapper;

    private ICheckEvaluationIndexMapper evaluationIndexMapper;

    @Autowired
    public void setMapper(IHospitalCheckBodyMapper mapper) {
        this.mapper = mapper;
    }

    @Autowired
    public void setBodyIndexMapper(ICheckBodyIndexMapper bodyIndexMapper) {
        this.bodyIndexMapper = bodyIndexMapper;
    }

    @Autowired
    public void setEvaluationIndexMapper(ICheckEvaluationIndexMapper evaluationIndexMapper) {
        this.evaluationIndexMapper = evaluationIndexMapper;
    }


    @Override
    public List<HospitalCheckBodyDTO> getList(String hospitalRecordsId) {
        return mapper.selectByHospitalRecordsId(hospitalRecordsId);
    }

    @Override
    public HospitalCheckBodyDTO get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void update(HospitalCheckBodyUpdateDTO updateDTO) {
        HospitalCheckBodyDTO hospitalCheckBodyDTO = get(updateDTO.getId());
        if (Objects.nonNull(updateDTO.getBodyIndex())) {
            updateDTO.getBodyIndex().setId(hospitalCheckBodyDTO.getCheckBodyIndexId());
            CheckBodyIndex bodyIndex = EntityTransformUtils.transform(updateDTO.getBodyIndex());
            bodyIndexMapper.updateByPrimaryKeySelective(bodyIndex);
        }
        if (Objects.nonNull(updateDTO.getEvaluationIndex())) {
            updateDTO.getEvaluationIndex().setId(hospitalCheckBodyDTO.getCheckEvaluationIndexId());
            CheckEvaluationIndex evaluationIndex = EntityTransformUtils.transform(updateDTO.getEvaluationIndex());
            evaluationIndexMapper.updateByPrimaryKeySelective(evaluationIndex);
        }
        HospitalCheckBody checkBody = EntityTransformUtils.transform(updateDTO);
        mapper.updateByPrimaryKeySelective(checkBody);
    }

    @Override
    @Transactional
    public void create(HospitalCheckBodyCreateDTO createDTO) {
        CheckBodyIndex bodyIndex = EntityTransformUtils.transform(createDTO.getBodyIndex());
        bodyIndexMapper.insert(bodyIndex);
        CheckEvaluationIndex evaluationIndex = EntityTransformUtils.transform(createDTO.getEvaluationIndex());
        evaluationIndexMapper.insert(evaluationIndex);
        HospitalCheckBody checkBody = EntityTransformUtils.transform(createDTO);
        checkBody.setCheckBodyIndexId(bodyIndex.getId());
        checkBody.setCheckEvaluationIndexId(evaluationIndex.getId());
        mapper.insert(checkBody);
    }
}
