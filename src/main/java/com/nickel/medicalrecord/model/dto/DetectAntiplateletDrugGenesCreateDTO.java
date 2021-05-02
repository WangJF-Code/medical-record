package com.nickel.medicalrecord.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetectAntiplateletDrugGenesCreateDTO {

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID", required = true)
    private String patientId;

    /**
     * 类型：1-住院，2随访
     */
    @ApiModelProperty(value = "类型：1-住院，2随访", required = true)
    private String type;

    /**
     * 所属类型ID
     */
    @ApiModelProperty(value = "所属类型ID", required = true)
    private String dataId;

    /**
     * 阿司匹林基因检测照片
     */
    @ApiModelProperty(value = "阿司匹林基因检测照片")
    private String aspirinImages;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer aspirinOutcome;

    /**
     * 氯吡格雷基因检测照片
     */
    @ApiModelProperty(value = "氯吡格雷基因检测照片")
    private String clopidogrelImages;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer clopidogrelOutcome;

    /**
     * 他汀药物基因检测照片
     */
    @ApiModelProperty(value = "他汀药物基因检测照片")
    private String statinsImages;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer statinsOutcome;

    /**
     * 检查时间
     */
    @ApiModelProperty(value = "检查时间")
    private String checkTime;

}