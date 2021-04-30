package com.nickel.medicalrecord.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommonOptions {

    @ApiModelProperty(value = "值")
    private Object value;

    @ApiModelProperty(value = "标签")
    private String label;

}