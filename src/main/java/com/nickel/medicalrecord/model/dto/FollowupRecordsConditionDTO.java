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
public class FollowupRecordsConditionDTO {

    /**
     * 住院记录ID
     */
    @ApiModelProperty(value = "住院记录ID")
    private String hospitalRecordsId;

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
     * 是否死亡
     */
    @ApiModelProperty(value = "是否死亡")
    private Integer dead;

    /**
     * 删除状态
     */
    @ApiModelProperty(value = "删除状态", required = true)
    private Integer deleted;

}