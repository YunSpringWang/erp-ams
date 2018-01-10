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
<title>Title</title>
</head>
<body>
	<div class="layui-field-box">
		<form class="layui-form" action="">
			<div class="layui-form-item">
				<label class="layui-form-label">类型<span class="span_must">*</span></label>
				<div cyType="radioTool"
					cyProps="codeName:'menuType',filter:'menuType'" name="type"
					value="1" lay-verify="required" class="layui-input-normal"></div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">菜单名称<span class="span_must">*</span></label>
				<div class="layui-input-normal">
					<input type="text" name="name" lay-verify="required"
						autocomplete="off" placeholder="请输入菜单名称" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">上级菜单<span class="span_must">*</span></label>
				<div class="layui-input-normal">
					<input value="" id="parent" cyType="treeTool" lay-verify="required"
						cyProps="url:'/sys/menu/select',name:'parentId'"
						placeholder="请选择上级菜单" class="layui-input" />
					<%--<input type="text"   style="display: none" name="parentId"  class="layui-input">--%>
					<!-- 选择菜单 -->
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">菜单URL<span
					class="label_span">:</span></label>
				<div class="layui-input-normal">
					<input type="text" name="url" placeholder="请输入url"
						autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">授权标识<span class="label_span">:</span></label>
				<div class="layui-input-normal">
					<input type="text" name="perms"
						placeholder="多个用逗号分隔，如：user:list,user:create" autocomplete="off"
						class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">排序号<span class="label_span">:</span></label>
				<div class="layui-input-normal">
					<input type="text" name="order_num" placeholder="请输入排序号"
						autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">图标<span class="label_span">:</span></label>
				<div class="layui-input-normal">
					<input type="text" name="icon" placeholder="请输入图标"
						autocomplete="off" class="layui-input">
					<code style="margin-top: 4px; display: block;">获取图标：http://fontawesome.io/icons/</code>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="layui-input-block">

					<button class="layui-btn" lay-submit="" lay-filter="submit"
						data-url="/sys/menu/save">保存</button>
					<button class="layui-btn" onclick="$t.closeWindow();">返回</button>
				</div>
			</div>
		</form>
	</div>
	<script>
		layui.use([ 'form', 'layer' ], function() {
			var form = layui.form();
			//监听单选
			form.on('radio(menuType)', function(data) {
				if (data.value == 0) {
					$(".layui-form-item").show();
					$("[name='url']").parent().parent().hide();
					$("[name='perms']").parent().parent().hide();
					form.render();
					return false;
				}
				if (data.value == 1) {
					$(".layui-form-item").show();
					form.render();
					return false;
				}
				if (data.value == 2) {
					$(".layui-form-item").show();
					$("[name='url']").parent().parent().hide();
					$("[name='order_num']").parent().parent().hide();
					$("[name='icon']").parent().parent().hide();
					form.render();
					return false;
				}
			});

		});
	</script>
</body>
</html>
