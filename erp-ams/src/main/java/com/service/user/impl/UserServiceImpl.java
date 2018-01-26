package com.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.common.dao.SysUserMapper;
import com.common.entity.SysUser;
import com.service.user.UserService;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserMapper userMapper;
	@Override
	public void addUser(SysUser user) {
		userMapper.insert(user);
	}

}
