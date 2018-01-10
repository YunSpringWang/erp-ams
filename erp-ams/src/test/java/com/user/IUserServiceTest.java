package com.user;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.common.entity.SysLoginLogs;
import com.common.entity.SysOrganization;
import com.common.entity.SysUser;
import com.common.entity.UserLogin;
import com.service.index.IndexService;
import com.service.login.LoginService;
import com.service.logs.UserLoginLogsService;
import com.service.org.OrganizationService;
import com.service.user.UserService;
import com.util.MD5Util;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:applicationContext.xml" })
public class IUserServiceTest {
	private static Logger logger = Logger.getLogger(IUserServiceTest.class);
	@Autowired
	public LoginService userloginService;
	
	@Autowired
	public OrganizationService orgService;
	
	@Autowired
	public UserService userService;
	
	@Autowired
	private UserLoginLogsService userLoginLogsService;

	@Autowired
	private IndexService indexService;

	@Test
	public void getUserByIdTest() {

		/*
		 * User user = userService.getUserById("001"); User
		 * user1=userService.getUserByLoginName("admin");
		 * 
		 * logger.info(JSON.toJSONString(user));
		 * logger.info(JSON.toJSONString(user1.getPassword()));
		 * logger.debug(JSON.toJSONString(user));
		 * logger.debug(JSON.toJSONString(user1.getPassword()));
		 */
	}

	@Test
	public void addUserLogin() {
		Date Time = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		UserLogin userlogin = new UserLogin();
		SysUser user = new SysUser();
		SysOrganization org =new SysOrganization();
		
		int orgId = 2;
		int orgFaterId=1;
		org.setOrgId(orgId);
		org.setOrgCreateDate(Time);
		org.setOrgFaterId(orgFaterId);
		org.setOrgName("测试机构02");
		org.setOrgDescription("测试机构添加");
		
		orgService.addOrganization(org);
		
		String userId ="123";
		String userName="测试用户";
		int userAge =24;
		String userEmail= "123455678@qq.com";
		String userPhone = "13125864856";
		String userTel="023-58748635";
		user.setUserId(userId);
		user.setUserName(userName);
		user.setUserCreateDate(Time);
		user.setUserStatus(1);
		user.setOrgId(orgId);
		user.setUserAge(userAge);
		user.setUserEmail(userEmail);
		user.setUserPhone(userPhone);
		user.setUserSex(1);
		user.setUserTel(userTel);
		
	//	userService.addUser(user);

		
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString().replaceAll("-", "").toUpperCase();
		String wLoginAccount = "test01";
		String wLoginQuestion = "年龄";
		String wLoginAnswer = "12";
		String wLoginPassword = "test01";
		String password = MD5Util.MD5EncodeUpper(wLoginPassword, "UTF-8");
		
		
	//	String dateString = formatter.format(currentTime);
	//	Timestamp ts = Timestamp.valueOf(dateString);
		userlogin.setLoginId(id);
		userlogin.setLoginCreateDate(Time);
		userlogin.setLoginAccount(wLoginAccount);
		userlogin.setLoginAnswer(wLoginAnswer);	
		userlogin.setLoginPassword(password);
		userlogin.setLoginQuestion(wLoginQuestion);
		userlogin.setLoginStatus(1);
		userlogin.setUserId(userId);
		

		logger.info("MD5后的密码：" + password);
		logger.info("时间为：" + Time);
	//	userloginService.addLoginUser(userlogin);


	}

	@Test
	public void isUserName() {

		String wLoginAccount = "test01";

		
		boolean t = userloginService.hasLoginUserName(wLoginAccount);
		System.out.println(t);
		logger.info(t);

	}

	@Test
	public void login() {
		UserLogin user = new UserLogin();
		String wLoginAccount = "test01";
		String password = "test01";
		user.setLoginAccount(wLoginAccount);
		user.setLoginPassword(MD5Util.MD5Encode(password, "UTF-8"));
		boolean flag = userloginService.loginUser(user);
		System.out.println(flag);
		logger.info(flag);

	}

	@Test
	public void insertuserlog() {
		// 创建登录log
		SysLoginLogs userLoginLogs = new SysLoginLogs();
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString().replaceAll("-", "").toUpperCase();
		userLoginLogs.setSysLoginLogsId(id);
		
		UserLogin user = new UserLogin();
		user.setLoginAccount("test01");
		userLoginLogs.setLoginId(userloginService.getloginUser(user).getLoginId());
		
		userLoginLogs.setSysLoginLogsCreateDate(new Date());
		try {
			userLoginLogs.setSysLoginLogsIp(InetAddress.getLocalHost().getHostAddress().toString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			userLoginLogs.setSysLoginLogsMac(getMACAddress(InetAddress.getLocalHost()));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userLoginLogs.setSysLoginLogsSystype(1);
		userLoginLogs.setSysLoginLogsDescription("登录测试");
		System.out.println(JSON.toJSONString(userLoginLogs));
		System.out.println("添加的LOG数据为：" + userLoginLogs.toString());

		userLoginLogsService.insertUserLoginLogs(userLoginLogs);
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

/*	@Test
	public void selectMenuIdByAuthorityIdTest() {
		AuthorityMenuRelationKey authority = new AuthorityMenuRelationKey();
		authority.setSysAuthorityId(1);
		List<Menu> menulist = indexService.menuList(authority);
		  TreeBuilder treeBuilder = new TreeBuilder(menulist);
	        System.out.println(treeBuilder.buildTree());
	        String json = JSON.toJSONString(treeBuilder.buildTree());
	        System.out.println("构建JSON树形结构"+json);
	}*/
}
