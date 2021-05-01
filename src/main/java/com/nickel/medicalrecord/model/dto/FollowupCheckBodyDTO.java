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
public class FollowupCheckBodyDTO {
    /**
     * 查体ID
     */
    @ApiModelProperty(value = "查体ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 随访ID
     */
    @ApiModelProperty(value = "随访ID")
    private String followupRecordsId;

    /**
     * 查体指标ID
     */
    @ApiModelProperty(value = "查体指标ID")
    private Integer checkBodyIndexId;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    /**
     * 查体指标
     */
    @ApiModelProperty(value = "查体指标")
    private CheckBodyIndexDTO bodyIndexDTO;

}