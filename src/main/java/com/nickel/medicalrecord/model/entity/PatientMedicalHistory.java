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
public class PatientMedicalHistory {
    /**
     * 既往病史ID
     */
    @ApiModelProperty(value = "既往病史ID")
    private Integer id;

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 既往卒中史:0-否,1-是
     */
    @ApiModelProperty(value = "既往卒中史:0-否,1-是")
    private Integer priorStroke;

    /**
     * 既往卒中史次数
     */
    @ApiModelProperty(value = "既往卒中史次数")
    private Integer priorStrokeNum;

    /**
     * 既往卒中史类型：1-脑梗死,2-脑出血,3-蛛网膜下腔出血,4-其他未分类卒中(以","分割可存多种类型)
     */
    @ApiModelProperty(value = "既往卒中史类型：1-脑梗死,2-脑出血,3-蛛网膜下腔出血,4-其他未分类卒中(以, 分割可存多种类型)")
    private String priorStrokeType;

    /**
     * 既往卒中史描述
     */
    @ApiModelProperty(value = "既往卒中史描述")
    private String priorStrokeText;

    /**
     * 短暂性脑缺血:0-否,1-是
     */
    @ApiModelProperty(value = "短暂性脑缺血:0-否,1-是")
    private Integer transientCerebralIchemia;

    /**
     * 最后一次发病时间
     */
    @ApiModelProperty(value = "最后一次发病时间")
    private Long transientCerebralIchemiaTime;

    /**
     * 短暂性脑缺血描述
     */
    @ApiModelProperty(value = "短暂性脑缺血描述")
    private String transientCerebralIchemiaText;

    /**
     * 冠心病:0-否,1-是
     */
    @ApiModelProperty(value = "冠心病:0-否,1-是")
    private Integer coronaryHeartDisease;

    private String coronaryHeartDiseaseText;

    /**
     * 心房颤动:0-否,1-是
     */
    @ApiModelProperty(value = "心房颤动:0-否,1-是")
    private Integer atrialFibrillation;

    private String atrialFibrillationText;

    /**
     * 心力衰竭:0-否,1-是
     */
    @ApiModelProperty(value = "心力衰竭:0-否,1-是")
    private Integer heartFailure;

    private String heartFailureText;

    /**
     * 冠状动脉支架:0-否,1-是
     */
    @ApiModelProperty(value = "冠状动脉支架:0-否,1-是")
    private Integer coronaryStent;

    private String coronaryStentText;

    /**
     * 糖尿病:0-否,1-1级,2-2级,3-3级...
     */
    @ApiModelProperty(value = "糖尿病:0-否,1-1级,2-2级,3-3级...")
    private Integer diabetes;

    private Long diabetesTime;

    private String diabetesText;

    /**
     * 高血压:0-否,1-1级,2-2级,3-3级...
     */
    @ApiModelProperty(value = "高血压:0-否,1-1级,2-2级,3-3级...")
    private Integer hypertension;

    private Long hypertensionTime;

    private String hypertensionText;

    /**
     * 血脂代谢紊乱:0-否,1-是
     */
    @ApiModelProperty(value = "血脂代谢紊乱:0-否,1-是")
    private Integer dyslipidemia;

    private String dyslipidemiaText;

    /**
     * 周围动脉病:0-否,1-是
     */
    @ApiModelProperty(value = "周围动脉病:0-否,1-是")
    private Integer peripheralArtery;

    private String peripheralArteryText;

    /**
     * 肾功能衰竭:0-否,1-是
     */
    @ApiModelProperty(value = "肾功能衰竭:0-否,1-是")
    private Integer renalFailure;

    private String renalFailureText;

    /**
     * 颅内动脉支架:0-否,1-是
     */
    @ApiModelProperty(value = "颅内动脉支架:0-否,1-是")
    private Integer intracranialArterystent;

    private String intracranialArterystentText;

    /**
     * 颈内动脉支架:0-否,1-是
     */
    @ApiModelProperty(value = "颈内动脉支架:0-否,1-是")
    private Integer internalCarotidArteryStent;

    private String internalCarotidArteryStentText;

    /**
     * 颈内动脉内膜剥脱术:0-否,1-是
     */
    @ApiModelProperty(value = "颈内动脉内膜剥脱术:0-否,1-是")
    private Integer internalCarotidArteryEndarterectomy;

    private String internalCarotidArteryEndarterectomyText;

    /**
     * 静脉溶栓:0-否,1-是
     */
    @ApiModelProperty(value = "静脉溶栓:0-否,1-是")
    private Integer intravenousThrombolysis;

    private String intravenousThrombolysisText;

    /**
     * 动脉取栓术:0-否,1-是
     */
    @ApiModelProperty(value = "动脉取栓术:0-否,1-是")
    private Integer arterialThrombectomy;

    private String arterialThrombectomyText;

    /**
     * 代谢性疾病:0-否,1-是
     */
    @ApiModelProperty(value = "代谢性疾病:0-否,1-是")
    private Integer metabolism;

    private String metabolismText;

    /**
     * 免疫性疾病
     */
    @ApiModelProperty(value = "免疫性疾病")
    private Integer immunity;

    private String immunityText;

    /**
     * 偏头痛病
     */
    @ApiModelProperty(value = "偏头痛病")
    private Integer migraine;

    private String migraineText;

    /**
     * 呼吸睡眠暂停
     */
    @ApiModelProperty(value = "呼吸睡眠暂停")
    private Integer sleepApnea;

    private String sleepApneaText;

    /**
     * 同型半胱氨酸血症:0-否,1-是
     */
    @ApiModelProperty(value = "同型半胱氨酸血症:0-否,1-是")
    private Integer homocysteineemia;

    private String homocysteineemiaText;

    /**
     * 高尿酸血症:0-否,1-是
     */
    @ApiModelProperty(value = "高尿酸血症:0-否,1-是")
    private Integer hyperuricAcidemia;

    private String hyperuricAcidemiaText;

    /**
     * 慢性阻塞性肺疾病:0-否,1-是
     */
    @ApiModelProperty(value = "慢性阻塞性肺疾病:0-否,1-是")
    private Integer chronicObstructivePulmonaryDisease;

    private String chronicObstructivePulmonaryDiseaseText;

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