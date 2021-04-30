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
public class CheckEvaluationIndex {
    /**
     * 测评指标ID
     */
    @ApiModelProperty(value = "测评指标ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * NIHSS评分
     */
    @ApiModelProperty(value = "NIHSS评分")
    private String NIHSS;

    /**
     * ABCD2评分
     */
    @ApiModelProperty(value = "ABCD2评分")
    private String ABCD2;

    /**
     * CDR评分
     */
    @ApiModelProperty(value = "CDR评分")
    private String CDR;

    /**
     * ADL评分
     */
    @ApiModelProperty(value = "ADL评分")
    private String ADL;

    /**
     * EQ--5D评分
     */
    @ApiModelProperty(value = "EQ--5D评分")
    private String EQ5D;

    /**
     * MMSE评分
     */
    @ApiModelProperty(value = "MMSE评分")
    private String MMSE;

    /**
     * MoCA评分
     */
    @ApiModelProperty(value = "MoCA评分")
    private String moCA;

    /**
     * 数字广度（DS）评分
     */
    @ApiModelProperty(value = "数字广度（DS）评分")
    private String DS;

    /**
     * Stroop 色词评分
     */
    @ApiModelProperty(value = "Stroop 色词评分")
    private String stroop;

    /**
     * 颜色数字连线(CTT)评分
     */
    @ApiModelProperty(value = "颜色数字连线(CTT)评分")
    private String CTT;

    /**
     * 言语流畅性（VFT）评分
     */
    @ApiModelProperty(value = "言语流畅性（VFT）评分")
    private String VFT;

    /**
     * 波士顿命名（BNT）评分
     */
    @ApiModelProperty(value = "波士顿命名（BNT）评分")
    private String BNT;

    /**
     * 复杂图形（Rey）评分
     */
    @ApiModelProperty(value = "复杂图形（Rey）评分")
    private String rey;

    /**
     * 听觉词语记忆测试(AVLT)评分
     */
    @ApiModelProperty(value = "听觉词语记忆测试(AVLT)评分")
    private String AVLT;

    /**
     * HAMD焦虑评分
     */
    @ApiModelProperty(value = "HAMD焦虑评分")
    private String HAMDAnxiety;

    /**
     * HAMD抑郁评分
     */
    @ApiModelProperty(value = "HAMD抑郁评分")
    private String HAMDDepression;

    /**
     * 一字步实验评分
     */
    @ApiModelProperty(value = "一字步实验评分")
    private String oneStepExperiment;

    /**
     * 6米步行测试评分
     */
    @ApiModelProperty(value = "6米步行测试评分")
    private String sixMeterWalking;

    /**
     * 平衡测试评分
     */
    @ApiModelProperty(value = "平衡测试评分")
    private String balance;

    /**
     * 对指评分
     */
    @ApiModelProperty(value = "对指评分")
    private String fingers;

    /**
     * 快速起坐测试评分
     */
    @ApiModelProperty(value = "快速起坐测试评分")
    private String quickSitUp;

    /**
     * 便秘临床评分
     */
    @ApiModelProperty(value = "便秘临床评分")
    private String constipation;

    /**
     * 膀胱过度活动症症状评分
     */
    @ApiModelProperty(value = "膀胱过度活动症症状评分")
    private String bladderHyperactivityDisorder;

    /**
     * 国际前列腺症状评分
     */
    @ApiModelProperty(value = "国际前列腺症状评分")
    private String prostate;

    /**
     * mRS评分
     */
    @ApiModelProperty(value = "mRS评分")
    private String mRS;

    /**
     * 营养筛查评分
     */
    @ApiModelProperty(value = "营养筛查评分")
    private String nutritionScreening;

    /**
     * 蛙田饮水实验评分
     */
    @ApiModelProperty(value = "蛙田饮水实验评分")
    private String drinkingWater;

    /**
     * 检测图片（以，分割）
     */
    @ApiModelProperty(value = "检测图片（以，分割）")
    private String images;

    /**
     * 检查时间
     */
    @ApiModelProperty(value = "检查时间")
    private Long checkTime;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Builder.Default
    private Long createTime = System.currentTimeMillis();

}