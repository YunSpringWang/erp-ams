package com.service.logs.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.common.dao.SysLoginLogsMapper;
import com.common.entity.SysLoginLogs;
import com.service.logs.UserLoginLogsService;
@Repository("userLoginLogsService")
@Transactional
public class UserLoginLogsServiceImpl implements UserLoginLogsService {

	@Autowired
	private SysLoginLogsMapper userLoginLogsMapper;
	
	public void insertUserLoginLogs(SysLoginLogs userLoginLogs) {
		userLoginLogsMapper.insert(userLoginLogs);
	}

	
	public ArrayList<SysLoginLogs> getListUserLoginLogs(SysLoginLogs userLoginLogs) {
		ArrayList<SysLoginLogs> logsList = userLoginLogsMapper.getListSysLoginLogs(userLoginLogs);	
		return logsList;
	}

}
