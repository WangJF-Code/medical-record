package com.nickel.medicalrecord.util;

import com.nickel.medicalrecord.model.dto.*;
import com.nickel.medicalrecord.model.entity.*;
import org.springframework.beans.BeanUtils;

/**
 * 类描述：
 *
 * @ClassName EntityTransformUtils
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 15:38
 * @Version 1.0
 */
public class EntityTransformUtils {

    public static HospitalRecords transform(HospitalRecordsCreateDTO createDTO) {
        HospitalRecords entity = HospitalRecords.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static HospitalRecords transform(HospitalRecordsUpdateDTO updateDTO) {
        HospitalRecords entity = HospitalRecords.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static HospitalCheckBody transform(HospitalCheckBodyCreateDTO createDTO) {
        HospitalCheckBody entity = HospitalCheckBody.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static HospitalCheckBody transform(HospitalCheckBodyUpdateDTO updateDTO) {
        HospitalCheckBody entity = HospitalCheckBody.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static CheckBodyIndex transform(CheckBodyIndexDTO indexDTO) {
        CheckBodyIndex entity = CheckBodyIndex.builder().build();
        BeanUtils.copyProperties(indexDTO, entity);
        return entity;
    }

    public static CheckBodyIndex transform(CheckBodyIndexSaveDTO indexSaveDTO) {
        CheckBodyIndex entity = CheckBodyIndex.builder().build();
        BeanUtils.copyProperties(indexSaveDTO, entity);
        return entity;
    }

    public static CheckEvaluationIndex transform(CheckEvaluationIndexDTO indexDTO) {
        CheckEvaluationIndex entity = CheckEvaluationIndex.builder().build();
        BeanUtils.copyProperties(indexDTO, entity);
        return entity;
    }

    public static CheckEvaluationIndex transform(CheckEvaluationIndexSaveDTO indexSaveDTO) {
        CheckEvaluationIndex entity = CheckEvaluationIndex.builder().build();
        BeanUtils.copyProperties(indexSaveDTO, entity);
        return entity;
    }

    public static HospitalDiagnosticRecords transform(HospitalDiagnosticRecordsCreateDTO createDTO) {
        HospitalDiagnosticRecords entity = HospitalDiagnosticRecords.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static HospitalDiagnosticRecords transform(HospitalDiagnosticRecordsUpdateDTO updateDTO) {
        HospitalDiagnosticRecords entity = HospitalDiagnosticRecords.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static HospitalTreatmentRecords transform(HospitalTreatmentRecordsCreateDTO createDTO) {
        HospitalTreatmentRecords entity = HospitalTreatmentRecords.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static HospitalTreatmentRecords transform(HospitalTreatmentRecordsUpdateDTO updateDTO) {
        HospitalTreatmentRecords entity = HospitalTreatmentRecords.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static HospitalVascular transform(HospitalVascularCreateDTO createDTO) {
        HospitalVascular entity = HospitalVascular.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static HospitalVascular transform(HospitalVascularUpdateDTO updateDTO) {
        HospitalVascular entity = HospitalVascular.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static HospitalVascularEvent transform(HospitalVascularEventSaveDTO saveDTO) {
        HospitalVascularEvent entity = HospitalVascularEvent.builder().build();
        BeanUtils.copyProperties(saveDTO, entity);
        return entity;
    }

    public static MedicationRecord transform(MedicationRecordDTO createDTO) {
        MedicationRecord entity = MedicationRecord.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static MedicationDrugRecord transform(MedicationDrugRecordDTO createDTO) {
        MedicationDrugRecord entity = MedicationDrugRecord.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static DetectAntiplateletDrugGenes transform(DetectAntiplateletDrugGenesCreateDTO createDTO) {
        DetectAntiplateletDrugGenes entity = DetectAntiplateletDrugGenes.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(createDTO.getCheckTime()));
        return entity;
    }

    public static DetectAntiplateletDrugGenes transform(DetectAntiplateletDrugGenesUpdateDTO updateDTO) {
        DetectAntiplateletDrugGenes entity = DetectAntiplateletDrugGenes.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(updateDTO.getCheckTime()));
        return entity;
    }

    public static DetectAntiplateletDrugGenesDTO transform(DetectAntiplateletDrugGenes entity) {
        DetectAntiplateletDrugGenesDTO dto = DetectAntiplateletDrugGenesDTO.builder().build();
        BeanUtils.copyProperties(entity, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(entity.getCheckTime()));
        return dto;
    }

    public static DetectBiochemicalFullItem transform(DetectBiochemicalFullItemCreateDTO createDTO) {
        DetectBiochemicalFullItem entity = DetectBiochemicalFullItem.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(createDTO.getCheckTime()));
        return entity;
    }

    public static DetectBiochemicalFullItem transform(DetectBiochemicalFullItemUpdateDTO updateDTO) {
        DetectBiochemicalFullItem entity = DetectBiochemicalFullItem.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(updateDTO.getCheckTime()));
        return entity;
    }

    public static DetectBiochemicalFullItemDTO transform(DetectBiochemicalFullItem entity) {
        DetectBiochemicalFullItemDTO dto = DetectBiochemicalFullItemDTO.builder().build();
        BeanUtils.copyProperties(entity, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(entity.getCheckTime()));
        return dto;
    }

    public static DetectBloodRoutine transform(DetectBloodRoutineCreateDTO createDTO) {
        DetectBloodRoutine entity = DetectBloodRoutine.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(createDTO.getCheckTime()));
        return entity;
    }

    public static DetectBloodRoutine transform(DetectBloodRoutineUpdateDTO updateDTO) {
        DetectBloodRoutine entity = DetectBloodRoutine.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(updateDTO.getCheckTime()));
        return entity;
    }

    public static DetectBloodRoutineDTO transform(DetectBloodRoutine entity) {
        DetectBloodRoutineDTO dto = DetectBloodRoutineDTO.builder().build();
        BeanUtils.copyProperties(entity, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(entity.getCheckTime()));
        return dto;
    }

    public static DetectClottingRoutine transform(DetectClottingRoutineCreateDTO createDTO) {
        DetectClottingRoutine entity = DetectClottingRoutine.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(createDTO.getCheckTime()));
        return entity;
    }

    public static DetectClottingRoutine transform(DetectClottingRoutineUpdateDTO updateDTO) {
        DetectClottingRoutine entity = DetectClottingRoutine.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(updateDTO.getCheckTime()));
        return entity;
    }

    public static DetectClottingRoutineDTO transform(DetectClottingRoutine entity) {
        DetectClottingRoutineDTO dto = DetectClottingRoutineDTO.builder().build();
        BeanUtils.copyProperties(entity, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(entity.getCheckTime()));
        return dto;
    }


    public static DetectEkg transform(DetectEkgCreateDTO createDTO) {
        DetectEkg entity = DetectEkg.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(createDTO.getCheckTime()));
        return entity;
    }

    public static DetectEkg transform(DetectEkgUpdateDTO updateDTO) {
        DetectEkg entity = DetectEkg.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(updateDTO.getCheckTime()));
        return entity;
    }

    public static DetectEkgDTO transform(DetectEkg entity) {
        DetectEkgDTO dto = DetectEkgDTO.builder().build();
        BeanUtils.copyProperties(entity, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(entity.getCheckTime()));
        return dto;
    }

    public static DetectInflammatoryMedia transform(DetectInflammatoryMediaCreateDTO createDTO) {
        DetectInflammatoryMedia entity = DetectInflammatoryMedia.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(createDTO.getCheckTime()));
        return entity;
    }

    public static DetectInflammatoryMedia transform(DetectInflammatoryMediaUpdateDTO updateDTO) {
        DetectInflammatoryMedia entity = DetectInflammatoryMedia.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(updateDTO.getCheckTime()));
        return entity;
    }

    public static DetectInflammatoryMediaDTO transform(DetectInflammatoryMedia entity) {
        DetectInflammatoryMediaDTO dto = DetectInflammatoryMediaDTO.builder().build();
        BeanUtils.copyProperties(entity, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(entity.getCheckTime()));
        return dto;
    }

    public static DetectSwi transform(DetectSwiCreateDTO createDTO) {
        DetectSwi entity = DetectSwi.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(createDTO.getCheckTime()));
        return entity;
    }

    public static DetectSwi transform(DetectSwiUpdateDTO updateDTO) {
        DetectSwi entity = DetectSwi.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(updateDTO.getCheckTime()));
        return entity;
    }

    public static DetectSwiDTO transform(DetectSwi entity) {
        DetectSwiDTO dto = DetectSwiDTO.builder().build();
        BeanUtils.copyProperties(entity, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(entity.getCheckTime()));
        return dto;
    }

    public static DetectThirteenBloodLipids transform(DetectThirteenBloodLipidsCreateDTO createDTO) {
        DetectThirteenBloodLipids entity = DetectThirteenBloodLipids.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(createDTO.getCheckTime()));
        return entity;
    }

    public static DetectThirteenBloodLipids transform(DetectThirteenBloodLipidsUpdateDTO updateDTO) {
        DetectThirteenBloodLipids entity = DetectThirteenBloodLipids.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(updateDTO.getCheckTime()));
        return entity;
    }

    public static DetectThirteenBloodLipidsDTO transform(DetectThirteenBloodLipids entity) {
        DetectThirteenBloodLipidsDTO dto = DetectThirteenBloodLipidsDTO.builder().build();
        BeanUtils.copyProperties(entity, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(entity.getCheckTime()));
        return dto;
    }

    public static DetectThyroidFunction transform(DetectThyroidFunctionCreateDTO createDTO) {
        DetectThyroidFunction entity = DetectThyroidFunction.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(createDTO.getCheckTime()));
        return entity;
    }

    public static DetectThyroidFunction transform(DetectThyroidFunctionUpdateDTO updateDTO) {
        DetectThyroidFunction entity = DetectThyroidFunction.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        entity.setCheckTime(DateTimeUtil.stringToTimestamp(updateDTO.getCheckTime()));
        return entity;
    }

    public static DetectThyroidFunctionDTO transform(DetectThyroidFunction entity) {
        DetectThyroidFunctionDTO dto = DetectThyroidFunctionDTO.builder().build();
        BeanUtils.copyProperties(entity, dto);
        dto.setCheckTimeStr(DateTimeUtil.timestampToString(entity.getCheckTime()));
        return dto;
    }

    public static DetectItem transform(DetectItemOutcomeCreateDTO createDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemOutcomeUpdateDTO updateDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemMultipleSingleCreateDTO createDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemMultipleSingleUpdateDTO updateDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemMultipleCreateDTO createDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemMultipleUpdateDTO updateDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemSingleCreateDTO createDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemSingleUpdateDTO updateDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemValueCreateDTO createDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemValueUpdateDTO updateDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static FollowupRecords transform(FollowupRecordsCreateDTO createDTO) {
        FollowupRecords entity = FollowupRecords.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static FollowupRecords transform(FollowupRecordsUpdateDTO updateDTO) {
        FollowupRecords entity = FollowupRecords.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static FollowupCheckBody transform(FollowupCheckBodyCreateDTO createDTO) {
        FollowupCheckBody entity = FollowupCheckBody.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static FollowupCheckBody transform(FollowupCheckBodyUpdateDTO updateDTO) {
        FollowupCheckBody entity = FollowupCheckBody.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

    public static FollowupVascularEventRecord transform(FollowupVascularEventRecordCreateDTO createDTO) {
        FollowupVascularEventRecord entity = FollowupVascularEventRecord.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static FollowupVascularEventRecord transform(FollowupVascularEventRecordUpdateDTO updateDTO) {
        FollowupVascularEventRecord entity = FollowupVascularEventRecord.builder().build();
        BeanUtils.copyProperties(updateDTO, entity);
        return entity;
    }

}
