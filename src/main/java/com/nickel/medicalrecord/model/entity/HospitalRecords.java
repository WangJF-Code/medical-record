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
public class HospitalRecords {

    /**
     * 电子病历ID
     */
    @ApiModelProperty(value = "电子病历ID")
    private String id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 发病时间
     */
    @ApiModelProperty(value = "发病时间")
    private Long onsetTime;

    /**
     * 到院时间
     */
    @ApiModelProperty(value = "到院时间")
    private Long toHospitalTime;

    /**
     * 住院时间
     */
    @ApiModelProperty(value = "住院时间")
    private Long hospitalizationTime;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * 出院时间
     */
    @ApiModelProperty(value = "出院时间")
    private Long dischargeTime;

    /**
     * 状态：1-住院中，2-已出院
     */
    @ApiModelProperty(value = "状态：1-住院中，2-已出院")
    private Integer status;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Builder.Default
    private Long createTime = System.currentTimeMillis();

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    @Builder.Default
    private Long updateTime = System.currentTimeMillis();

    /**
     * 删除状态
     */
    @ApiModelProperty(value = "删除状态")
    @Builder.Default
    private Integer deleted = 0;

}