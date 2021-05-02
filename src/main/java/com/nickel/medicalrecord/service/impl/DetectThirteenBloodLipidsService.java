package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.DetectThirteenBloodLipidsCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectThirteenBloodLipidsDTO;
import com.nickel.medicalrecord.model.dto.DetectThirteenBloodLipidsUpdateDTO;
import com.nickel.medicalrecord.model.entity.DetectThirteenBloodLipids;
import com.nickel.medicalrecord.repository.IDetectThirteenBloodLipidsMapper;
import com.nickel.medicalrecord.service.IDetectThirteenBloodLipidsService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 类描述：
 *
 * @ClassName DetectThirteenBloodLipidsService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:19
 * @Version 1.0
 */
@Service
@Slf4j
public class DetectThirteenBloodLipidsService implements IDetectThirteenBloodLipidsService {

    private IDetectThirteenBloodLipidsMapper mapper;

    @Autowired
    public void setMapper(IDetectThirteenBloodLipidsMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<DetectThirteenBloodLipidsDTO> getList(Integer type, String dataId) {
        List<DetectThirteenBloodLipids> list = mapper.selectList(type, dataId);
        return list.stream().map(EntityTransformUtils::transform).collect(Collectors.toList());
    }

    @Override
    public DetectThirteenBloodLipidsDTO get(Integer id) {
        DetectThirteenBloodLipids entity = mapper.selectByPrimaryKey(id);
        return EntityTransformUtils.transform(entity);
    }

    @Override
    public void update(DetectThirteenBloodLipidsUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectThirteenBloodLipidsCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

}
