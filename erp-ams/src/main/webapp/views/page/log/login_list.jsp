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
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>登录日志</title>
<link rel="stylesheet" href="resources/plugins/layui/css/layui.css">
<script type="text/javascript" src="resources/plugins/layui/layui.js"></script>
<!-- <script type="text/javascript" src="resources/js/log/list.js"></script> -->
</head>
<body>
	<form class="layui-form " action="">
		<div class="layui-form-item">
			<label class="layui-form-label">用户名:</label>
			<div class="layui-input-inline">
				<input type="text" name="username" placeholder="请输入用户名"
					class="layui-input">
			</div>
			<label class="layui-form-label">操作时间:</label>
			<div class="layui-input-inline">
				<input class="layui-input" placeholder="开始日" id="LAY_demorange_s"
					name="startDate">
			</div>
			<div class="layui-input-inline">
				<input class="layui-input" placeholder="截止日" id="LAY_demorange_e"
					name="endDate">
			</div>
			<div class="layui-input-inline">
				<button class="layui-btn search-btn" table-id="syslogTable"
					lay-submit="" lay-filter="search">
					<i class="fa fa-search">&nbsp;</i>查询
				</button>
				<button type="reset" class="layui-btn layui-btn-primary">
					<i class="fa fa-refresh">&nbsp;</i>重置
				</button>
			</div>
		</div>
	</form>

	<div class="layui-form ">
		<table class="layui-table" id="syslogTable"></table>
	</div>
<script type="text/javascript">
layui.use([ 'layer', 'element', 'util', 'jquery', 'form', 'laypage','layedit', 'laydate' ],function() {
	var form = layui.form, layer = layui.layer, layedit = layui.layedit, laydate = layui.laydate, laypage = layui.laypage,$=layui.jquery;
	$(document).ready(function() {
		// ajax请求后台数据
		getShopCustomerManagePageInfo();
		// 点击搜索时 搜索数据
		$("#selectButton").click(function() {
			getShopCustomerManagePageInfo();
			currentPageAllAppoint = 1; // 当点击搜索的时候，应该回到第一页
			toPage(); // 然后进行分页的初始化
		});
		//toPage();
	});

	// 分页参数设置 这些全局变量关系到分页的功能
	var startAllAppoint = 0;
	var limitAllAppoint = 10;
	var currentPageAllAppoint = 1;
	var totalPageAllAppoint = 0;
	var dataLength = 0;
	// ajax请求后台数据
	function getShopCustomerManagePageInfo() {
		$.ajax({
			async : false,
			url : "<%=basePath%>/loginLogsController/getLoginLogsList",
			data : {
				start : startAllAppoint,
				limit : limitAllAppoint,
				selectValue : $("#syslogTable").val()
			},
			success : function(data, status) {
				data = eval("(" + data + ")");
				console.log(data.data)
				getShopCustomesInfo(data.data);
				startAllAppoint = data.currentResult; // 当前页数(后台返回)
				totalPageAllAppoint = data.totalPage; // 总页数(后台返回)
			}
		});

	}

	function getShopCustomesInfo(data) {
		var s = "<tr><th>sysLoginLogsId</th><th>loginId</th><th>sysLoginLogsIp</th><th>sysLoginLogsMac</th><th>sysLoginLogsSystype</th><th>sysLoginLogsCreateDate</th><th>sysLoginLogsDescription</th></tr>";
		$.each(data, function(v, o) {
			s += '<tr><td>' + o.sysLoginLogsId + '</td>';
			s += '<td>' + o.loginId + '</td>';
			s += '<td>' + o.sysLoginLogsIp + '</td>';
			s += '<td>' + o.sysLoginLogsMac + '</td>';
			s += '<td>' + o.sysLoginLogsSystype + '</td>';
			s += '<td>' + o.sysLoginLogsCreateDate + '</td>';
			s += '<td>' + o.sysLoginLogsDescription + '</td></tr>';
		});

		if (data.length > 0) {
			$("#syslogTable").html(s);
		} else {
			$("#page1").hide();
			$("#syslogTable").html("<br/><span style='width:10%;height:30px;display:block;margin:0 auto;'>暂无数据</span>");
		}

	}

	function toPage() {
		var nums = 10;
		// 调用分页
		laypage.render({
			cont : 'paged',
			pages : totalPageAllAppoint // 得到总页数，在layui2.X中使用count替代了，并且不是使用"总页数"，而是"总记录条数"
			,
			curr : currentPageAllAppoint,
			skip : true,
			jump : function(obj, first) {

				currentPageAllAppoint = obj.curr;
				startAllAppoint = (obj.curr - 1)
						* limitAllAppoint;
				// document.getElementById('biuuu_city_list').innerHTML
				// = render(obj, obj.curr);
				if (!first) { // 一定要加此判断，否则初始时会无限刷新
					getShopCustomerManagePageInfo(); // 一定要把翻页的ajax请求放到这里，不然会请求两次。
					// location.href = '?page='+obj.curr;
				}
			}
		});
	}
	;
});

</script>
</body>
</html>