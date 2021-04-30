package com.nickel.medicalrecord.model;

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
public class Page<T> {

    @ApiModelProperty(value = "当前页", example = "1")
    private Integer currPage;

    @ApiModelProperty(value = "分页数", example = "20")
    private Integer pageSize;

    @ApiModelProperty(value = "总条数")
    private Integer count;

    @ApiModelProperty(value = "分页数据")
    private List<T> data;

}
