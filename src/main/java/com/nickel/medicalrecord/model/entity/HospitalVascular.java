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
public class HospitalVascular {
    /**
     * 血管事件记录ID
     */
    @ApiModelProperty(value="血管事件记录ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value="患者ID")
    private String patientId;

    /**
     * 病历ID
     */
    @ApiModelProperty(value="病历ID")
    private String hospitalRecordsId;

    /**
     * 描述
     */
    @ApiModelProperty(value="描述")
    private String description;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private Long createTime;

}