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
public class HospitalVascularEventSaveDTO {

    /**
     * 事件类型：
     */
    @ApiModelProperty(value = "事件类型：")
    private Integer eventType;

    /**
     * 发病时间
     */
    @ApiModelProperty(value = "发病时间(以，分割)")
    private String onsetTimes;

}