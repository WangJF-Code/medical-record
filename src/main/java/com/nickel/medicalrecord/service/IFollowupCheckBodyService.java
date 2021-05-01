package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.dto.FollowupCheckBodyCreateDTO;
import com.nickel.medicalrecord.model.dto.FollowupCheckBodyDTO;
import com.nickel.medicalrecord.model.dto.FollowupCheckBodyUpdateDTO;

import java.util.List;

public interface IFollowupCheckBodyService {
    List<FollowupCheckBodyDTO> getList(String followupRecordsId);

    FollowupCheckBodyDTO get(Integer id);

    void update(FollowupCheckBodyUpdateDTO updateDTO);

    void create(FollowupCheckBodyCreateDTO createDTO);
}
