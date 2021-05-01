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
public class FollowupDrugTypeDTO {

    /**
     * 服药类型
     */
    @ApiModelProperty(value = "服药类型")
    private Integer eatDrugType;

    /**
     * 服用药物(以,分割)
     */
    @ApiModelProperty(value = "服用药物(以,分割)")
    private String eatDrugText;

}
