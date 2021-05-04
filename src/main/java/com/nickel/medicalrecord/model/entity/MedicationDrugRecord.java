package com.nickel.medicalrecord.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedicationDrugRecord {
    /**
     * 药品ID
     */
    private Integer id;

    /**
     * 服药记录ID
     */
    private Integer medicationRecordId;

    /**
     * 药物类型
     */
    private Integer drugType;

    /**
     * 药物
     */
    private String drug;

    /**
     * 剂量
     */
    private String dosage;

    /**
     * 使用频次
     */
    private String frequency;

    /**
     * 是否为医嘱药物
     */
    private Integer ordersDrug;

}