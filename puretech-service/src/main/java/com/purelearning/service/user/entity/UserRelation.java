package com.purelearning.service.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.purelearning.api.entity.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户关系表
 *
 * @author PureLearning
 * @date 2026/4/22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user_relation")
public class UserRelation extends BaseDO {

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
}

