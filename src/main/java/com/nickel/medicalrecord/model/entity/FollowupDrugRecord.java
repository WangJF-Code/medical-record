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
public class FollowupDrugRecord {
    /**
     * 服药记录ID
     */
    @ApiModelProperty(value = "服药记录ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 随访ID
     */
    @ApiModelProperty(value = "随访ID")
    private String followupRecordsId;

    /**
     * 是否坚持服药
     */
    @ApiModelProperty(value = "是否坚持服药")
    private Integer eatDrug;

    /**
     * 服药类型
     */
    @ApiModelProperty(value = "服药类型")
    private Integer eatDrugType;

    /**
     * 服用药物(以,分割)
     */
    @ApiModelProperty(value = "服用药物(以,分割)")
    private String eatDrugText;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Builder.Default
    private Long createTime = System.currentTimeMillis();

}