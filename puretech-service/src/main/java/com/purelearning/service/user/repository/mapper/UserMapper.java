package com.purelearning.service.user.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.purelearning.service.user.repository.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表 Mapper 接口
 * 提供基础的 CRUD 操作
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
