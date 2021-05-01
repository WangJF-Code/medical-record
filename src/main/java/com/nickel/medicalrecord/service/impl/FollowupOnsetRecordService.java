package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.FollowupOnsetRecordDTO;
import com.nickel.medicalrecord.model.dto.FollowupOnsetRecordSaveDTO;
import com.nickel.medicalrecord.model.dto.FollowupOnsetTypeDTO;
import com.nickel.medicalrecord.model.entity.FollowupOnsetRecord;
import com.nickel.medicalrecord.repository.IFollowupOnsetRecordMapper;
import com.nickel.medicalrecord.service.IFollowupOnsetRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FollowupOnsetRecordService implements IFollowupOnsetRecordService {

    private IFollowupOnsetRecordMapper mapper;

    @Autowired
    public void setMapper(IFollowupOnsetRecordMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public FollowupOnsetRecordDTO get(String followupRecordsId) {
        return mapper.selectByFollowupRecordsId(followupRecordsId);
    }

    @Override
    public void save(FollowupOnsetRecordSaveDTO saveDTO) {
        mapper.deleteByFollowupRecordsId(saveDTO.getFollowupRecordsId());
        for (FollowupOnsetTypeDTO onsetTypeDTO : saveDTO.getOnsetTypeDTOList()) {
            FollowupOnsetRecord followupOnsetRecord = FollowupOnsetRecord.builder().build();
            copy(saveDTO, followupOnsetRecord);
            copy(onsetTypeDTO, followupOnsetRecord);
            mapper.insert(followupOnsetRecord);
        }
    }

    private void copy(FollowupOnsetRecordSaveDTO saveDTO, FollowupOnsetRecord drugRecord) {
        BeanUtils.copyProperties(saveDTO, drugRecord);
    }

    private void copy(FollowupOnsetTypeDTO onsetTypeDTO, FollowupOnsetRecord drugRecord) {
        BeanUtils.copyProperties(onsetTypeDTO, drugRecord);
    }

}
