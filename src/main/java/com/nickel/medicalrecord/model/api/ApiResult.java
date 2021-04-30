package com.nickel.medicalrecord.model.api;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ApiResult<T> {

    @ApiModelProperty("标识代码,200表示成功，非200表示出错")
    private int code;

    @ApiModelProperty("结果提示信息")
    private String message;

    @ApiModelProperty("返回的数据")
    private T data;

}
