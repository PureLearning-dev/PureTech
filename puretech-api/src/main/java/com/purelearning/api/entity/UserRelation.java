package com.purelearning.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户关系表
 *
 * @author PureLearning
 * @date 2026/4/22
 */
@Data
@TableName("user_relation")
public class UserRelation {

    /**
     * 用户关系ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 作者用户ID
     */
    private Integer userId;

    /**
     * 关注的userID的用户ID，即粉丝ID
     */
    private Integer followUserId;

    /**
     * 关注状态，0-未关注，1-已关注，2-取消关注
     */
    private Integer followState;

    /**
     * 是否删除，0-未删除，1-已删除
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    private LocalDateTime updateTime;
}

