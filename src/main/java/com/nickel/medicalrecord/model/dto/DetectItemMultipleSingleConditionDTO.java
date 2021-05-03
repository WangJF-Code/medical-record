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
public class DetectItemMultipleSingleConditionDTO {

    /**
     * 检测类型: 401-颈部血管彩超检查, 402-锁骨下动脉彩超检查, 403-磁共振血管成像(MRA), 404-磁共振弥散成像（DWI）, 405-CT 血管造影(CTA), 406-CT灌注成像（CTP）
     */
    @ApiModelProperty(value = "检测类型: 401-颈部血管彩超检查, 402-锁骨下动脉彩超检查, 403-磁共振血管成像(MRA), 404-磁共振弥散成像（DWI）, 405-CT 血管造影(CTA), 406-CT灌注成像（CTP）")
    private Integer detectType;

    /**
     * 多个单选结果: k-v（多个以，分割）
     */
    @ApiModelProperty(value = "多个单选结果: k-v（多个以;分割）")
    private String multipleSingle;

    @ApiModelProperty(hidden = true)
    private List<String> multipleSingleList;

}