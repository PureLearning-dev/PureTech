package com.purelearning.service.user.repository.dao;

import com.purelearning.service.user.repository.entity.UserInfo;

import java.util.List;

/**
 * 用户信息表 DAO 接口
 * 提供更高层次的抽象
 */
public interface UserInfoDAO {
    UserInfo getById(Integer id);

    List<UserInfo> listAll();

    boolean save(UserInfo userInfo);

    boolean update(UserInfo userInfo);

    boolean deleteById(Integer id);
}
