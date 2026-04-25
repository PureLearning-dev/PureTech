package com.purelearning.service.user.repository.dao.impl;

import com.purelearning.service.user.repository.dao.UserDAO;
import com.purelearning.service.user.repository.entity.User;
import com.purelearning.service.user.repository.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户表 DAO 实现类
 */
@Repository
public class UserDAOImpl implements UserDAO {

    private final UserMapper userMapper;

    public UserDAOImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> listAll() {
        return userMapper.selectList(null);
    }

    @Override
    public boolean save(User user) {
        return userMapper.insert(user) > 0;
    }

    @Override
    public boolean update(User user) {
        return userMapper.updateById(user) > 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        return userMapper.deleteById(id) > 0;
    }
}
