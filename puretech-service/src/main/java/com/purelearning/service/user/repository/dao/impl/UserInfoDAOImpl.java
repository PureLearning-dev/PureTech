package com.purelearning.service.user.repository.dao.impl;

import com.purelearning.service.user.repository.dao.UserInfoDAO;
import com.purelearning.service.user.repository.entity.UserInfo;
import com.purelearning.service.user.repository.mapper.UserInfoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户信息表 DAO 实现类
 */
@Repository
public class UserInfoDAOImpl implements UserInfoDAO {

    private final UserInfoMapper userInfoMapper;

    public UserInfoDAOImpl(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    @Override
    public UserInfo getById(Integer id) {
        return userInfoMapper.selectById(id);
    }

    @Override
    public List<UserInfo> listAll() {
        return userInfoMapper.selectList(null);
    }

    @Override
    public boolean save(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo) > 0;
    }

    @Override
    public boolean update(UserInfo userInfo) {
        return userInfoMapper.updateById(userInfo) > 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        return userInfoMapper.deleteById(id) > 0;
    }
}
