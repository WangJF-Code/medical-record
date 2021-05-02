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
public class DetectItemValueUpdateDTO {
    /**
     * 检测ID
     */
    @ApiModelProperty(value = "检测ID")
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
     * 检测类型:101-血沉,102-糖化血红蛋白
     */
    @ApiModelProperty(value = "检测类型:101-血沉,102-糖化血红蛋白")
    private Integer detectType;

    /**
     * 测定值
     */
    @ApiModelProperty(value = "测定值")
    private Double value;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer outcome;

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