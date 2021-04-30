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
public class DetectBiochemicalFullItem {
    /**
     * 生化全项ID
     */
    @ApiModelProperty(value = "生化全项ID")
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
     * 天冬氨酸氨基转移酶测定值
     */
    @ApiModelProperty(value = "天冬氨酸氨基转移酶测定值")
    private Double aspartateAminotransferase;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer aspartateAminotransferaseOutcome;

    /**
     * 丙氨酸氨基转移酶
     */
    @ApiModelProperty(value = "丙氨酸氨基转移酶")
    private Double alanineAminotransferase;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer alanineAminotransferaseOutcome;

    /**
     * 低密度脂蛋白测定值
     */
    @ApiModelProperty(value = "低密度脂蛋白测定值")
    private Double lowDensityLipoproteins;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer lowDensityLipoproteinsOutcome;

    /**
     * 高密度脂蛋白测定值
     */
    @ApiModelProperty(value = "高密度脂蛋白测定值")
    private Double highDensityLipoprotein;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer highDensityLipoproteinOutcome;

    /**
     * 总胆固醇测定值
     */
    @ApiModelProperty(value = "总胆固醇测定值")
    private Double totalCholesterol;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer totalCholesterolOutcome;

    /**
     * 甘油三酯测定值
     */
    @ApiModelProperty(value = "甘油三酯测定值")
    private Double triglycerides;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer triglyceridesOutcome;

    /**
     * 尿酸测定值
     */
    @ApiModelProperty(value = "尿酸测定值")
    private Double uricAcid;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer uricAcidOutcome;

    /**
     * 肌酐（酶法）测定值
     */
    @ApiModelProperty(value = "肌酐（酶法）测定值")
    private Double creatinine;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer creatinineOutcome;

    /**
     * 尿素氮测定值
     */
    @ApiModelProperty(value = "尿素氮测定值")
    private Double ureaNitrogen;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer ureaNitrogenOutcome;

    /**
     * 空腹血糖测定值
     */
    @ApiModelProperty(value = "空腹血糖测定值")
    private Double fastingBloodSugar;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer fastingBloodSugarOutcome;

    /**
     * 同型半胱氨酸测定值
     */
    @ApiModelProperty(value = "同型半胱氨酸测定值")
    private Double homocysteine;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer homocysteineOutcome;

    /**
     * 肌酸激酶测定值
     */
    @ApiModelProperty(value = "肌酸激酶测定值")
    private Double creatineKinase;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer creatineKinaseOutcome;

    /**
     * CK-MB测定值
     */
    @ApiModelProperty(value = "CK-MB测定值")
    private Double CKMB;

    /**
     * 测定结果
     */
    @ApiModelProperty(value = "测定结果")
    private Integer CKMBOutcome;

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