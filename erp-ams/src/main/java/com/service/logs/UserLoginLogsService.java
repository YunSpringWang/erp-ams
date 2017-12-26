package com.service.logs;

import com.common.entity.UserLoginLogs;

public interface UserLoginLogsService {

	/**
	 * 添加登录日志记录
	 */
	public void insertUserLoginLogs(UserLoginLogs userLoginLogs);
}
