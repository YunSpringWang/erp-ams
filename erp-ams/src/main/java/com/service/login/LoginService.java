package com.service.login;

import com.common.entity.UserLogin;

public interface LoginService {

	/**
	 * 	注册用户--添加
	 */
	public void addLoginUser(UserLogin user);
	/**
	 * 判断该用户名是否存在
	 * @param LoginUserName
	 * @return true 存在，false 不存在
	 */
	public boolean hasLoginUserName(String LoginUserName);
	/**
	 * 验证登录用户与密码是否对应
	 * @param user
	 * @return true 正确，false 错误
	 */
	public boolean loginUser(UserLogin user);
	
	public UserLogin getloginUser(UserLogin user);

}
