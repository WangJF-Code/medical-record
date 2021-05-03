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
public class AdvancedSearchFollowupDTO {

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

    @ApiModelProperty(value = "坚持服药药物类型集合")
    private List<Integer> medicationDrugRecordList;

    @ApiModelProperty(value = "辅助检查-多单选类检查项")
    private DetectItemMultipleSingleConditionDTO detectItemMultipleSingle;

    @ApiModelProperty(value = "服药药物类型集合")
    private List<Integer> drugRecordList;

    @ApiModelProperty(value = "发病记录类型集合")
    private List<Integer> onsetRecordList;

    @ApiModelProperty(value = "血管事件测评记录 TOAST：1-大动脉粥样硬化型，2-小动脉病变型，3-心源性，4-其他原因，5-原因不明")
    private List<Integer> TOASTList;

}