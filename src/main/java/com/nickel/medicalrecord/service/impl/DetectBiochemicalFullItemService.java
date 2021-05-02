package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.DetectBiochemicalFullItemCreateDTO;
import com.nickel.medicalrecord.model.dto.DetectBiochemicalFullItemDTO;
import com.nickel.medicalrecord.model.dto.DetectBiochemicalFullItemUpdateDTO;
import com.nickel.medicalrecord.model.entity.DetectBiochemicalFullItem;
import com.nickel.medicalrecord.repository.IDetectBiochemicalFullItemMapper;
import com.nickel.medicalrecord.service.IDetectBiochemicalFullItemService;
import com.nickel.medicalrecord.util.DateTimeUtil;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 类描述：
 *
 * @ClassName DetectBiochemicalFullItemService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 22:46
 * @Version 1.0
 */
@Service
@Slf4j
public class DetectBiochemicalFullItemService implements IDetectBiochemicalFullItemService {

    private IDetectBiochemicalFullItemMapper mapper;

    @Autowired
    public void setMapper(IDetectBiochemicalFullItemMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<DetectBiochemicalFullItemDTO> getList(Integer type, String dataId) {
        List<DetectBiochemicalFullItem> list = mapper.selectList(type, dataId);
        return list.stream().map(EntityTransformUtils::transform).collect(Collectors.toList());
    }

    @Override
    public DetectBiochemicalFullItemDTO get(Integer id) {
        DetectBiochemicalFullItem entity = mapper.selectByPrimaryKey(id);
        return EntityTransformUtils.transform(entity);
    }

    @Override
    public void update(DetectBiochemicalFullItemUpdateDTO updateDTO) {
        mapper.updateByPrimaryKeySelective(EntityTransformUtils.transform(updateDTO));
    }

    @Override
    public void create(DetectBiochemicalFullItemCreateDTO createDTO) {
        mapper.insert(EntityTransformUtils.transform(createDTO));
    }
}
