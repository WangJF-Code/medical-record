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
public class HospitalRecordsDTO {

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
     * 发病时间
     */
    @ApiModelProperty(value = "发病时间")
    private Long onsetTime;

    /**
     * 到院时间
     */
    @ApiModelProperty(value = "到院时间")
    private Long toHospitalTime;

    /**
     * 住院时间
     */
    @ApiModelProperty(value = "住院时间")
    private Long hospitalizationTime;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * 出院时间
     */
    @ApiModelProperty(value = "出院时间")
    private Long dischargeTime;

    /**
     * 状态：1-住院中，2-已出院
     */
    @ApiModelProperty(value = "状态：1-住院中，2-已出院")
    private Integer status;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private Long updateTime;

    /**
     * 删除状态
     */
    @ApiModelProperty(value = "删除状态")
    private Integer deleted;

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
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String IDCard;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Integer age;

    /**
     * 电话号
     */
    @ApiModelProperty(value = "电话号")
    private String phoneNumber;

    /**
     * 民族
     */
    @ApiModelProperty(value = "民族")
    private String nation;

    /**
     * 居住状况
     */
    @ApiModelProperty(value = "居住状况")
    private Integer livingStatus;

    /**
     * 婚姻状况
     */
    @ApiModelProperty(value = "婚姻状况")
    private Integer maritalStatus;

    /**
     * 文化程度
     */
    @ApiModelProperty(value = "文化程度")
    private Integer educationDegree;

    /**
     * 医保类型
     */
    @ApiModelProperty(value = "医保类型")
    private Integer medicalInsuranceType;

    /**
     * 职业
     */
    @ApiModelProperty(value = "职业")
    private String job;

    /**
     * 月收入
     */
    @ApiModelProperty(value = "月收入")
    private Integer income;

    @ApiModelProperty(value = "城市")
    private String city;

    /**
     * 住址
     */
    @ApiModelProperty(value = "住址")
    private String address;

}