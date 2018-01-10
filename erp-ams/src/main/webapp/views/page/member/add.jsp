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
            <label class="layui-form-label">账号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="account" lay-verify="required" placeholder="请输入账号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">姓名<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="name" lay-verify="required" placeholder="请输入姓名" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">电话<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="phone" lay-verify="phone" placeholder="请输入电话" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">邮箱<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="email" lay-verify="email" placeholder="请输入邮箱" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">会员等级<span class="span_must">*</span></label>
            <div cyType="selectTool" cyProps="codeName:'memberLevel',search:'true'" lay-verify="required"
                 name="level" class="layui-input-normal">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">余额<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input maxlength="10" type="text" name="amount" lay-verify="money" placeholder="请输入余额" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">状态<span class="span_must">*</span></label>
            <div cyType="radioTool" cyProps="codeName:'state'" name="state"
                 value="1" class="layui-input-normal"></div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">上级账号<span class="label_span">:</span></label>
            <div class="layui-input-normal">
                <input type="text" name="parentAccount" value="chenyi" lay-verify="required" placeholder="请输入上级账号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="submit">保存</button>
                <button class="layui-btn" onclick="closeWindow()"> 返回</button>
            </div>
        </div>
    </form>
</div>
<script>
    layui.use(['form'], function () {
        var form = layui.form();
        //监听提交
        form.on('submit(submit)', function (data) {
            $.ajax({
                url: "/member/save",
                type: "post",
                contentType: "application/json",
                data: JSON.stringify(data.field),
                async: false,
                dataType: "json",
                success: function (R) {
                    if (R.code === 0) {
                        alert('操作成功', function (index) {
                            closeWindow();
                        });
                    } else {
                        alert(R.msg);
                    }
                },
                error: function () {
                    alert("系统繁忙");
                }
            });
            return false;
        });
    });
</script>
</body>
</html>