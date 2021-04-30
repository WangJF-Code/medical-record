package com.nickel.medicalrecord.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 类描述：
 *
 * @ClassName HospitalCheckBodyCreateDTO
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 14:38
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HospitalCheckBodyCreateDTO {

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

    @ApiModelProperty(value = "查体指标")
    private CheckBodyIndexDTO bodyIndex;

    @ApiModelProperty(value = "测评指标")
    private CheckEvaluationIndexDTO evaluationIndex;

}
