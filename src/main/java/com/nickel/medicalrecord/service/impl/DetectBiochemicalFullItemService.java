package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.DetectBiochemicalFullItem;
import com.nickel.medicalrecord.repository.IDetectBiochemicalFullItemMapper;
import com.nickel.medicalrecord.service.IDetectBiochemicalFullItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<DetectBiochemicalFullItem> getList(Integer type, String dataId) {
        return mapper.selectList(type, dataId);
    }

    @Override
    public DetectBiochemicalFullItem get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(DetectBiochemicalFullItem updateDTO) {
        mapper.updateByPrimaryKeySelective(updateDTO);
    }

    @Override
    public void create(DetectBiochemicalFullItem createDTO) {
        mapper.insert(createDTO);
    }
}
