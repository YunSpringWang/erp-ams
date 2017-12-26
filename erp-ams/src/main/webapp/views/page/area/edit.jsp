<!--
* 修改页面
* @author chenyi
* @email qq228112142@qq.com
* @date 2017-08-10 16:00:04
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="layui-field-box">
    <form class="layui-form" action="">
        <input type="hidden" name="areaId" value="${model.areaId}">
        <div class="layui-form-item">
            <label class="layui-form-label">地区名称<span class="span_must">&nbsp;*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="areaName" value="${model.areaName}" lay-verify="required" placeholder="请输入地区名称" maxlength="50" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">地区行政编码<span class="span_must">&nbsp;*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="xzCode" lay-verify="number" value="${model.xzCode}" placeholder="请输入地区行政编码" maxlength="8" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">状态<span class="span_must">&nbsp;*</span></label>
            <div class="layui-input-normal">
                <div cyType="radioTool" cyProps="codeName:'state'" name="state"
                     value="${model.state}" class="layui-input-inline"></div>
            </div>
        </div>
        <%--<div class="layui-form-item">--%>
        <%--<label class="layui-form-label">行政级别</label>--%>
        <%--<div class="layui-input-normal">--%>
        <%--<div cyType="selectTool" cyProps="codeName:'areaLevel'" name="areaLevel"  class="layui-input-inline"></div>--%>
        <%--</div>--%>
        <%--</div>--%>

        <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">上级地区</label>--%>
            <%--<div class="layui-input-inline" style="width:700px;">--%>
                <%--<div cyType="selectTool" cyProps="url:'/area/normalList/0000000000',filter:'area'" name="parentAreaIds[]" value="" lay-verify="required"--%>
                     <%--class="layui-input-inline"></div>--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="submit" data-url="/area/update">保存</button>
                <button  class="layui-btn" onclick="$t.closeWindow();"> 返回</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>
