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
public class DetectSwiCreateDTO {

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
     * 是否多发微出血灶
     */
    @ApiModelProperty(value = "是否多发微出血灶")
    private Integer microHemorrhage;

    /**
     * 皮层出血病灶数量
     */
    @ApiModelProperty(value = "皮层出血病灶数量")
    private Integer cortex;

    /**
     * 皮层下出血病灶数量
     */
    @ApiModelProperty(value = "皮层下出血病灶数量")
    private Integer underCortex;

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