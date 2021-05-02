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
public class DetectClottingRoutineCreateDTO {

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
     * 纤维蛋白原含量测定值
     */
    @ApiModelProperty(value = "纤维蛋白原含量测定值")
    private Double fibrinogen;

    /**
     * 纤维蛋白原含量测定结果
     */
    @ApiModelProperty(value = "纤维蛋白原含量测定结果")
    private Integer fibrinogenOutcome;

    /**
     * D二聚体定量测定值
     */
    @ApiModelProperty(value = "D二聚体定量测定值")
    private Double dDimerQuantification;

    /**
     * D二聚体定量测定值测定结果
     */
    @ApiModelProperty(value = "D二聚体定量测定值测定结果")
    private Integer dDimerQuantificationOutcome;

    /**
     * INR值
     */
    @ApiModelProperty(value = "INR值")
    private Double INR;

    /**
     * INR值测定结果
     */
    @ApiModelProperty(value = "INR值测定结果")
    private Integer INROutcome;

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