<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/layui/css/layui.css" media="all" />
<script type="text/javascript" src="resources/layui/layui.js"></script>
<title>Coffee Break : 404</title>
   <link rel="stylesheet" media="screen" href="resources/error/_css/style.css" type="text/css" />
   </head> 
   <body> 
   <div class="controller">
    <div class="objects"> 
    <!-- text area -->
    <div class="text-area rotate">
    <p class="error">Error 404</p>
    <p class="details">有一个问题<br /><br />你正在寻找的页面是不是在这里或移动。</p> 
    </div> 
    <!-- text area -->
    <!-- home page --> 
    <div class="homepage rotate">
    <a href="userLoginController/toLogin">返回首页</a> 
    </div> <!-- home page --> 
    </div> <!-- social-icons --> 
    <div class="social">
    <ul class="social-icons">
    <li><a href="#"><img src="resources/error/_images/forrst.png" alt="Forrst" /></a></li>
    <li><a href="#"><img src="resources/error/_images/dribbble.png" alt="Dribbble" /></a></li>
    <li><a href="#"><img src="resources/error/_images/deviantart.png" alt="DeviantArt" /></a></li>
    <li><a href="#"><img src="resources/error/_images/flickr.png" alt="Flickr" /></a></li>
    <li><a href="#"><img src="resources/error/_images/twitter.png" alt="Twitter" /></a></li>
    <li><a href="#"><img src="resources/error/_images/facebook.png" alt="Facebook" /></a></li>
    <li><a href="#"><img src="resources/error/_images/skype.png" alt="Skype" /></a></li>
    </ul> 
    </div> 
    <!-- social-icons --> 
    </div> 

</body>
</html>