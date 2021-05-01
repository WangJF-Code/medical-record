package com.nickel.medicalrecord.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 类描述：
 *
 * @ClassName HospitalRecordsUpdateDTO
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 11:29
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HospitalRecordsUpdateDTO {


    /**
     * 电子病历ID
     */
    @ApiModelProperty(value = "电子病历ID", required = true)
    private String id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID", required = true)
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
     * 出院时间
     */
    @ApiModelProperty(value = "出院时间")
    private Long dischargeTime;

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

    /**
     * 删除状态
     */
    @ApiModelProperty(value = "删除状态", required = true)
    private Integer deleted = 0;

}
