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
            <label class="layui-form-label">参数名<span class="span_must">&nbsp;*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="code" maxlength="30"   lay-verify="required" placeholder="请输入参数名"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">参数值<span class="span_must">&nbsp;*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="value" maxlength="300"   lay-verify="required" placeholder="请输入参数值"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">状态<span class="span_must">&nbsp;*</span></label>
            <div class="layui-input-normal">
                <div cyType="radioTool" cyProps="codeName:'state'" name="status"
                     value="1" class="layui-input-inline"></div>
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">&nbsp;*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark"  maxlength="300" lay-verify="required" placeholder="备注"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="submit">保存</button>
                <button class="layui-btn" onclick="$t.closeWindow();"> 返回</button>
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
                url: "/sys/config/save",
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
