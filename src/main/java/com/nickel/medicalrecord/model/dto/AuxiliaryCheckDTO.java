package com.nickel.medicalrecord.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuxiliaryCheckDTO {

    @ApiModelProperty(value = "抗血小板药物基因检测")
    @Builder.Default
    private List<DetectAntiplateletDrugGenesDTO> antiplateletDrugGenesList = new ArrayList<>();

    @ApiModelProperty(value = "生化全项")
    @Builder.Default
    private List<DetectBiochemicalFullItemDTO> biochemicalFullItemList = new ArrayList<>();

    @ApiModelProperty(value = "血常规")
    @Builder.Default
    private List<DetectBloodRoutineDTO> bloodRoutineList = new ArrayList<>();

    @ApiModelProperty(value = "凝血常规")
    @Builder.Default
    private List<DetectClottingRoutineDTO> clottingRoutineList = new ArrayList<>();

    @ApiModelProperty(value = "心电图")
    @Builder.Default
    private List<DetectEkgDTO> ekgList = new ArrayList<>();

    @ApiModelProperty(value = "炎症介质")
    @Builder.Default
    private List<DetectInflammatoryMediaDTO> inflammatoryMediaList = new ArrayList<>();

    @ApiModelProperty(value = "磁共振磁敏感成像(SWI)")
    @Builder.Default
    private List<DetectSwiDTO> swiList = new ArrayList<>();

    @ApiModelProperty(value = "血脂十三项")
    @Builder.Default
    private List<DetectThirteenBloodLipidsDTO> thirteenBloodLipidsList = new ArrayList<>();

    @ApiModelProperty(value = "甲状腺功能")
    @Builder.Default
    private List<DetectThyroidFunctionDTO> thyroidFunctionList = new ArrayList<>();

    @ApiModelProperty(value = "颅脑核磁共振(MRI)")
    @Builder.Default
    private List<DetectItemMultipleDTO> multiple301List = new ArrayList<>();

    @ApiModelProperty(value = "颈部血管彩超检查")
    @Builder.Default
    private List<DetectItemMultipleSingleDTO> multipleSingle401List = new ArrayList<>();

    @ApiModelProperty(value = "锁骨下动脉彩超检查")
    @Builder.Default
    private List<DetectItemMultipleSingleDTO> multipleSingle402List = new ArrayList<>();

    @ApiModelProperty(value = "磁共振血管成像(MRA)")
    @Builder.Default
    private List<DetectItemMultipleSingleDTO> multipleSingle403List = new ArrayList<>();

    @ApiModelProperty(value = "磁共振弥散成像(DWI)")
    @Builder.Default
    private List<DetectItemMultipleSingleDTO> multipleSingle404List = new ArrayList<>();

    @ApiModelProperty(value = "CT 血管造影(CTA)")
    @Builder.Default
    private List<DetectItemMultipleSingleDTO> multipleSingle405List = new ArrayList<>();

    @ApiModelProperty(value = "CT灌注成像(CTP)")
    @Builder.Default
    private List<DetectItemMultipleSingleDTO> multipleSingle406List = new ArrayList<>();

    @ApiModelProperty(value = "24小时心电监测(Holter)")
    @Builder.Default
    private List<DetectItemOutcomeDTO> outcome501List = new ArrayList<>();

    @ApiModelProperty(value = "心脏超声")
    @Builder.Default
    private List<DetectItemOutcomeDTO> outcome502List = new ArrayList<>();

    @ApiModelProperty(value = "颅脑计算机 X 线体层摄影(CT)")
    @Builder.Default
    private List<DetectItemOutcomeDTO> outcome503List = new ArrayList<>();

    @ApiModelProperty(value = "磁共振灌注成像(ASL)")
    @Builder.Default
    private List<DetectItemOutcomeDTO> outcome504List = new ArrayList<>();

    @ApiModelProperty(value = "磁共振(DTI)")
    @Builder.Default
    private List<DetectItemOutcomeDTO> outcome505List = new ArrayList<>();

    @ApiModelProperty(value = "眼底OCTA")
    @Builder.Default
    private List<DetectItemOutcomeDTO> outcome506List = new ArrayList<>();

    @ApiModelProperty(value = "眼底照相")
    @Builder.Default
    private List<DetectItemOutcomeDTO> outcome507List = new ArrayList<>();

    @ApiModelProperty(value = "经颅多普勒检查")
    @Builder.Default
    private List<DetectItemSingleDTO> single201List = new ArrayList<>();

    @ApiModelProperty(value = "颅内血管高分辨磁共振成像(HMR)")
    @Builder.Default
    private List<DetectItemSingleDTO> single202List = new ArrayList<>();

    @ApiModelProperty(value = "尿流动力学检查")
    @Builder.Default
    private List<DetectItemSingleDTO> single203List = new ArrayList<>();

    @ApiModelProperty(value = "下肢静脉血管超声")
    @Builder.Default
    private List<DetectItemSingleDTO> single204List = new ArrayList<>();

    @ApiModelProperty(value = "血沉")
    @Builder.Default
    private List<DetectItemValueDTO> value101List = new ArrayList<>();

    @ApiModelProperty(value = "糖化血红蛋白")
    @Builder.Default
    private List<DetectItemValueDTO> value102List = new ArrayList<>();

}
