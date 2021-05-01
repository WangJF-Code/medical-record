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
public class FollowupRecordsCreateDTO {

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID", required = true)
    private String patientId;

    /**
     * 住院记录ID
     */
    @ApiModelProperty(value = "住院记录ID", required = true)
    private String hospitalRecordsId;

    /**
     * 是否到院随访:0-否,1-是
     */
    @ApiModelProperty(value = "是否到院随访:0-否,1-是")
    private Integer followupType;

    /**
     * 随访周期
     */
    @ApiModelProperty(value = "随访周期")
    private Integer cycle;

    /**
     * 随访周期单位:1-月,2-年
     */
    @ApiModelProperty(value = "随访周期单位:1-月,2-年")
    private Integer cycleUnit;

    /**
     * 随访周期是否浮动14天
     */
    @ApiModelProperty(value = "随访周期是否浮动14天")
    private Integer cycleFloat;

    /**
     * 是否死亡
     */
    @ApiModelProperty(value = "是否死亡")
    private Integer dead;

    /**
     * 死亡时间
     */
    @ApiModelProperty(value = "死亡时间")
    private Long deadTime;

    /**
     * 死亡原因
     */
    @ApiModelProperty(value = "死亡原因")
    private String causeOfDeath;

    /**
     * 居住状况
     */
    @ApiModelProperty(value = "居住状况")
    private Integer livingStatus;

    /**
     * 城市
     */
    @ApiModelProperty(value = "城市")
    private String city;

    /**
     * 随访时居住地
     */
    @ApiModelProperty(value = "随访时居住地")
    private String address;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

}