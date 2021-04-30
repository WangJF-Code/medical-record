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
public class PatientLifestyle {
    /**
     * 生活方式ID
     */
    @ApiModelProperty(value = "生活方式ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 吸烟类型
     */
    @ApiModelProperty(value = "吸烟类型")
    private String smokingType;

    /**
     * 吸烟数量 支
     */
    @ApiModelProperty(value = "吸烟数量 支")
    private Integer smokingNum;

    /**
     * 吸烟年数
     */
    @ApiModelProperty(value = "吸烟年数")
    private Integer smokingYear;

    @ApiModelProperty(value = "戒烟年数")
    private Integer quitSmokingYear;

    /**
     * 饮酒类型
     */
    @ApiModelProperty(value = "饮酒类型")
    private Integer drinkingType;

    /**
     * 饮酒数量 克
     */
    @ApiModelProperty(value = "饮酒数量 克")
    private Integer drinkingNum;

    /**
     * 饮酒年数
     */
    @ApiModelProperty(value = "饮酒年数")
    private Integer drinkingYear;

    /**
     * 平均运动量
     */
    @ApiModelProperty(value = "平均运动量")
    private Integer averageExercise;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Builder.Default
    private Long createTime = System.currentTimeMillis();

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    @Builder.Default
    private Long updateTime = System.currentTimeMillis();

    /**
     * 删除状态
     */
    @ApiModelProperty(value = "删除状态")
    @Builder.Default
    private Integer deleted = 0;
}