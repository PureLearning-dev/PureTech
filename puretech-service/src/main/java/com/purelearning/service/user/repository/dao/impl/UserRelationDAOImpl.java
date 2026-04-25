package com.purelearning.service.user.repository.dao.impl;

import com.purelearning.service.user.repository.dao.UserRelationDAO;
import com.purelearning.service.user.repository.entity.UserRelation;
import com.purelearning.service.user.repository.mapper.UserRelationMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户关系表 DAO 实现类
 */
@Repository
public class UserRelationDAOImpl implements UserRelationDAO {

    private final UserRelationMapper userRelationMapper;

    public UserRelationDAOImpl(UserRelationMapper userRelationMapper) {
        this.userRelationMapper = userRelationMapper;
    }

    @Override
    public UserRelation getById(Integer id) {
        return userRelationMapper.selectById(id);
    }

    @Override
    public List<UserRelation> listAll() {
        return userRelationMapper.selectList(null);
    }

    @Override
    public boolean save(UserRelation userRelation) {
        return userRelationMapper.insert(userRelation) > 0;
    }

    @Override
    public boolean update(UserRelation userRelation) {
        return userRelationMapper.updateById(userRelation) > 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        return userRelationMapper.deleteById(id) > 0;
    }
}
