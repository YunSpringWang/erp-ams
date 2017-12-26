package com.service.logs.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.common.dao.UserLoginLogsMapper;
import com.common.entity.UserLoginLogs;
import com.service.logs.UserLoginLogsService;
@Repository("userLoginLogsService")
public class UserLoginLogsServiceImpl implements UserLoginLogsService {

	@Autowired
	private UserLoginLogsMapper userLoginLogsMapper;
	
	public void insertUserLoginLogs(UserLoginLogs userLoginLogs) {
		userLoginLogsMapper.insert(userLoginLogs);
	}

}
