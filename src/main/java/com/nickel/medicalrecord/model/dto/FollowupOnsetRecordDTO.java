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
public class FollowupOnsetRecordDTO {

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID")
    private String patientId;

    /**
     * 随访ID
     */
    @ApiModelProperty(value = "随访ID")
    private String followupRecordsId;

    /**
     * 是否进行血管相关操作及手术
     */
    @ApiModelProperty(value = "是否进行血管相关操作及手术")
    private Integer vascularRelatedSurgery;

    /**
     * 血管相关操作及手术次数
     */
    @ApiModelProperty(value = "血管相关操作及手术次数")
    private Integer vascularRelatedSurgeryNum;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    @ApiModelProperty(value = "发病类型集合")
    private List<FollowupOnsetTypeDTO> onsetTypeDTOList;

}