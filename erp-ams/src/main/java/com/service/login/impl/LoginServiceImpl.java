package com.service.login.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.common.dao.UserLoginMapper;
import com.common.entity.UserLogin;
import com.service.login.LoginService;
@Repository("LoginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserLoginMapper userLoginMapper;
	public void addLoginUser(UserLogin user) {
		userLoginMapper.insert(user);

	}
	public boolean hasLoginUserName(String LoginUserName) {
		UserLogin userlogin = new UserLogin();
		userlogin.setwLoginAccount(LoginUserName);
		ArrayList<UserLogin> ulist = userLoginMapper.selectByUserLogin(userlogin);
		//查询到数据，说明该用户名存在
		if(ulist!=null && ulist.size()!=0){
			
			return true;
		}
		return false;
	}
	
	public boolean loginUser(UserLogin user) {
	
		ArrayList<UserLogin> ulist = userLoginMapper.selectByUserLogin(user);
		if(ulist !=null && ulist.size()!=0)
		{
			return true;
		}
	return false;
	}
	@Override
	public UserLogin getloginUser(UserLogin user) {
		ArrayList<UserLogin> ulist = userLoginMapper.selectByUserLogin(user);
		
		return ulist.get(0);
	}

}
