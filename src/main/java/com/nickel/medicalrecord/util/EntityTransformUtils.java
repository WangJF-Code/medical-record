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

    public static HospitalVascular transform(HospitalVascularDTO createDTO) {
        HospitalVascular entity = HospitalVascular.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static HospitalVascularEvent transform(HospitalVascularEventDTO createDTO) {
        HospitalVascularEvent entity = HospitalVascularEvent.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
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

    public static DetectAntiplateletDrugGenes transform(DetectAntiplateletDrugGenesDTO createDTO) {
        DetectAntiplateletDrugGenes entity = DetectAntiplateletDrugGenes.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemOutcomeDTO createDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemMultipleSingleDTO createDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemMultipleDTO createDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemSingleDTO createDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
        return entity;
    }

    public static DetectItem transform(DetectItemValueDTO createDTO) {
        DetectItem entity = DetectItem.builder().build();
        BeanUtils.copyProperties(createDTO, entity);
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

}
