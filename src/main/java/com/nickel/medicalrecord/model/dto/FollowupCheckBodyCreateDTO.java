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
public class FollowupCheckBodyCreateDTO {

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID", required = true)
    private String patientId;

    /**
     * 随访ID
     */
    @ApiModelProperty(value = "随访ID", required = true)
    private String followupRecordsId;

    /**
     * 查体指标
     */
    @ApiModelProperty(value = "查体指标", required = true)
    private CheckBodyIndexSaveDTO bodyIndex;

}