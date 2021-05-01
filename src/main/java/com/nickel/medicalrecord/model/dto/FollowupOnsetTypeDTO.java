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
public class FollowupOnsetTypeDTO {

    /**
     * 复发类型
     */
    @ApiModelProperty(value = "复发类型")
    private Integer type;

    /**
     * 复发状态
     */
    @ApiModelProperty(value = "复发状态")
    private Integer relapseStatus;

    /**
     * 首次复发时间
     */
    @ApiModelProperty(value = "首次复发时间")
    private Long relapseTime;

    /**
     * 复发次数
     */
    @ApiModelProperty(value = "复发次数")
    private Integer relapseNum;

    /**
     * 复发第几次描述
     */
    @ApiModelProperty(value = "复发第几次描述")
    private Integer relapseTextNum;

    /**
     * 复发描述
     */
    @ApiModelProperty(value = "复发描述")
    private String relapseText;

}
