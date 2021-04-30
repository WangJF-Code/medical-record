package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.entity.DetectThirteenBloodLipids;
import com.nickel.medicalrecord.repository.IDetectThirteenBloodLipidsMapper;
import com.nickel.medicalrecord.service.IDetectThirteenBloodLipidsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<DetectThirteenBloodLipids> getList(Integer type, String dataId) {
        return mapper.selectList(type, dataId);
    }

    @Override
    public DetectThirteenBloodLipids get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(DetectThirteenBloodLipids updateDTO) {
        mapper.updateByPrimaryKeySelective(updateDTO);
    }

    @Override
    public void create(DetectThirteenBloodLipids createDTO) {
        mapper.insert(createDTO);
    }

}
