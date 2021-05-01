package com.nickel.medicalrecord.service.impl;

import com.nickel.medicalrecord.model.dto.FollowupDrugRecordDTO;
import com.nickel.medicalrecord.model.dto.FollowupDrugRecordSaveDTO;
import com.nickel.medicalrecord.model.dto.FollowupDrugTypeDTO;
import com.nickel.medicalrecord.model.entity.FollowupDrugRecord;
import com.nickel.medicalrecord.repository.IFollowupDrugRecordMapper;
import com.nickel.medicalrecord.service.IFollowupDrugRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class FollowupDrugRecordService implements IFollowupDrugRecordService {

    private IFollowupDrugRecordMapper mapper;

    @Autowired
    public void setMapper(IFollowupDrugRecordMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public FollowupDrugRecordDTO get(String followupRecordsId) {
        return mapper.selectByFollowupRecordsId(followupRecordsId);
    }

    @Override
    @Transactional
    public void save(FollowupDrugRecordSaveDTO updateDTO) {
        mapper.deleteByFollowupRecordsId(updateDTO.getFollowupRecordsId());
        for (FollowupDrugTypeDTO followupDrugTypeDTO : updateDTO.getDrugTypeDTOList()) {
            FollowupDrugRecord drugRecord = FollowupDrugRecord.builder()
                    .patientId(updateDTO.getPatientId())
                    .followupRecordsId(updateDTO.getFollowupRecordsId())
                    .eatDrug(updateDTO.getEatDrug())
                    .eatDrugType(followupDrugTypeDTO.getEatDrugType())
                    .eatDrugText(followupDrugTypeDTO.getEatDrugText())
                    .description(updateDTO.getDescription())
                    .build();
            mapper.insert(drugRecord);
        }
    }

}
