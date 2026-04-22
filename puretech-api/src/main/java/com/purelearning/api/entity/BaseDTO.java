package com.purelearning.api.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 数据传输对象基类
 * 用于API请求/响应的数据传输
 *
 * @author PureLearning
 * @date 2026/4/22
 */
@Data
public class BaseDTO {

    /**
     * 主键ID
     */
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

