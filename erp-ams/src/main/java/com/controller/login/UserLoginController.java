package com.controller.login;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.entity.UserLogin;
import com.common.entity.UserLoginLogs;
import com.service.login.LoginService;
import com.service.logs.UserLoginLogsService;
import com.util.MD5Util;
import com.util.VeDate;

@Controller
@RequestMapping("/userLoginController")
public class UserLoginController {
	private static Logger log = Logger.getLogger(UserLoginController.class);
	private static String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
	private static String charsetname = "UTF-8";

	@Autowired
	private LoginService userLoginService;
	@Autowired
	private UserLoginLogsService userLoginLogsService;

	@RequestMapping(value = "/toRegPage")
	public String toRegPage() {
		return "/user/regPage";
	}

	@RequestMapping(value = "/toLogin")
	public String toLogin() {
		return "/login";
	}

	@RequestMapping(value = "/regUser", method = RequestMethod.POST)
	public String RegUser(UserLogin user, Model model) {
		String message = null;

		if (user != null) {

			// 判断用户名是否可用
			if (userLoginService.hasLoginUserName(user.getwLoginAccount())) {
				model.addAttribute("info", "用户名已存在，请重新输入");
				return "/user/regPage";
			} else {

				// 用MD5对密码加密处理，生成32位字符
				String password = user.getwLoginPassword();
				String passwodmd5 = MD5Util.MD5EncodeUpper(password, charsetname);
				user.setwLoginPassword(passwodmd5);
				// 设置状态（1为可用，0为不可用）
				user.setwLoginStatus(1);
				// 设置注册时间，创建时间
				user.setwLoginCreatetime(VeDate.getTimestampDate());
				// 设置用户编号，用UUID来作为唯一标识
				user.setwLoginId(uuid);

				userLoginService.addLoginUser(user);

				log.info(message);
				model.addAttribute("info", "注册成功");
				return "/login";

			}
		} else {
			return "/user/regPage";
		}
	}

	/**
	 * 
	 * 登录
	 * 
	 */

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> login(UserLogin user, String verifycode, Model model, HttpServletRequest request,

			HttpServletResponse response) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		long startTime = System.currentTimeMillis(); // 开始时间

		log.info("登录提交....");
		String password = user.getwLoginPassword();
		user.setwLoginPassword(MD5Util.MD5Encode(password, charsetname));

		String code = (String) request.getSession().getAttribute("randCode");// 得到session中的正确验证码
		System.out.println(code + user);

		boolean flag = userLoginService.loginUser(user);

		// toLowerCase()变小写
		// toUpperCase()变大写
		// (s1).equalsIgnoreCase(s2)忽略大小写比较
		if (flag && verifycode != null && code != null && verifycode.equalsIgnoreCase(code)) { // 登录验证成功

			// 将登录用户加入到session里
			// request.getSession().setAttribute("loginUser", user);
			// 创建登录log
			UserLoginLogs userLoginLogs = new UserLoginLogs();
			userLoginLogs.setwLoginId(userLoginService.getloginUser(user).getwLoginId());
			userLoginLogs.setwLoginLogsCreatedate(VeDate.getTimestampDate());
			userLoginLogs.setwLoginLogsId(uuid);
			userLoginLogs.setwLoginLogsIp(InetAddress.getLocalHost().getHostAddress().toString());
			userLoginLogs.setwLoginLogsMac(getMACAddress(InetAddress.getLocalHost()));
			userLoginLogs.setwLoginLogsSystype(1);
			long endTime = System.currentTimeMillis(); // 结束时间

			log.info("登录验证通过...登录验证用时为:" + (endTime - startTime));
			userLoginLogs.setwLoginLogsDescription("登录验证通过...登录验证用时为:" + (endTime - startTime) + "毫秒");
			userLoginLogsService.insertUserLoginLogs(userLoginLogs);
			map.put("status", "1");
			map.put("info",  "登录验证通过...登录验证用时为:" + (endTime - startTime) + "毫秒");
			return map;

		} else {// 登录验证失败

			// request.getSession().setAttribute("error", "登录出错,请检查登录信息是否正确！");
			map.put("info", "登录出错,请检查登录信息是否正确！");
			log.info("登录出错,请检查登录信息是否正确！");
			map.put("status", "error");
			return map;// 转到出错页面

		}
	}

	// 获取MAC地址的方法
	private static String getMACAddress(InetAddress ia) throws Exception {
		// 获得网络接口对象（即网卡），并得到mac地址，mac地址存在于一个byte数组中。
		byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();

		// 下面代码是把mac地址拼装成String
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < mac.length; i++) {
			if (i != 0) {
				sb.append("-");
			}
			// mac[i] & 0xFF 是为了把byte转化为正整数
			String s = Integer.toHexString(mac[i] & 0xFF);
			sb.append(s.length() == 1 ? 0 + s : s);
		}
		// 把字符串所有小写字母改为大写成为正规的mac地址并返回
		return sb.toString().toUpperCase();
	}

}
