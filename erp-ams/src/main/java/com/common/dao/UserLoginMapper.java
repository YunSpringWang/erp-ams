package com.common.dao;

import java.util.ArrayList;

import com.common.entity.UserLogin;

public interface UserLoginMapper {
    int deleteByPrimaryKey(String wLoginId);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(String wLoginId);
    
    ArrayList<UserLogin> selectByUserLogin(UserLogin userlogin);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);
}