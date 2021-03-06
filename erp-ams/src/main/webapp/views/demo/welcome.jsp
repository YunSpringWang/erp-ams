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
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>欢迎页2</title>
    <link rel="stylesheet" href="resources/plugins/layui/css/layui.css">
</head>
<body class="body">

<div class="layui-collapse" lay-accordion="" lay-filter="collapse">
    <div class="layui-colla-item">
        <h2 class="layui-colla-title">软件信息</h2>
        <div class="layui-colla-content layui-show">
            <table class="layui-table">
                <tr>
                    <td width="40%">软件名称</td>
                    <td width="60%">vip-admin 后台模板 Html</td>
                </tr>
                <tr>
                    <td>系统版本</td>
                    <td>v1.6.0</td>
                </tr>
                <tr>
                    <td>QQ群</td>
                    <td>436767646 或者点击 <a href="http://qm.qq.com/cgi-bin/qm/qr?k=jVYSxzwk9dZXNHdZq8owgzwzVjbzAp02">添加</a></td>
                </tr>
                <tr>
                    <td>官网</td>
                    <td><a href="javascript:parent.location.href='http://vip-admin.com/';">vip-admin</a></td>
                </tr>
                <tr>
                    <td>layui</td>
                    <td><a href="javascript:parent.location.href='http://www.layui.com/';">layui</a></td>
                </tr>
            </table>
        </div>
    </div>
    <div class="layui-colla-item">
        <h2 class="layui-colla-title">服务器信息</h2>
        <div class="layui-colla-content">
            <table class="layui-table">
                <tr>
                    <td width="40%">服务器域名</td>
                    <td width="60%"></td>
                </tr>
                <tr>
                    <td>服务器标识</td>
                    <td></td>
                </tr>
                <tr>
                    <td>服务器操作系统</td>
                    <td></td>
                </tr>
                <tr>
                    <td>服务器解译引擎</td>
                    <td></td>
                </tr>
                <tr>
                    <td>服务器语言</td>
                    <td></td>
                </tr>
                <tr>
                    <td>服务器端口</td>
                    <td></td>
                </tr>
                <tr>
                    <td>服务器主机名</td>
                    <td></td>
                </tr>
                <tr>
                    <td>站点名称</td>
                    <td></td>
                </tr>
                <tr>
                    <td>目录物理路径</td>
                    <td></td>
                </tr>
            </table>
        </div>
    </div>
    <div class="layui-colla-item">
        <h2 class="layui-colla-title">数据库信息</h2>
        <div class="layui-colla-content">
            <table class="layui-table">
                <tr>
                    <td width="40%">数据库版本</td>
                    <td width="60%"></td>
                </tr>
                <tr>
                    <td>数据库名称</td>
                    <td></td>
                </tr>
                <tr>
                    <td>数据库大小</td>
                    <td></td>
                </tr>
            </table>
        </div>
    </div>
    <div class="layui-colla-item">
        <h2 class="layui-colla-title">PHP相关参数</h2>
        <div class="layui-colla-content">
            <table class="layui-table">
                <tr>
                    <td width="40%">PHP版本</td>
                    <td width="60%"></td>
                </tr>
                <tr>
                    <td>上传文件最大限制</td>
                    <td></td>
                </tr>
                <tr>
                    <td>脚本占用最大内存</td>
                    <td></td>
                </tr>
                <tr>
                    <td>POST提交最大限制</td>
                    <td></td>
                </tr>
            </table>
        </div>
    </div>
</div>

<script type="text/javascript" src="resources/plugins/layui/layui.js"></script>
<script type="text/javascript">
    layui.use(['layer','element'], function () {
        var layer = layui.layer, element = layui.element;

        //监听折叠
        element.on('collapse(collapse)', function(data){
            layer.msg('展开状态：'+ data.show);
        });

        // you code ...


    });
</script>
</body>
</html>