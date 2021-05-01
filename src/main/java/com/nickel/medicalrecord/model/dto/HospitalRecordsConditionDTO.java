package com.nickel.medicalrecord.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 类描述：
 *
 * @ClassName ConditionDTO
 * @Description TODO
 * @Author WangJF
 * @Date 2021/4/27 11:38
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HospitalRecordsConditionDTO {

    /**
     * 电子病历ID
     */
    @ApiModelProperty(value = "电子病历ID")
    private String id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String userName;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private Integer sex;

    @ApiModelProperty(value = "民族")
    private String nation;

    /**
     * 状态：1-住院中，2-已出院
     */
    @ApiModelProperty(value = "状态：1-住院中，2-已出院")
    private Integer status;

    /**
     * 住院时间
     */
    @ApiModelProperty(value = "住院时间")
    private Long startHospitalizationTime;

    /**
     * 住院时间
     */
    @ApiModelProperty(value = "住院时间")
    private Long endHospitalizationTime;

    /**
     * 出院时间
     */
    @ApiModelProperty(value = "出院时间")
    private Long startDischargeTime;

    /**
     * 出院时间
     */
    @ApiModelProperty(value = "出院时间")
    private Long endDischargeTime;

    /**
     * 删除状态
     */
    @ApiModelProperty(value = "删除状态", required = true)
    private Integer deleted = 0;

}
