<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<base href="<%=basePath%>">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>
      layout 后台大布局 - Layui
    </title>
    <link rel="stylesheet" href="resources/plugins/layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="resources/css/iconfont.css">
    <link rel="stylesheet" type="text/css" href="resources/css/index.css">
    <link rel="stylesheet" href="resources/css/themes/default.css" media="all" id="skin" kit-skin />
  </head>
  
  <body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
      <div class="layui-header">
        <div class="layui-logo">
          layui 后台布局
        </div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left" lay-filter="side-left">
          <li class="layui-nav-item">
            <a href="">
              控制台
            </a>
          </li>
          <li class="layui-nav-item">
            <a href="">
              商品管理
            </a>
          </li>
          <li class="layui-nav-item">
            <a href="">
              用户
            </a>
          </li>
          <li class="layui-nav-item">
            <a href="javascript:;">
              其它系统
            </a>
            <dl class="layui-nav-child">
              <dd>
                <a href="javascript:;">
                  邮件管理
                </a>
              </dd>
              <dd>
                <a href="javascript:;">
                  消息管理
                </a>
              </dd>
              <dd>
                <a href="javascript:;">
                  授权管理
                </a>
              </dd>
            </dl>
          </li>
          <li class="layui-nav-item">
                        <span id="nowTime" style="color:#fff;padding:15px 10px;" >
                            <span class="data"></span>
                            <span class="week"></span>
                            <span class="time"></span>
                        </span>
          </li>
        </ul>
        <ul class="layui-nav layui-layout-right" lay-filter="sede-right">
          <li class="layui-nav-item">
            <a href="javascript:;" class="admin-side-full">
              <i class="iconfont">
                &#xe622;
              </i>
              全屏显示
            </a>
          </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">
                        <i class="layui-icon">&#xe63f;</i> 皮肤</a>
                    </a>
                    <dl class="layui-nav-child skin">
                        <dd><a href="javascript:;" data-skin="default" style="color:#393D49;"><i class="layui-icon">&#xe658;</i> 默认</a></dd>
                        <dd><a href="javascript:;" data-skin="orange" style="color:#ff6700;"><i class="layui-icon">&#xe658;</i> 橘子橙</a></dd>
                        <dd><a href="javascript:;" data-skin="green" style="color:#00a65a;"><i class="layui-icon">&#xe658;</i> 原谅绿</a></dd>
                        <dd><a href="javascript:;" data-skin="pink" style="color:#FA6086;"><i class="layui-icon">&#xe658;</i> 少女粉</a></dd>
                        <dd><a href="javascript:;" data-skin="blue.1" style="color:#00c0ef;"><i class="layui-icon">&#xe658;</i> 天空蓝</a></dd>
                        <dd><a href="javascript:;" data-skin="red" style="color:#dd4b39;"><i class="layui-icon">&#xe658;</i> 枫叶红</a></dd>
                    </dl>
                </li>
          <li class="layui-nav-item">
            <a href="javascript:;">
              超级管理员
              <dl class="layui-nav-child">
                <dd>
                  <a href="javascript:;">
                    <i class="iconfont icon-password">
                    </i>
                    修改密码
                  </a>
                </dd>
                <dd>
                  <a href="">
                    基本资料
                  </a>
                </dd>
                <dd>
                  <a href="">
                    安全设置
                  </a>
                </dd>
                <dd>
                  <a href="javascript:;">
                    <i class="iconfont icon-tuichu">
                    </i>
                    切换账号
                  </a>
                </dd>
              </dl>
            </a>
          </li>
          <li class="layui-nav-item">
            <a href="javascript:;">
              <i class="iconfont icon-tuichu">
              </i>
              退出
            </a>
          </li>
        </ul>
      </div>
      <div class="layui-side layui-bg-black my-side">
        <div class="layui-side-scroll">
          <div class="kit-side-fold">
            <i class="iconfont icon-caidan01 admin-side-toggle">
            </i>
          </div>
          <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
          <ul class="layui-nav layui-nav-tree" lay-filter="nav-side">
            <li class="layui-nav-item layui-nav-itemed">
              <a href="javascript:;" href-url="page/main/main.html">
                <i class="iconfont icon-shouye">
                </i>
                &nbsp;首页
              </a>
            </li>
            <li class="layui-nav-item">
              <a href="javascript:;" >
                <i class="iconfont icon-rizhiguanli">
                </i>
                &nbsp;日志
              </a>
              <dl class="layui-nav-child">
                <dd>
                  <a href="javascript:;"  href-url="loginLogsController/toLoginLogsListPage">
                    <i class="iconfont icon-denglurizhi">
                    </i>
                    <span>
                      登陆日志
                    </span>
                  </a>
                </dd>
                <dd>
                  <a href="javascript:;" href-url="page/log/operate_list.html">
                    <i class="iconfont icon-caozuorizhi">
                    </i>
                    <span>
                      操作日志
                    </span>
                  </a>
                </dd>
                <dd>
                  <a href="javascript:;"  href-url="page/log/sys_exception_list.html">
                    <i class="iconfont icon-xitongyonghudenglurizhi">
                    </i>
                    <span>
                      系统异常日志
                    </span>
                  </a>
                </dd>
              </dl>
            </li>
            <li class="layui-nav-item">
              <a href="javascript:;">
                <i class="iconfont icon-xitongshezhi">
                </i>
                &nbsp;系统设置
              </a>
              <dl class="layui-nav-child">
                <dd>
                  <a href="javascript:;" href-url="page/config/list.html">
                    <i class="iconfont icon-jichupeizhi">
                    </i>
                    <span>
                      基础配置（模块）
                    </span>
                  </a>
                  <dd>
                    <a href="javascript:;" href-url="page/role/list.html">
                      <i class="iconfont icon-jiaoseguanli">
                      </i>
                      <span>
                        角色管理
                      </span>
                    </a>
                  </dd>
                  <dd>
                    <a href="javascript:;" href-url="page/user/list.html">
                      <i class="iconfont icon-yonghuguanli-copy">
                      </i>
                      <span>
                        账号管理
                      </span>
                    </a>
                  </dd>
                  <dd>
                    <a href="javascript:;" href-url="page/organize/list.html">
                      <i class="iconfont icon-yonghu">
                      </i>
                      <span>
                        用户组（机构）
                      </span>
                    </a>
                  </dd>
                  <dd>
                    <a href="javascript:;">
                      <i class="iconfont icon-shujukuguanli">
                      </i>
                      <span>
                        数据库管理
                      </span>
                    </a>
                  </dd>
              </dl>
            </li>
            <li class="layui-nav-item">
              <!-- 去除 layui-nav-itemed 即可关闭展开 -->
              <a href="javascript:;">
                <i class="layui-icon">
                  &#xe628;
                </i>
                &nbsp;扩展
              </a>
              <dl class="layui-nav-child">
                <dd>
                  <a href="javascript:;" href-url="demo/login.html">
                    <i class="layui-icon">
                      &#xe621;
                    </i>
                    登录页
                  </a>
                </dd>
                <dd>
                  <a href="javascript:;" href-url="demo/add-edit.html">
                    <i class="layui-icon">
                      &#xe621;
                    </i>
                    添加-修改
                  </a>
                </dd>
                <dd>
                  <a href="javascript:;" href-url="demo/data-table.html">
                    <i class="layui-icon">
                      &#xe621;
                    </i>
                    data-table 表格页
                  </a>
                </dd>
                <dd>
                  <a href="javascript:;" href-url="demo/tree-table.html">
                    <i class="layui-icon">
                      &#xe621;
                    </i>
                    Tree table树表格页
                  </a>
                </dd>
                <dd>
                  <a href="javascript:;" href-url="demo/404.html">
                    <i class="layui-icon">
                      &#xe621;
                    </i>
                    404页
                  </a>
                </dd>
                <dd>
                  <a href="javascript:;" href-url="demo/tips.html">
                    <i class="layui-icon">
                      &#xe621;
                    </i>
                    提示页
                  </a>
                </dd>
              </dl>
            </li>
            <li class="layui-nav-item">
              <a href="javascript:;">
                <i class="iconfont icon-zujian">
                </i>
                &nbsp; 组件
              </a>
              <dl class="layui-nav-child">
                <dd>
                  <a href="javascript:;">
                    <i class="layui-icon">
                      &#xe658;
                    </i>
                    <span>
                      Navbar
                    </span>
                  </a>
                </dd>
                
                <dd>
                  <a href="javascript:;" href-url="demo/map.html">
                    <i class="layui-icon">
                      &#xe621;
                    </i>
                    图表
                  </a>
                </dd>
                <dd>
                  <a href="javascript:;">
                    <i class="layui-icon">
                      &#xe658;
                    </i>
                    <span>
                      Tab
                    </span>
                  </a>
                </dd>
                <dd>
                  <a href="javascript:;">
                    <i class="layui-icon">
                      &#xe658;
                    </i>
                    <span>
                      OneLevel
                    </span>
                  </a>
                </dd>
                <dd>
                  <a href="javascript:;" href-url="https://www.baidu.com">
                    <i class="layui-icon">
                      &#xe658;
                    </i>
                    <span>
                      app.js主入口
                    </span>
                  </a>
                </dd>
              </dl>
            </li>
          </ul>
        </div>
      </div>
      <div class="layui-body">
        <!-- 内容主体区域 -->
        <div class="layui-tab" lay-filter="tab-card" lay-allowclose="true">

          <ul class="layui-tab-title" id="tabBody">
            <li class="layui-this" lay-id="-1">
              <i class="layui-icon">
                
              </i>
              <span>控制面板</span>
            </li>
          </ul>
          <div class="layui-tab-content" id="tabContent">
               <div class="layui-tab-item layui-show">
                    <iframe id="iframe" src="indexController/toWelcome" frameborder="0"></iframe>
                </div>
          </div>
        </div>
      </div>
      <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
      </div>
    </div>
    <script src="resources/plugins/layui/layui.js">
    </script>
    <script src="resources/js/index.js">
    </script>
  </body>

</html>