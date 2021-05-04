package com.nickel.medicalrecord.repository;

import com.nickel.medicalrecord.model.dto.*;
import com.nickel.medicalrecord.model.entity.DetectItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAdvancedSearchMapper {
    Integer findHospitalCount(@Param("search") AdvancedSearchHospitalDTO search, @Param("idList") List<String> idList);

    List<HospitalRecordsDTO> findHospitalPage(@Param("search") AdvancedSearchHospitalDTO search,
                                              @Param("idList") List<String> idList,
                                              @Param("index") Integer index, @Param("size") Integer size);

    Integer findFollowupCount(@Param("search") AdvancedSearchFollowupDTO search, @Param("idList") List<String> idList);

    List<HospitalFollowupDTO> findFollowupPage(@Param("search") AdvancedSearchFollowupDTO search,
                                               @Param("idList") List<String> idList,
                                               @Param("index") Integer index, @Param("size") Integer size);

    List<String> findHospitalRecordsIdListByDiagnostic(HospitalDiagnosticRecordsConditionDTO diagnosticRecords);

    List<String> findHospitalRecordsIdListByTreatment(HospitalTreatmentRecordsConditionDTO treatmentRecords);

    List<String> findDataIdListByDetectItemMultipleSingle(@Param("type") Integer type,
                                                          @Param("detectItemMultipleSingle") DetectItemMultipleSingleConditionDTO detectItemMultipleSingle);

    List<String> findDataIdListByMedicationRecord(@Param("type") Integer type,
                                                  @Param("medicationDrugRecordList") List<Integer> medicationDrugRecordList);

    List<DetectItem> selectDetectItemList(@Param("type") Integer type, @Param("dataId") String dataId);

    List<String> findFollowupRecordsIdListByDrugRecordList(List<Integer> drugRecordList);

    List<String> findFollowupRecordListByOnsetRecordList(List<Integer> onsetRecordList);

    List<String> findFollowupRecordsIdListByDiagnosticByTOASTList(List<String> toastList);
}
