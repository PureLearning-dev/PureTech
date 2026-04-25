package com.purelearning.service.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.purelearning.api.entity.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * 用户个人信息表
 *
 * @author PureLearning
 * @date 2026/4/22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user_info")
public class UserInfo extends BaseDO {

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像URL
     */
    private String avatarUrl;

    /**
     * 性别，0-未知，1-男，2-女
     */
    private Integer gender;

    /**
     * 职位
     */
    private String position;

    /**
     * 公司
     */
    private String company;

    /**
     * 个人简介
     */
    private String profile;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 扩展字段
     */
    private String extend;

    /**
     * 是否删除，0-未删除，1-已删除
     */
    private Integer isDeleted;
}

