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
public class DetectItemMultipleDTO {

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
     * 检测类型: 301-颅脑核磁共振(MRI)
     */
    @ApiModelProperty(value = "检测类型: 301-颅脑核磁共振(MRI)")
    private Integer detectType;

    /**
     * 多选结果:（以，分割）
     */
    @ApiModelProperty(value = "多选结果:（以，分割）")
    private String multiple;

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