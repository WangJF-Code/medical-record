package com.nickel.medicalrecord.service;

import com.nickel.medicalrecord.model.Page;
import com.nickel.medicalrecord.model.dto.*;

public interface IAdvancedSearchService {
    Page<HospitalRecordsDTO> hospitalList(AdvancedSearchHospitalDTO search, Integer pageCurrent, Integer pageSize);

    Page<HospitalFollowupDTO> followupList(AdvancedSearchFollowupDTO search, Integer pageCurrent, Integer pageSize);

    AuxiliaryCheckDTO getAuxiliaryCheck(Integer type, String dataId);
}
