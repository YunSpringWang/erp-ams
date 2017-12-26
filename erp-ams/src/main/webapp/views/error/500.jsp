<%@page import="java.io.PrintStream"%>  
<%@page import="java.io.ByteArrayOutputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/layui/css/layui.css" media="all" />
<script type="text/javascript" src="resources/layui/layui.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<title>500 服务器内部错误</title>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	background: #efefef;
	font-family: Georgia, Times, Verdana, Geneva, Arial, Helvetica,
		sans-serif;
}

div#mother {
	margin: 0 auto;
	width: 943px;
	height: 572px;
	position: relative;
}

div#errorBox {
	background: url(resources/error/_images/404_bg.png) no-repeat top left;
	width: 943px;
	height: 572px;
	margin: auto;
}

div#errorText {
	color: #39351e;
	padding: 146px 0 0 446px
}

div#errorText p {
	width: 303px;
	font-size: 14px;
	line-height: 26px;
}

div.link { /*background:#f90;*/
	height: 50px;
	width: 145px;
	float: left;
}

div#home {
	margin: 20px 0 0 444px;
}

div#contact {
	margin: 20px 0 0 25px;
}

h1 {
	font-size: 40px;
	margin-bottom: 35px;
}
</style>
</head>
<body>
	<div id="mother">
		<div id="errorBox">
			<div id="errorText">
				<h1>Sorry..页面出错啦！</h1>
				<h1>服务器内部错误</h1>
				<p>处理您的请求时发生错误！请确认您通过正确途径操作。</p>
				<p>似乎你所寻找的网页已移动或丢失了。
				<p>或者也许你只是键入错误了一些东西。</p>
				请不要担心，这没事。如果该资源对你很重要，请与管理员联系。
				</p>
				<p>火星不太安全，我可以免费送你回地球</p>
			</div>
			<a href="http://www.mycodes.net" title="返回首页">
				<div class="link" id="home"></div>
			</a> <a href="#" title="联系管理员">
				<div class="link" id="contact"></div>
			</a>
		</div>
		<div style="display: none;">
			<%
				//此处输出异常信息  
				exception.printStackTrace();
				ByteArrayOutputStream ostr = new ByteArrayOutputStream();
				exception.printStackTrace(new PrintStream(ostr));
				out.print(ostr);
			%>
		</div>
	</div>
	<div style="text-align: center;">
		<p>
			来源：<a href="http://www.mycodes.net/" target="_blank">源码之家</a>
		</p>
	</div>
</body>
</html>