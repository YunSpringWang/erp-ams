<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--
* 修改页面
* @author chenyi
* @email 228112142@QQ.com
* @date 2017-06-27 10:40:56
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    
</head>
<body>
<div class="layui-field-box">
    <form class="layui-form" action="">
        <input type="hidden" name="userId" value="${model.userId}">
        <div class="layui-form-item">
            <label class="layui-form-label">用户名<span class="span_must">*</span></label>

            <label class="layui-label-right">${model.username}</label>

        </div>
        <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">密码<span class="label_span">:</span></label>--%>
            <%--<div class="layui-input-normal">--%>
                <%--<input type="password" name="password" value="" placeholder="请输入密码" autocomplete="off"--%>
                       <%--class="layui-input">--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-form-item">
            <label class="layui-form-label">邮箱<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="email" value="${model.email}" lay-verify="email" placeholder="请输入邮箱"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">手机号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="mobile" value="${model.mobile}" lay-verify="phone" placeholder="请输入手机号"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">所属部门</label>
            <div class="layui-input-normal">

                <input value="${model.orgId}" id="demo"
                       cyType="treeTool" cyProps="url:'/organize/select',name:'orgId'"
                       placeholder="请选择所属部门" class="layui-input"/>

            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">角色</label>
            <div cyType="selectTool" cyProps="url:'/sys/role/findAll',filter:'role'" name="roleIdList[]"
                 value="${model.roleId}" lay-verify="required"
                 class="layui-input-normal"></div>
        </div>
        <div id="orderPowerType">
            <c:if test="${model.roleId==2}">
                <div class="layui-form-item">
                    <label class="layui-form-label">订单权限类型</label>
                    <div cyType="selectTool" cyProps="enumName:'OrderPowerTypeEnum',filter:'orderPowerType'"
                         name="orderPowerType" value="${model.orderPowerType}" class="layui-input-normal"></div>
                </div>
            </c:if>
        </div>
        <div id="orderArea">
            <c:if test="${model.roleId==2 and model.orderPowerType==1}">
                <div class="layui-form-item"> <label class="layui-form-label">地区</label>
                    <div cyType="selectTool" cyProps="enumName:'ProvinceEnum',multiple:'true',allBtn:'true'"
                    value="${model.orderArea}" name="orderAreaArr" class="layui-input-block"></div> </div>
            </c:if>
        </div>

        <div class="page-footer">
            <div class="btn-list">
                <div class="btnlist">
                    <button class="layui-btn" lay-submit="" lay-filter="submit" data-url="/sys/user/update"><i
                            class="fa fa-floppy-o">&nbsp;</i>保存
                    </button>
                    <button class="layui-btn" onclick="$t.closeWindow();"><i class="fa fa-undo">&nbsp;</i>返回</button>
                </div>
            </div>
        </div>
    </form>
</div>
<script>

    layui.use(['form'], function () {
        var form = layui.form();
        form.on('select(role)', function (data) {
            $("#orderPowerType").html('');
            $("#orderArea").html('');
            //如果是信息录入员
            if (data.value == '2') {
                $("#orderPowerType").html(' <div class="layui-form-item" > ' +
                    '<label class="layui-form-label">订单权限类型</label> ' +
                    '<div cyType="selectTool" cyProps="enumName:\'OrderPowerTypeEnum\',filter:\'orderPowerType\'"' +
                    ' name="orderPowerType" value="" class="layui-input-normal"></div> </div>');

                var selects = $("#orderPowerType [cyType='selectTool']");
                for (var i = 0; i < selects.length; i++) {
                    $(selects[i]).selectTool();
                }
                form.render('select');
            }

        });

        form.on('select(orderPowerType)', function (data) {
            $("#orderArea").html('');
            //如果是信息录入员
            if (data.value == '1') {
                $("#orderArea").html(' <div class="layui-form-item"> <label class="layui-form-label">地区</label> ' +
                    '<div cyType="selectTool" cyProps="enumName:\'ProvinceEnum\',multiple:\'true\',allBtn:\'true\'" ' +
                    'value="" name="orderAreaArr" class="layui-input-block"></div> </div>');

                var selects = $("#orderArea [cyType='selectTool']");
                for (var i = 0; i < selects.length; i++) {
                    $(selects[i]).selectTool();
                }
                form.render();
            }

        });
    });
</script>
</body>
</html>
