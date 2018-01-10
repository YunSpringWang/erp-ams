package com.common.dao;

import java.util.ArrayList;

import com.common.entity.UserLogin;

public interface UserLoginMapper {
	int deleteByPrimaryKey(String loginId);

	int insert(UserLogin record);

	int insertSelective(UserLogin record);

	UserLogin selectByPrimaryKey(String loginId);

	int updateByPrimaryKeySelective(UserLogin record);

	int updateByPrimaryKey(UserLogin record);

	ArrayList<UserLogin> selectByUserLogin(UserLogin userlogin);
}