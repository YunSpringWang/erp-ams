<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<% 
String path = request.getContextPath(); 
// 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是 http://localhost:8080/MyApp/）: 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<base href="<%=basePath%>"> 
<link rel="stylesheet" href="resources/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="resources/css/login.css" />
<script type="text/javascript" src="resources/layui/layui.js"></script>
<script>
	layui.use([ 'layer', 'form' ], function() {
		var layer = layui.layer, $ = layui.jquery, form = layui.form();

		form.on('submit(login)', function(data) {
			<!--
			form.verify({
				username : function(value, item) { //value：表单的值、item：表单的DOM对象
					if (!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$")
							.test(value)) {
						return '用户名不能有特殊字符';
					}
					if (/(^\_)|(\__)|(\_+$)/.test(value)) {
						return '用户名首尾不能出现下划线\'_\'';
					}
					if (/^\d+\d+\d$/.test(value)) {
						return '用户名不能全为数字';
					}
				}
				我们既支持上述函数式的方式，也支持下述数组的形式
				数组的两个值分别代表：[正则匹配、匹配不符时的提示文字]
			,
				password : [ /^[\S]{6,12}$/, '密码必须8到16位，且不能出现空格' ]
			});
			-->
			location.href = 'tmp/index.html';
			return false;
		});
	});
</script>
</head>

<body class="beg-login-bg">
	<div class="beg-login-box">
		<header>
		<h1>后台登录</h1>
		</header>
		<div class="beg-login-main">
			<form action="/manage/login" class="layui-form" method="post">
				<input name="__RequestVerificationToken" type="hidden"
					value="fkfh8D89BFqTdrE2iiSdG_L781RSRtdWOH411poVUWhxzA5MzI8es07g6KPYQh9Log-xf84pIR2RIAEkOokZL3Ee3UKmX0Jc8bW8jOdhqo81" />
				<div class="layui-form-item">
					<label class="layui-form-label">用户名<i class="layui-icon">&#xe612;</i></label>
					<div class="layui-input-block">
						<input type="text" name="userName" required placeholder="这里输入登录名"
							autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">密码<i class="layui-icon">&#xe642;</i></label>
					<div class="layui-input-block">

						<input type="text" name="password" required placeholder="这里输入密码"
							autocomplete="off" class="layui-input">
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label">验证码<i class="layui-icon">&#xe642;</i></label>
					<div class="layui-input-inline">
						<input type="number" name="code" class="layui-input"
							lay-verify="code" placeholder="验证码" maxlength="4" /><img
							src="img/v.png" onclick="getImage()" title="单击刷新验证码"
							id="img_rand_code" alt="">
					</div>
				</div>



				<div class="layui-form-item">
					<div class="beg-pull-left beg-login-remember">
						<label>记住帐号？</label> <input type="checkbox" name="rememberMe"
							value="true" lay-skin="switch" checked title="记住帐号">
					</div>
					<div class="beg-pull-right">
						<button class="layui-btn" lay-submit lay-filter="login">
							<i class="layui-icon">&#xe63d;</i> 登录
						</button>
					</div>

				</div>
				<div class="layui-form-item">
					<div class="beg-pull-right">
						<p>
							<a href="javascript:;" class="fr">忘记密码？</a>
						</p>
					</div>
					<div class="beg-pull-left">
						<p>
							<a href="javascript:location.href='userController/toRegPage';"
								class="fl">立即注册</a>
						</p>


					</div>
					<div class="beg-clear"></div>
				</div>
			</form>
		</div>

		<footer>
		<p>Beginner © Spring.Wang</p>
		</footer>
	</div>

</body>

</html>