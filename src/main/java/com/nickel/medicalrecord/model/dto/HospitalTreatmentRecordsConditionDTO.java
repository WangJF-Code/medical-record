package com.nickel.medicalrecord.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HospitalTreatmentRecordsConditionDTO {

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
    private List<String> thrombosisPreventionTypesList;

    /**
     * 入院后是否给予抗血小板治疗
     */
    @ApiModelProperty(value = "入院后是否给予抗血小板治疗")
    private Integer antiplatelets;

    /**
     * 抗血小板药物名称
     */
    @ApiModelProperty(value = "抗血小板药物名称")
    private List<String> antiplateletsDrugsList;

    /**
     * 入院后是否给予抗凝治疗
     */
    @ApiModelProperty(value = "入院后是否给予抗凝治疗")
    private Integer anticoagulant;

    /**
     * 抗凝药物名称
     */
    @ApiModelProperty(value = "抗凝药物名称")
    private List<String> anticoagulantDrugsList;

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
     * 是否留置胃管
     */
    @ApiModelProperty(value = "是否留置胃管")
    private Integer gastricTube;

    /**
     * 是否留置尿管
     */
    @ApiModelProperty(value = "是否留置尿管")
    private Integer ureter;

}