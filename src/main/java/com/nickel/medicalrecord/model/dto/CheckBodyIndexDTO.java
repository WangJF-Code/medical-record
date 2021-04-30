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
public class CheckBodyIndexDTO {
    /**
     * 查体指标ID
     */
    @ApiModelProperty(value = "查体指标ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 身高（cm）
     */
    @ApiModelProperty(value = "身高（cm）")
    private Double height;

    /**
     * 体重（Kg）
     */
    @ApiModelProperty(value = "体重（Kg）")
    private Double weight;

    /**
     * 腹围（cm）
     */
    @ApiModelProperty(value = "腹围（cm）")
    private Double abdominalCircumference;

    /**
     * 体重指数（BMI）＝体重（kg）/身高(m)的平方
     */
    @ApiModelProperty(value = "体重指数（BMI）＝体重（kg）/身高(m)的平方")
    private Double bmi;

    /**
     * 首次心率（次/分）
     */
    @ApiModelProperty(value = "首次心率（次/分）")
    private Double heartRate;

    /**
     * 平卧位左上肢收缩压（mmHg）
     */
    @ApiModelProperty(value = "平卧位左上肢收缩压（mmHg）")
    private Double horizontalLeftSystolic;

    /**
     * 平卧位右上肢收缩压（mmHg）
     */
    @ApiModelProperty(value = "平卧位右上肢收缩压（mmHg）")
    private Double horizontalRightSystolic;

    /**
     * 卧立位左上肢收缩压（mmHg）
     */
    @ApiModelProperty(value = "卧立位左上肢收缩压（mmHg）")
    private Double verticalLeftSystolic;

    /**
     * 卧立位右上肢收缩压（mmHg）
     */
    @ApiModelProperty(value = "卧立位右上肢收缩压（mmHg）")
    private Double verticalRightSystolic;

    /**
     * 平卧位左上肢舒张压（mmHg）
     */
    @ApiModelProperty(value = "平卧位左上肢舒张压（mmHg）")
    private Double horizontalLeftDiastolic;

    /**
     * 平卧位右上肢舒张压（mmHg）
     */
    @ApiModelProperty(value = "平卧位右上肢舒张压（mmHg）")
    private Double horizontalRightDiastolic;

    /**
     * 卧立位左上肢舒张压（mmHg）
     */
    @ApiModelProperty(value = "卧立位左上肢舒张压（mmHg）")
    private Double verticalLeftDiastolic;

    /**
     * 卧立位右上肢舒张压（mmHg）
     */
    @ApiModelProperty(value = "卧立位右上肢舒张压（mmHg）")
    private Double verticalRightDiastolic;

    /**
     * 左右利手:1-右手，2-左手，3-双手
     */
    @ApiModelProperty(value = "左右利手:1-右手，2-左手，3-双手")
    private Integer leftAndRight;

    /**
     * 是否有尿失禁：1-否，2-是，3-不详
     */
    @ApiModelProperty(value = "是否有尿失禁：1-否，2-是，3-不详")
    private Integer urinaryIncontinence;

    /**
     * 检测图片（以，分割）
     */
    @ApiModelProperty(value = "检测图片（以，分割）")
    private String images;

    /**
     * 检查时间
     */
    @ApiModelProperty(value = "检查时间")
    private Long checkTime;

}