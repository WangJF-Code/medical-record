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
public class MedicationRecord {
    /**
     * 药物记录ID
     */
    @ApiModelProperty(value = "药物记录ID")
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
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Long createTime;

}