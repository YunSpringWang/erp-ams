package com.common.dao;

import com.common.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String wUserId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String wUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}