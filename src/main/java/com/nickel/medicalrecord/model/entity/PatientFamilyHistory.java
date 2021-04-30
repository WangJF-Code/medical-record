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
public class PatientFamilyHistory {
    /**
     * 家族病史ID
     */
    @ApiModelProperty(value = "家族病史ID")
    private Integer id;

    /**
     * 人员ID
     */
    @ApiModelProperty(value = "人员ID")
    private String patientId;

    /**
     * 既往卒中史:0-否,1-是
     */
    @ApiModelProperty(value = "既往卒中史:0-否,1-是")
    private Integer priorStroke;

    /**
     * 患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)
     */
    @ApiModelProperty(value = "患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)")
    private String priorStrokePatient;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String priorStrokeText;

    /**
     * 高血压:0-否,1-是
     */
    @ApiModelProperty(value = "高血压:0-否,1-是")
    private Integer hypertension;

    /**
     * 患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)
     */
    @ApiModelProperty(value = "患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)")
    private String hypertensionPatient;

    private String hypertensionText;

    /**
     * 糖尿病:0-否,1-是
     */
    @ApiModelProperty(value = "糖尿病:0-否,1-是")
    private Integer diabetes;

    /**
     * 患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)
     */
    @ApiModelProperty(value = "患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)")
    private String diabetesPatient;

    private String diabetesText;

    /**
     * 高脂血:0-否,1-是
     */
    @ApiModelProperty(value = "高脂血:0-否,1-是")
    private Integer hyperlipemia;

    /**
     * 患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)
     */
    @ApiModelProperty(value = "患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)")
    private String hyperlipemiaPatient;

    private String hyperlipemiaText;

    /**
     * 心脑血管病:0-否,1-是
     */
    @ApiModelProperty(value = "心脑血管病:0-否,1-是")
    private Integer cardiovascular;

    /**
     * 患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)
     */
    @ApiModelProperty(value = "患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)")
    private String cardiovascularPatient;

    private String cardiovascularText;

    /**
     * 痴呆:0-否,1-是
     */
    @ApiModelProperty(value = "痴呆:0-否,1-是")
    private Integer dementia;

    /**
     * 患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)
     */
    @ApiModelProperty(value = "患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)")
    private String dementiaPatient;

    private String dementiaText;

    /**
     * 偏头痛病:0-否,1-是
     */
    @ApiModelProperty(value = "偏头痛病:0-否,1-是")
    private Integer migraine;

    /**
     * 患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)
     */
    @ApiModelProperty(value = "患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)")
    private String migrainePatient;

    private String migraineText;

    /**
     * 免疫疾病:0-否,1-是
     */
    @ApiModelProperty(value = "免疫疾病:0-否,1-是")
    private Integer immunity;

    /**
     * 患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)
     */
    @ApiModelProperty(value = "患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)")
    private String immunityPatient;

    private String immunityText;

    /**
     * 其他疾病:0-否,1-是
     */
    @ApiModelProperty(value = "其他疾病:0-否,1-是")
    private Integer other;

    /**
     * 患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)
     */
    @ApiModelProperty(value = "患者：1-父亲,2-母亲,3-兄弟(以‘，’分割)")
    private String otherPatient;

    private String otherText;

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