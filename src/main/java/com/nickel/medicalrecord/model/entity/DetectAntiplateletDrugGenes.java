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
public class DetectAntiplateletDrugGenes {
    /**
     * 抗血小板药物基因ID
     */
    @ApiModelProperty(value = "抗血小板药物基因ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 类型：1-住院，2随访
     */
    @ApiModelProperty(value = "类型：1-住院，2随访")
    private String type;

    /**
     * 所属类型ID
     */
    @ApiModelProperty(value = "所属类型ID")
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
    private Long checkTime;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Builder.Default
    private Long createTime = System.currentTimeMillis();

}