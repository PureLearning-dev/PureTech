package com.purelearning.service.user.repository.dao;

import com.purelearning.service.user.repository.entity.UserFoot;

import java.util.List;

/**
 * 用户足迹表 DAO 接口
 * 提供更高层次的抽象
 */
public interface UserFootDAO {
    UserFoot getById(Integer id);

    List<UserFoot> listAll();

    boolean save(UserFoot userFoot);

    boolean update(UserFoot userFoot);

    boolean deleteById(Integer id);
}
