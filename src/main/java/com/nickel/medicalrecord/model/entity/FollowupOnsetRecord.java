package com.nickel.medicalrecord.model.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FollowupOnsetRecord {
    /**
     * 发病ID
     */
    @ApiModelProperty(value = "发病ID")
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
     * 复发类型
     */
    @ApiModelProperty(value = "复发类型")
    private Integer type;

    /**
     * 复发状态
     */
    @ApiModelProperty(value = "复发状态")
    private Integer relapseStatus;

    /**
     * 首次复发时间
     */
    @ApiModelProperty(value = "首次复发时间")
    private Long relapseTime;

    /**
     * 复发次数
     */
    @ApiModelProperty(value = "复发次数")
    private Integer relapseNum;

    /**
     * 复发第几次描述
     */
    @ApiModelProperty(value = "复发第几次描述")
    private Integer relapseTextNum;

    /**
     * 复发描述
     */
    @ApiModelProperty(value = "复发描述")
    private String relapseText;

    /**
     * 是否进行血管相关操作及手术
     */
    @ApiModelProperty(value = "是否进行血管相关操作及手术")
    private Integer vascularRelatedSurgery;

    /**
     * 血管相关操作及手术次数
     */
    @ApiModelProperty(value = "血管相关操作及手术次数")
    private Integer vascularRelatedSurgeryNum;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Builder.Default
    private Long createTime = System.currentTimeMillis();

}