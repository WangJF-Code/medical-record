package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.dto.HospitalRecordsConditionDTO;
import com.nickel.medicalrecord.model.dto.HospitalRecordsCreateDTO;
import com.nickel.medicalrecord.model.dto.HospitalRecordsDTO;
import com.nickel.medicalrecord.model.dto.HospitalRecordsUpdateDTO;
import com.nickel.medicalrecord.model.entity.HospitalRecords;
import com.nickel.medicalrecord.repository.IHospitalRecordsMapper;
import com.nickel.medicalrecord.service.IHospitalRecordsService;
import com.nickel.medicalrecord.util.EntityTransformUtils;
import com.nickel.medicalrecord.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName HospitalRecordsService
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 11:16
 * @Version 1.0
 */
@Service
@Slf4j
public class HospitalRecordsService implements IHospitalRecordsService {

    public static final String ID_HEAD = "BL";

    private IHospitalRecordsMapper mapper;

    @Autowired
    public void setMapper(IHospitalRecordsMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void create(HospitalRecordsCreateDTO createDTO) {
        HospitalRecords hospitalRecords = EntityTransformUtils.transform(createDTO);
        Integer count = mapper.findTodayCount(IdUtil.getToday(ID_HEAD));
        hospitalRecords.setId(IdUtil.getUserId(ID_HEAD, count));
        mapper.insert(hospitalRecords);
    }

    @Override
    public void update(HospitalRecordsUpdateDTO updateDTO) {
        HospitalRecords hospitalRecords = EntityTransformUtils.transform(updateDTO);
        mapper.updateByPrimaryKeySelective(hospitalRecords);
    }

    @Override
    public HospitalRecordsDTO get(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HospitalRecordsDTO> getList(HospitalRecordsConditionDTO conditionDTO) {
        return mapper.selectList(conditionDTO);
    }

    @Override
    public Page<HospitalRecordsDTO> getPage(HospitalRecordsConditionDTO conditionDTO, Integer pageCurrent, Integer pageSize) {
        Integer count = mapper.findCount(conditionDTO);
        List<HospitalRecordsDTO> list = mapper.findPage(conditionDTO, pageCurrent * pageSize - pageSize, pageSize);
        return Page.<HospitalRecordsDTO>builder()
                .count(count)
                .currPage(pageCurrent)
                .pageSize(pageSize)
                .data(list)
                .build();
    }
}
