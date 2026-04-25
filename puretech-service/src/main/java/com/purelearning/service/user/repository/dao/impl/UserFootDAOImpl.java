package com.purelearning.service.user.repository.dao.impl;

import com.purelearning.service.user.repository.dao.UserFootDAO;
import com.purelearning.service.user.repository.entity.UserFoot;
import com.purelearning.service.user.repository.mapper.UserFootMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户足迹表 DAO 实现类
 */
@Repository
public class UserFootDAOImpl implements UserFootDAO {

    private final UserFootMapper userFootMapper;

    public UserFootDAOImpl(UserFootMapper userFootMapper) {
        this.userFootMapper = userFootMapper;
    }

    @Override
    public UserFoot getById(Integer id) {
        return userFootMapper.selectById(id);
    }

    @Override
    public List<UserFoot> listAll() {
        return userFootMapper.selectList(null);
    }

    @Override
    public boolean save(UserFoot userFoot) {
        return userFootMapper.insert(userFoot) > 0;
    }

    @Override
    public boolean update(UserFoot userFoot) {
        return userFootMapper.updateById(userFoot) > 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        return userFootMapper.deleteById(id) > 0;
    }
}
