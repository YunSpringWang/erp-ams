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
<body>
<div class="layui-field-box">
    <form class="layui-form" action="">
        <div class="layui-form-item">
            <label class="layui-form-label">地区名称<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="areaName" lay-verify="required" placeholder="请输入地区名称" maxlength="50" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">地区行政编码<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="xzCode" lay-verify="number" placeholder="请输入地区行政编码" maxlength="8" class="layui-input">
            </div>
        </div>
        <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">行政级别</label>--%>
            <%--<div class="layui-input-normal">--%>
                <%--<div cyType="selectTool" cyProps="codeName:'areaLevel'" name="areaLevel"  class="layui-input-inline"></div>--%>
            <%--</div>--%>
        <%--</div>--%>

        <div class="layui-form-item">
            <label class="layui-form-label">上级地区<span class="span_must">*</span></label>
            <div class="layui-input-inline" style="width:700px;">
                <div cyType="selectTool" cyProps="url:'/area/normalList/0000000000',filter:'area'" name="parentAreaIds[]" value="" lay-verify="required"
                 class="layui-input-inline"></div>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">状态<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <div cyType="radioTool" cyProps="codeName:'state'" name="state"
                     value="1" class="layui-input-inline"></div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="submit" data-url="/area/save">保存</button>
                <button  class="layui-btn" onclick="$t.closeWindow();"> 返回</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>