package com.nickel.medicalrecord.model.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FollowupVascularEventRecord implements Serializable {
    /**
     * 血管事件测评记录ID
     */
    @ApiModelProperty(value = "血管事件测评记录ID")
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
     * 是否有不良脑血管事件
     */
    @ApiModelProperty(value = "是否有不良脑血管事件")
    private Integer cerebrovascularEvent;

    /**
     * TOAST：1-大动脉粥样硬化型，2-小动脉病变型，3-心源性，4-其他原因，5-原因不明(以,分割)
     */
    @ApiModelProperty(value = "TOAST：1-大动脉粥样硬化型，2-小动脉病变型，3-心源性，4-其他原因，5-原因不明(以,分割)")
    private String TOAST;

    /**
     * TOAST可能性：1-无法确定病因，2-隐源性脑栓塞，3-其他隐源性，4-难分类病因(以,分割)
     */
    @ApiModelProperty(value = "TOAST可能性：1-无法确定病因，2-隐源性脑栓塞，3-其他隐源性，4-难分类病因(以,分割)")
    private String possibility;

    /**
     * 测评指标ID
     */
    @ApiModelProperty(value = "测评指标ID")
    private Integer checkEvaluationIndexId;

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