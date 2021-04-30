package com.nickel.medicalrecord.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HospitalDiagnosticRecordsUpdateDTO {

    /**
     * 诊断记录ID
     */
    @ApiModelProperty(value = "诊断记录ID")
    private Integer id;

    /**
     * 脑梗死：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "脑梗死：0-未选，1-肯定，2-可能")
    private Integer cerebralInfarction;

    /**
     * 脑梗死TOAST：1-大动脉粥样硬化型，2-小动脉病变型，3-心源性，4-其他原因，5-原因不明(以,分割)
     */
    @ApiModelProperty(value = "脑梗死TOAST：1-大动脉粥样硬化型，2-小动脉病变型，3-心源性，4-其他原因，5-原因不明(以,分割)")
    private String cerebralInfarctionTOAST;

    /**
     * 脑梗死TOAST可能性：1-无法确定病因，2-隐源性脑栓塞，3-其他隐源性，4-难分类病因(以,分割)
     */
    @ApiModelProperty(value = "脑梗死TOAST可能性：1-无法确定病因，2-隐源性脑栓塞，3-其他隐源性，4-难分类病因(以,分割)")
    private String cerebralInfarctionPossibility;

    /**
     * 脑出血：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "脑出血：0-未选，1-肯定，2-可能")
    private Integer cerebralHaemorrhage;

    /**
     * 血管性认知障碍：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "血管性认知障碍：0-未选，1-肯定，2-可能")
    private Integer vascularCognitiveImpairment;

    /**
     * 脑小血管病：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "脑小血管病：0-未选，1-肯定，2-可能")
    private Integer cerebralCerebrovascularDisease;

    /**
     * 颅内动脉狭窄：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "颅内动脉狭窄：0-未选，1-肯定，2-可能")
    private Integer intracranialArteryStenosis;

    /**
     * 颈动脉狭窄：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "颈动脉狭窄：0-未选，1-肯定，2-可能")
    private Integer cervicalArteryStenosis;

    /**
     * 椎动脉狭窄：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "椎动脉狭窄：0-未选，1-肯定，2-可能")
    private Integer vertebralArteryStenosis;

    /**
     * 冠心病：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "冠心病：0-未选，1-肯定，2-可能")
    private Integer coronaryHeartDisease;

    /**
     * 房颤：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "房颤：0-未选，1-肯定，2-可能")
    private Integer atrialFibrillation;

    /**
     * 高血压：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "高血压：0-未选，1-肯定，2-可能")
    private Integer hypertension;

    /**
     * 糖尿病：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "糖尿病：0-未选，1-肯定，2-可能")
    private Integer diabetes;

    /**
     * 高脂血症：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "高脂血症：0-未选，1-肯定，2-可能")
    private Integer hyperlipidemia;

    /**
     * 同型半胱氨酸血症：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "同型半胱氨酸血症：0-未选，1-肯定，2-可能")
    private Integer homocysteineemia;

    /**
     * 高尿酸血症：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "高尿酸血症：0-未选，1-肯定，2-可能")
    private Integer hyperuricAcidemia;

    /**
     * 慢性阻塞性肺疾病：0-未选，1-肯定，2-可能
     */
    @ApiModelProperty(value = "慢性阻塞性肺疾病：0-未选，1-肯定，2-可能")
    private Integer chronicObstructivePulmonaryDisease;

    /**
     * 进展性脑卒中
     */
    @ApiModelProperty(value = "进展性脑卒中")
    private Integer progressiveStroke;

    /**
     * 蛛网膜下腔出血
     */
    @ApiModelProperty(value = "蛛网膜下腔出血")
    private Integer cobwebSubcavityBleeding;

    /**
     * 心绞痛
     */
    @ApiModelProperty(value = "心绞痛")
    private Integer angina;

    /**
     * 心肌梗死
     */
    @ApiModelProperty(value = "心肌梗死")
    private Integer myocardialInfarction;

    /**
     * 下肢动脉病变
     */
    @ApiModelProperty(value = "下肢动脉病变")
    private Integer lowerLimbArtery;

    /**
     * 下肢深静脉血栓
     */
    @ApiModelProperty(value = "下肢深静脉血栓")
    private Integer lowerLimbVeins;

    /**
     * 肺部感染
     */
    @ApiModelProperty(value = "肺部感染")
    private Integer lungInfections;

    /**
     * 泌尿系感染
     */
    @ApiModelProperty(value = "泌尿系感染")
    private Integer urinaryTractInfection;

    /**
     * 应激性溃疡
     */
    @ApiModelProperty(value = "应激性溃疡")
    private Integer stressUlcers;

    private String description;

}