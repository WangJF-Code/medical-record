package com.nickel.medicalrecord.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HospitalVascularDTO {

    /**
     * 血管事件记录ID
     */
    @ApiModelProperty(value = "血管事件记录ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 病历ID
     */
    @ApiModelProperty(value = "病历ID")
    private String hospitalRecordsId;

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

    @ApiModelProperty(value = "血管事件集合")
    private List<HospitalVascularEventDTO> eventList;

}