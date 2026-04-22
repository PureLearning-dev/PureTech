package com.purelearning.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 数据库实体基类
 * 包含所有表的共有属性
 *
 * @author PureLearning
 * @date 2026/4/22
 */
@Data
public class BaseDO {

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    protected Integer id;

    /**
     * 创建时间
     */
    protected LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    protected LocalDateTime updateTime;
}

