package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.DetectEkgCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectEkgDTO;
import com.nickel.medicalrecord.model.dto.DetectEkgUpdateDTO;
import com.nickel.medicalrecord.model.entity.DetectEkg;
import com.nickel.medicalrecord.repository.IDetectEkgMapper;
import com.nickel.medicalrecord.service.IDetectEkgService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 类描述：
 *
 * @ClassName DetectEkgService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 23:16
 * @Version 1.0
 */
@Service
@Slf4j
public class DetectEkgService implements IDetectEkgService {

    private IDetectEkgMapper mapper;

    @Autowired
    public void setMapper(IDetectEkgMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<DetectEkgDTO> getList(Integer type, String dataId) {
        List<DetectEkg> list = mapper.selectList(type, dataId);
        return list.stream().map(EntityTransformUtils::transform).collect(Collectors.toList());
    }

    @Override
    public DetectEkgDTO get(Integer id) {
        DetectEkg detectEkg = mapper.selectByPrimaryKey(id);
        return EntityTransformUtils.transform(detectEkg);
    }

    @Override
    public void update(DetectEkgUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectEkgCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }

}
