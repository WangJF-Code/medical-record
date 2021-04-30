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
public class PatientDrugHistory {
    /**
     * 个人用药史ID
     */
    @ApiModelProperty(value = "个人用药史ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 抗血小板药物:0-否,1-是
     */
    @ApiModelProperty(value = "抗血小板药物:0-否,1-是")
    private Integer antiplatelet;

    /**
     * 抗血小板药物描述
     */
    @ApiModelProperty(value = "抗血小板药物描述")
    private String antiplateletText;

    /**
     * 药物类型:1-阿司匹林,2-氯吡格雷,3-西洛他唑,4-双嘧达莫(以,分割)
     */
    @ApiModelProperty(value = "药物类型:1-阿司匹林,2-氯吡格雷,3-西洛他唑,4-双嘧达莫(以,分割)")
    private String antiplateletDrugType;

    /**
     * 药物描述
     */
    @ApiModelProperty(value = "药物描述")
    private String antiplateletDrugText;

    /**
     * 口服抗凝药物
     */
    @ApiModelProperty(value = "口服抗凝药物")
    private Integer anticoagulant;

    /**
     * 口服抗凝药物:1-华法林,2-达比加群,3-利伐沙班(以','分割)
     */
    @ApiModelProperty(value = "口服抗凝药物:1-华法林,2-达比加群,3-利伐沙班(以','分割)")
    private String anticoagulantDrugType;

    private String anticoagulantText;

    /**
     * 药物描述
     */
    @ApiModelProperty(value = "药物描述")
    private String anticoagulantDrugText;

    /**
     * 降压治疗:0-不需要,1-未服用,2-已服用,3-偶尔服用
     */
    @ApiModelProperty(value = "降压治疗:0-不需要,1-未服用,2-已服用,3-偶尔服用")
    private Integer lowerBloodPressure;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String lowerBloodPressureText;

    /**
     * 未服用原因:1-不关注,2-血压忽高忽低，不稳定,3药物副作用不耐受;
     * 已服用:1-钙离子拮剂,2-ACEI类,3-ARB类,4-β受体拮抗剂,5-利尿剂
     * (以‘,’分割)
     */
    @ApiModelProperty(value = "未服用原因:1-不关注,2-血压忽高忽低，不稳定,3药物副作用不耐受;已服用:1-钙离子拮剂,2-ACEI类,3-ARB类,4-β受体拮抗剂,5-利尿剂(以‘,’分割)")
    private String lowerBloodPressureDrugType;

    private String lowerBloodPressureDrugText;

    /**
     * 调节血脂治疗: 参考降压治疗
     */
    @ApiModelProperty(value = "调节血脂治疗: 参考降压治疗")
    private Integer lipidRegulator;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String lipidRegulatorText;

    /**
     * 参考降压治疗
     */
    @ApiModelProperty(value = "参考降压治疗")
    private String lipidRegulatorDrugType;

    private String lipidRegulatorDrugText;

    /**
     * 降糖治疗：参考降压治疗
     */
    @ApiModelProperty(value = "降糖治疗：参考降压治疗")
    private Integer hypoglycemic;

    private String hypoglycemicText;

    /**
     * 参考降压治疗
     */
    @ApiModelProperty(value = "参考降压治疗")
    private String hypoglycemicDrugType;

    private String hypoglycemicDrugText;

    /**
     * 服用益生菌
     */
    @ApiModelProperty(value = "服用益生菌")
    private Integer probiotics;

    private String probioticsText;

    private String probioticsDrugText;

    /**
     * 胃肠动力
     */
    @ApiModelProperty(value = "胃肠动力")
    private Integer gastrointestinalMotivation;

    private String gastrointestinalMotivationText;

    private String gastrointestinalMotivationDrugText;

    /**
     * 泻药
     */
    @ApiModelProperty(value = "泻药")
    private Integer laxative;

    private String laxativeText;

    private String laxativeDrugText;

    /**
     * 抑酸药物
     */
    @ApiModelProperty(value = "抑酸药物")
    private Integer acidSuppression;

    private String acidSuppressionText;

    private String acidSuppressionDrugType;

    /**
     * 扩张冠脉药物
     */
    @ApiModelProperty(value = "扩张冠脉药物")
    private Integer expandTheCrown;

    private String expandTheCrownText;

    private String expandTheCrownDrugType;

    /**
     * 扩血管药物
     */
    @ApiModelProperty(value = "扩血管药物")
    private Integer expandBloodVessels;

    private String expandBloodVesselsText;

    private String expandBloodVesselsDrugType;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Builder.Default
    private Long createTime = System.currentTimeMillis();

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    @Builder.Default
    private Long updateTime = System.currentTimeMillis();

    /**
     * 删除状态
     */
    @ApiModelProperty(value = "删除状态")
    @Builder.Default
    private Integer deleted = 0;
}