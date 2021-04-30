package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.DetectInflammatoryMedia;
import com.nickel.medicalrecord.repository.IDetectInflammatoryMediaMapper;
import com.nickel.medicalrecord.service.IDetectInflammatoryMediaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<DetectInflammatoryMedia> getList(Integer type, String dataId) {
        return mapper.selectList(type, dataId);
    }

    @Override
    public DetectInflammatoryMedia get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(DetectInflammatoryMedia updateDTO) {
        mapper.updateByPrimaryKeySelective(updateDTO);
    }

    @Override
    public void create(DetectInflammatoryMedia createDTO) {
        mapper.insert(createDTO);
    }

}
