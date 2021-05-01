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
public class FollowupOnsetRecordSaveDTO {

    /**
     * 患者ID
     */
    @ApiModelProperty(value = "患者ID", required = true)
    private String patientId;

    /**
     * 随访ID
     */
    @ApiModelProperty(value = "随访ID", required = true)
    private String followupRecordsId;

    /**
     * 是否进行血管相关操作及手术
     */
    @ApiModelProperty(value = "是否进行血管相关操作及手术", required = true)
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

    @ApiModelProperty(value = "发病类型集合")
    private List<FollowupOnsetTypeDTO> onsetTypeDTOList;

}