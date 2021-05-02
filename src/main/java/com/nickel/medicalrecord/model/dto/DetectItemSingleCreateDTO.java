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
public class DetectItemSingleCreateDTO {

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
     * 检测类型: 201-经颅多普勒检查, 202-颅内血管高分辨磁共振成像(HMR), 203-尿流动力学检查, 204-下肢静脉血管超声
     */
    @ApiModelProperty(value = "检测类型: 201-经颅多普勒检查, 202-颅内血管高分辨磁共振成像(HMR), 203-尿流动力学检查, 204-下肢静脉血管超声")
    private Integer detectType;

    /**
     * 单选结果
     */
    @ApiModelProperty(value = "单选结果")
    private Integer single;

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