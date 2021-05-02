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
public class DetectItemOutcomeCreateDTO {

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
     * 检测类型: 501-24小时心电监测（Holter）, 502-心脏超声, 503-颅脑计算机 X 线体层摄影(CT), 504-磁共振灌注成像(ASL), 505-磁共振(DTI), 506-眼底OCTA, 507-眼底照相;
     */
    @ApiModelProperty(value = "检测类型: 501-24小时心电监测（Holter）, 502-心脏超声, 503-颅脑计算机 X 线体层摄影(CT), 504-磁共振灌注成像(ASL), 505-磁共振(DTI), 506-眼底OCTA, 507-眼底照相;")
    private Integer detectType;

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