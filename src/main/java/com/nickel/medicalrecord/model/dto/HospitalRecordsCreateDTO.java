package com.nickel.medicalrecord.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 类描述：
 *
 * @ClassName HospitalRecordsCreateDTO
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 11:21
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HospitalRecordsCreateDTO {

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
     * 状态：1-住院中，2-已出院
     */
    @ApiModelProperty(value = "状态：1-住院中，2-已出院")
    private Integer status;

}
