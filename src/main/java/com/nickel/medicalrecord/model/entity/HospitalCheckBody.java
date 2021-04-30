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
public class HospitalCheckBody {
    /**
     * 查体ID
     */
    @ApiModelProperty(value = "查体ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 病历ID
     */
    @ApiModelProperty(value = "病历ID")
    private String hospitalRecordsId;

    /**
     * 查体类型：1-入院查体，2-出院查体
     */
    @ApiModelProperty(value = "查体类型：1-入院查体，2-出院查体")
    private Integer type;

    /**
     * 查体指标ID
     */
    @ApiModelProperty(value = "查体指标ID")
    private Integer checkBodyIndexId;

    /**
     * 测评指标ID
     */
    @ApiModelProperty(value = "测评指标ID")
    private Integer checkEvaluationIndexId;

    /**
     * 是否存活
     */
    @ApiModelProperty(value = "是否存活")
    private Integer survive;

    /**
     * 出院时间
     */
    @ApiModelProperty(value = "出院时间")
    private Long dischargeTime;

    /**
     * 卒中教育
     */
    @ApiModelProperty(value = "卒中教育")
    private String strokeEducation;

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