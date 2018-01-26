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
