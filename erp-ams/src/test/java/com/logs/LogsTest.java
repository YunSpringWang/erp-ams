package com.logs;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.common.entity.SysLoginLogs;
import com.service.logs.UserLoginLogsService;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:applicationContext.xml" })
public class LogsTest {

	@Autowired
	public UserLoginLogsService userLoginLogsService;
	@Test
	public void getListUserLoginLogs() {
		SysLoginLogs userLoginLogs = new SysLoginLogs();
		
		ArrayList<SysLoginLogs> list = userLoginLogsService.getListUserLoginLogs(userLoginLogs);
		for(SysLoginLogs i : list){
			System.out.println(i);
		}
	}
}
