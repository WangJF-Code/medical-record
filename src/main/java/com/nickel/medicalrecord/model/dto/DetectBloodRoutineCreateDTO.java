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
public class DetectBloodRoutineCreateDTO {

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
     * 白细胞计数测定值
     */
    @ApiModelProperty(value = "白细胞计数测定值")
    private Double leukocyte;

    /**
     * 白细胞测定结果
     */
    @ApiModelProperty(value = "白细胞测定结果")
    private Integer leukocyteOutcome;

    /**
     * 血红蛋白测定值
     */
    @ApiModelProperty(value = "血红蛋白测定值")
    private Double haemoglobin;

    /**
     * 血红蛋白测定结果
     */
    @ApiModelProperty(value = "血红蛋白测定结果")
    private Integer haemoglobinOutcome;

    /**
     * 血小板计数测定值
     */
    @ApiModelProperty(value = "血小板计数测定值")
    private Double platelet;

    /**
     * 血小板计数测定结果
     */
    @ApiModelProperty(value = "血小板计数测定结果")
    private Integer plateletOutcome;

    /**
     * C反应蛋白测定值
     */
    @ApiModelProperty(value = "C反应蛋白测定值")
    private Double cReactiveProtein;

    /**
     * C反应蛋白测定结果
     */
    @ApiModelProperty(value = "C反应蛋白测定结果")
    private Integer cReactiveProteinOutcome;

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