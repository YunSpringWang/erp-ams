package com.service.logs;

import java.util.ArrayList;

import com.common.entity.SysLoginLogs;

public interface UserLoginLogsService {

	/**
	 * 添加登录日志记录
	 */
	public void insertUserLoginLogs(SysLoginLogs userLoginLogs);
	
	public ArrayList<SysLoginLogs> getListUserLoginLogs(SysLoginLogs userLoginLogs);
}
