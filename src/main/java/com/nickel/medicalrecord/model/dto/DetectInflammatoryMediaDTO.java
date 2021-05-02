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
public class DetectInflammatoryMediaDTO {
    /**
     * 炎症介质ID
     */
    @ApiModelProperty(value = "炎症介质ID")
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
     * IL-2测定值
     */
    @ApiModelProperty(value = "IL-2测定值")
    private Double IL2;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer IL2Outcome;

    /**
     * IL-4测定值
     */
    @ApiModelProperty(value = "IL-4测定值")
    private Double IL4;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer IL4Outcome;

    /**
     * IL-6测定值
     */
    @ApiModelProperty(value = "IL-6测定值")
    private Double IL6;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer IL6Outcome;

    /**
     * IL-10测定值
     */
    @ApiModelProperty(value = "IL-10测定值")
    private Double IL10;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer IL10Outcome;

    /**
     * IL-17测定值
     */
    @ApiModelProperty(value = "IL-17测定值")
    private Double IL17;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer IL17Outcome;

    /**
     * TNF-α测定值
     */
    @ApiModelProperty(value = "TNF-α测定值")
    private Double TNFA;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer TNFAOutcome;

    /**
     * TNF-γ测定值
     */
    @ApiModelProperty(value = "TNF-γ测定值")
    private Double TNFC;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer TNFCOutcome;

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
     * 检查时间
     */
    @ApiModelProperty(value = "检查时间")
    private String checkTimeStr;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Long createTime;
}