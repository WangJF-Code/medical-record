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
public class SysUserDTO {

    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Integer id;

    /**
     * 账号
     */
    @ApiModelProperty(value = "账号")
    private String account;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String userName;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phoneNumber;

    /**
     * 账号类型：1-系统管理员，2-普通用户
     */
    @ApiModelProperty(value = "账号类型：1-系统管理员，2-普通用户")
    private Integer type = 2;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private Long updateTime;

    /**
     * 删除状态
     */
    @ApiModelProperty(value = "删除状态")
    private Integer deleted;
}