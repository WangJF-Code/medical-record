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
public class HospitalVascularCreateDTO {

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID", required = true)
    private String patientId;

    /**
     * 病历ID
     */
    @ApiModelProperty(value = "病历ID", required = true)
    private String hospitalRecordsId;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "血管事件集合")
    private List<HospitalVascularEventSaveDTO> eventList;

}