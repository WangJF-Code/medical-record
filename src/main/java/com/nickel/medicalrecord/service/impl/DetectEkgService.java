package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.DetectEkg;
import com.nickel.medicalrecord.repository.IDetectEkgMapper;
import com.nickel.medicalrecord.service.IDetectEkgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<DetectEkg> getList(Integer type, String dataId) {
        return mapper.selectList(type, dataId);
    }

    @Override
    public DetectEkg get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(DetectEkg updateDTO) {
        mapper.updateByPrimaryKeySelective(updateDTO);
    }

    @Override
    public void create(DetectEkg createDTO) {
        mapper.insert(createDTO);
    }

}
