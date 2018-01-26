package com.controller.loginlogs;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.entity.JOSNForTableFormat;
import com.common.entity.SysLoginLogs;
import com.service.logs.UserLoginLogsService;

@Controller
@RequestMapping("/loginLogsController")
public class LoginLogsController {

	@Autowired
	private UserLoginLogsService userLoginLogsService;

	@RequestMapping("/toLoginLogsListPage")
	public String toLoginLogsListPage() {
		return "/page/log/login_list";
	}

	@ResponseBody
	@RequestMapping("/getLoginLogsList")
	public JOSNForTableFormat getLoginLogsList(String page,String limit) {
		SysLoginLogs userLoginLogs = new SysLoginLogs();
		System.out.println(page+"------------------"+limit);
		ArrayList<SysLoginLogs> list = userLoginLogsService.getListUserLoginLogs(userLoginLogs);
		JOSNForTableFormat format = new JOSNForTableFormat("0", "", 100, list);
		System.out.println(format);
		return format;
	}
}
