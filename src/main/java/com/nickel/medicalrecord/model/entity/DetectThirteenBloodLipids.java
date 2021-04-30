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
public class DetectThirteenBloodLipids {
    /**
     * 血脂十三项ID
     */
    @ApiModelProperty(value = "血脂十三项ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 类型：1-住院，2随访
     */
    @ApiModelProperty(value = "类型：1-住院，2随访")
    private String type;

    /**
     * 所属类型ID
     */
    @ApiModelProperty(value = "所属类型ID")
    private String dataId;

    /**
     * 检测值1
     */
    @ApiModelProperty(value = "检测值1")
    private Double detectOne;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer detectOneOutcome;

    /**
     * 检测值2
     */
    @ApiModelProperty(value = "检测值2")
    private Double detectTwo;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer detectTwoOutcome;

    /**
     * 检测值3
     */
    @ApiModelProperty(value = "检测值3")
    private Double detectThree;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer detectThreeOutcome;

    /**
     * 检测值4
     */
    @ApiModelProperty(value = "检测值4")
    private Double detectFour;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer detectFourOutcome;

    /**
     * 检测值5
     */
    @ApiModelProperty(value = "检测值5")
    private Double detectFive;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer detectFiveOutcome;

    /**
     * 检测值6
     */
    @ApiModelProperty(value = "检测值6")
    private Double detectSix;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer detectSixOutcome;

    /**
     * 检测值7
     */
    @ApiModelProperty(value = "检测值7")
    private Double detectSeven;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer detectSevenOutcome;

    /**
     * 检测值3-7
     */
    @ApiModelProperty(value = "检测值3-7")
    private Double detectThreeToSeven;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer detectThreeToSevenOutcome;

    /**
     * 低密度脂蛋白胆固醇
     */
    @ApiModelProperty(value = "低密度脂蛋白胆固醇")
    private Double LDLCholesterol;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer LDLCholesterolOutcome;

    /**
     * 总胆固醇
     */
    @ApiModelProperty(value = "总胆固醇")
    private Double totalCholesterol;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer totalCholesterolOutcome;

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