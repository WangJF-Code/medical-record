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
public class FollowupDrugRecordSaveDTO {

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
     * 是否坚持服药
     */
    @ApiModelProperty(value = "是否坚持服药", required = true)
    private Integer eatDrug;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "服药类型及药物")
    private List<FollowupDrugTypeDTO> drugTypeDTOList;

}