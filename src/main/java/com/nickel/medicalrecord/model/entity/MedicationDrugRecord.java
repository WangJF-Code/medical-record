package com.nickel.medicalrecord.model.entity;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(value="药品ID")
    private Integer id;

    /**
     * 服药记录ID
     */
    @ApiModelProperty(value="服药记录ID")
    private Integer medicationRecordId;

    /**
     * 药物类型
     */
    @ApiModelProperty(value="药物类型")
    private Integer drugType;

    /**
     * 药物
     */
    @ApiModelProperty(value="药物")
    private Integer drug;

    /**
     * 剂量
     */
    @ApiModelProperty(value="剂量")
    private String dosage;

    /**
     * 使用频次
     */
    @ApiModelProperty(value="使用频次")
    private String frequency;

    /**
     * 是否为医嘱药物
     */
    @ApiModelProperty(value="是否为医嘱药物")
    private Integer ordersDrug;

}