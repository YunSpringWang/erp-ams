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
            <label class="layui-form-label">角色名称<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="roleName" value=""  maxlength="10"  lay-verify="required" placeholder="请输入角色名称" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">角色编码<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" value=""   maxlength="10" lay-verify="required" placeholder="请输入备注" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">授权<span class="label_span">:</span></label>
            <div class="layui-input-normal">
                <ul id="menuTree" class="ztree"></ul>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">

                <button class="layui-btn" lay-submit="" lay-filter="roleSubmit" >保存</button>
                <button class="layui-btn" onclick="$t.closeWindow();"> 返回</button>
            </div>
        </div>
    </form>
</div>
<script>
    layui.use(['form', 'layer'], function () {
        var form = layui.form();
        var layer = layui.layer;
        //监听提交
        form.on('submit(roleSubmit)', function (data) {
            //获取选择的菜单
            var nodes = ztree.getCheckedNodes(true);
            var menuIdList = new Array();
            for(var i=0; i<nodes.length; i++) {
                menuIdList.push(nodes[i].id);
            }
            //向form表单中添加选中的菜单
            data.field.menuIdList=menuIdList;
            var url = "/sys/role/save";
            $.ajax({
                //url: "/sys/menu/list",
                type: "post",
                url: url,
                contentType: "application/json",
                data: JSON.stringify(data.field),
                async: false,
                dataType: "json",
                success: function (R) {
                    //layer.closeAll(2);
                    if (R.code === 0) {
                        Msg.success("操作成功");
                        $t.Refresh();

                    } else {
                        alert(R.msg);
                    }
                },
                error: function () {
                    alert("系统错误");
                }
            });
            return false;
        });
    });
    /*下拉树*/
    var setting = {
        data: {
            simpleData: {
                enable: true,
                idKey: "id",
                pIdKey: "pId",
                rootPId: -1
            },
            key: {
                url:"nourl"
            }
        },
        check:{
            enable:true,
            nocheckInherit:true
        }
    };
    var ztree;
    //加载菜单树
    $.ajax({
        //url: "/sys/menu/list",
        type: "post",
        url:'/sys/menu//treePerms',
        contentType: "application/json",
        async: false,
        dataType: "json",
        success: function (R) {
            if (R.code === 0) {
                ztree = $.fn.zTree.init($("#menuTree"), setting, R.data);
                //展开所有节点
                ztree.expandAll(true);
            } else {
                alert(R.msg);
            }
        },
        error: function () {
            alert("系统错误");
        }
    });
</script>
</body>
</html>
