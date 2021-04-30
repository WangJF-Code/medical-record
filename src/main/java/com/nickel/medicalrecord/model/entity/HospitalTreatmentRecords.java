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
public class HospitalTreatmentRecords {
    /**
     * 治疗记录ID
     */
    @ApiModelProperty(value = "治疗记录ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 住院记录ID
     */
    @ApiModelProperty(value = "住院记录ID")
    private String hospitalRecordsId;

    /**
     * 入院 48 小时内患者能否行走
     */
    @ApiModelProperty(value = "入院 48 小时内患者能否行走")
    private Integer walk;

    /**
     * 是否进行深静脉血栓预防
     */
    @ApiModelProperty(value = "是否进行深静脉血栓预防")
    private Integer thrombosisPrevention;

    /**
     * 预防种类和措施
     */
    @ApiModelProperty(value = "预防种类和措施")
    private String thrombosisPreventionTypes;

    /**
     * 入院后是否给予抗血小板治疗
     */
    @ApiModelProperty(value = "入院后是否给予抗血小板治疗")
    private Integer antiplatelets;

    /**
     * 抗血小板药物名称
     */
    @ApiModelProperty(value = "抗血小板药物名称")
    private String antiplateletsDrugs;

    /**
     * 入院后是否给予抗凝治疗
     */
    @ApiModelProperty(value = "入院后是否给予抗凝治疗")
    private Integer anticoagulant;

    /**
     * 抗凝药物名称
     */
    @ApiModelProperty(value = "抗凝药物名称")
    private String anticoagulantDrugs;

    /**
     * 入院后是否调脂治疗
     */
    @ApiModelProperty(value = "入院后是否调脂治疗")
    private Integer lipid;

    /**
     * 入院后是否强化调脂
     */
    @ApiModelProperty(value = "入院后是否强化调脂")
    private Integer lipidStrengthen;

    /**
     * 调脂药物名称
     */
    @ApiModelProperty(value = "调脂药物名称")
    private String lipidDrugs;

    /**
     * 是否留置胃管
     */
    @ApiModelProperty(value = "是否留置胃管")
    private Integer gastricTube;

    /**
     * 是否留置尿管
     */
    @ApiModelProperty(value = "是否留置尿管")
    private Integer ureter;

    /**
     * 吞咽功能评价
     */
    @ApiModelProperty(value = "吞咽功能评价")
    private String swallowingFunction;

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