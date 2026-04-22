package com.purelearning.service.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.purelearning.api.entity.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户登录表
 *
 * @author PureLearning
 * @date 2026/4/22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user")
public class User extends BaseDO {

    /**
     * 第三方账号ID
     */
    private String thirdAccountId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 登录方式，0-账号密码登录，1-微信登录
     */
    private Integer loginType;

    /**
     * 是否删除，0-未删除，1-已删除
     */
    private Integer isDeleted;
}

