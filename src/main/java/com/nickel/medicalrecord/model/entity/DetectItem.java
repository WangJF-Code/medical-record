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
public class DetectItem {
    /**
     * 检测ID
     */
    @ApiModelProperty(value = "检测ID")
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
     * 检测类型:
     * 101-血沉,102-糖化血红蛋白;
     * 201-经颅多普勒检查, 202-颅内血管高分辨磁共振成像(HMR), 203-尿流动力学检查, 204-下肢静脉血管超声;
     * 301-颅脑核磁共振(MRI);
     * 401-颈部血管彩超检查, 402-锁骨下动脉彩超检查, 403-磁共振血管成像(MRA), 404-磁共振弥散成像（DWI）, 405-CT 血管造影(CTA), 406-CT灌注成像（CTP）;
     * 501-24小时心电监测（Holter）, 502-心脏超声, 503-颅脑计算机 X 线体层摄影(CT), 504-磁共振灌注成像(ASL), 505-磁共振(DTI), 506-眼底OCTA, 507-眼底照相;
     */
    @ApiModelProperty(value = "检测类型")
    private Integer detectType;

    /**
     * 测定值
     */
    @ApiModelProperty(value = "测定值")
    private Double value;

    /**
     * 单选结果
     */
    @ApiModelProperty(value = "单选结果")
    private Integer single;

    /**
     * 多选结果:（以，分割）
     */
    @ApiModelProperty(value = "多选结果:（以，分割）")
    private String multiple;

    /**
     * 多个单选结果: k-v（多个以，分割）
     */
    @ApiModelProperty(value = "多个单选结果: k-v（多个以，分割）")
    private String multipleSingle;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer outcome;

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

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Builder.Default
    private Long createTime = System.currentTimeMillis();

}