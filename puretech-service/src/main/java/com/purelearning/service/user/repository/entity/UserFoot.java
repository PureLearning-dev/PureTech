package com.purelearning.service.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.purelearning.api.entity.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户足迹表
 * 记录用户与文章、评论的交互信息
 *
 * @author PureLearning
 * @date 2026/4/22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user_foot")
public class UserFoot extends BaseDO {

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 文档ID（文章/评论）
     */
    private Integer documentId;

    /**
     * 文档类型，1-文章，2-评论
     */
    private Integer documentType;

    /**
     * 文档所属用户ID
     */
    private Integer documentUserId;

    /**
     * 是否删除，0-未删除，1-已删除
     */
    private Integer isDeleted;

    /**
     * 收藏状态，0-未收藏，1-已收藏，2-取消收藏
     */
    private Integer collectionState;

    /**
     * 阅读状态，0-未读，1-已读
     */
    private Integer readState;

    /**
     * 评论状态，0-未评论，1-已评论，2-删除评论
     */
    private Integer commentState;

    /**
     * 点赞状态，0-未点赞，1-已点赞，2-取消点赞
     */
    private Integer praiseState;
}

