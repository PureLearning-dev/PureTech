package com.purelearning.service.user.repository.dao;

import com.purelearning.service.user.repository.entity.UserRelation;

import java.util.List;

/**
 * 用户关系表 DAO 接口
 * 提供更高层次的抽象
 */
public interface UserRelationDAO {
    UserRelation getById(Integer id);

    List<UserRelation> listAll();

    boolean save(UserRelation userRelation);

    boolean update(UserRelation userRelation);

    boolean deleteById(Integer id);
}
