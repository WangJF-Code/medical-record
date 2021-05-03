package com.nickel.medicalrecord.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUser {
    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 账号类型：1-系统管理员，2-普通用户
     */
    @Builder.Default
    private Integer type = 2;

    /**
     * 创建时间
     */
    @Builder.Default
    private Long createTime = System.currentTimeMillis();

    /**
     * 修改时间
     */
    @Builder.Default
    private Long updateTime = System.currentTimeMillis();

    /**
     * 删除状态
     */
    @Builder.Default
    private Integer deleted = 0;

}