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
public class DetectThyroidFunctionUpdateDTO {

    /**
     * 甲状腺功能ID
     */
    @ApiModelProperty(value = "甲状腺功能ID")
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
     * 游离T3测定值
     */
    @ApiModelProperty(value = "游离T3测定值")
    private Double freeT3;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer freeT3Outcome;

    /**
     * 游离T4测定值
     */
    @ApiModelProperty(value = "游离T4测定值")
    private Double freeT4;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer freeT4Outcome;

    /**
     * 促甲状腺激素测定值
     */
    @ApiModelProperty(value = "促甲状腺激素测定值")
    private Double thyrotropin;

    /**
     * 量测定结果
     */
    @ApiModelProperty(value = "量测定结果")
    private Integer thyrotropinOutcome;

    /**
     * 甲状腺过氧化物酶抗体测定值
     */
    @ApiModelProperty(value = "甲状腺过氧化物酶抗体测定值")
    private Double peroxidaseAntibody;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer peroxidaseAntibodyOutcome;

    /**
     * 检测图片（以，分割）
     */
    @ApiModelProperty(value = "检测图片（以，分割）")
    private String images;

    /**
     * 检查时间
     */
    @ApiModelProperty(value = "检查时间")
    private String checkTime;

}