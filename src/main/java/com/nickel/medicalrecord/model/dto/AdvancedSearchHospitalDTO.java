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
public class AdvancedSearchHospitalDTO {

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

    @ApiModelProperty(value = "诊断记录")
    private HospitalDiagnosticRecordsConditionDTO diagnosticRecords;

    @ApiModelProperty(value = "血管事件类型集合")
    private List<Integer> vascularEventList;

    @ApiModelProperty(value = "治疗记录")
    private HospitalTreatmentRecordsConditionDTO treatmentRecords;

    @ApiModelProperty(value = "药物治疗类型集合")
    private List<Integer> medicationDrugRecordList;

    @ApiModelProperty(value = "辅助检查-多单选类检查项")
    private DetectItemMultipleSingleConditionDTO detectItemMultipleSingle;

}
