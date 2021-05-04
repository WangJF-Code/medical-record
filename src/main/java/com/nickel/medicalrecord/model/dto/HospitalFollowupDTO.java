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
public class HospitalFollowupDTO {

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

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Integer age;

    /**
     * 是否死亡
     */
    @ApiModelProperty(value = "是否死亡")
    private Integer dead;

    @ApiModelProperty(value = "随访记录")
    private Integer followupCount;

}
