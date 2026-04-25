package com.purelearning.service.user.repository.dao;

import com.purelearning.service.user.repository.entity.User;

import java.util.List;

/**
 * 用户表 DAO 接口
 * 提供更高层次的抽象
 */
public interface UserDAO {
    User getById(Integer id);

    List<User> listAll();

    boolean save(User user);

    boolean update(User user);

    boolean deleteById(Integer id);
}
