<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%><%String path = request.getContextPath();String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<base href="<%=basePath%>">
    <link rel="stylesheet" href="../../resources/plugins/layui/css/layui.css">
<link rel="stylesheet" href="../../resources/css/login.css" />
    <script src="../../resources/plugins/layui/layui.js"></script>
<script type="text/javascript">
    layui.use([ 'layer', 'form' ], function() {
        var layer = layui.layer;
        var $ = layui.jquery;
        var form = layui.form;
        form.on('submit(submitlogin)',function(data) {
            /*  layer.alert(JSON.stringify(data.field), {
                  title: '最终的提交信息'
                }); */
            // data.afield.password = $.md5(data.field.password);
                $(".btn-submit").html("正在登录...");
                $(".btn-submit").attr('disabled', true).addClass('layui-disabled');
                $.ajax({
                    url: "userLoginController/login",
                    data: data.field,
                    type: "post",
                    dataType: "json",
                    success: function (result) {
                        console.log(result);
                        console.log(result.status);
                        console.log(result.info);

                        if (result.status == 1) {
                            window.location.href = "<%=basePath%>indexController/toIndex";
                            $(".btn-submit").html("登录成功，跳转中...");
                        } else {
                            $(".btn-submit").html("立即登录");
                            $(".btn-submit").attr('disabled', false).removeClass('layui-disabled');
                            $("#verifyCode").trigger('click');
                            //$.layerMsg(result.info, result.status);
                        }
                    },
                    error: function(XMLHttpRequest, textStatus, errorThrown) {
                        alert(XMLHttpRequest.status);
                        alert(XMLHttpRequest.readyState);
                        alert(textStatus);
                    },
                    complete: function(XMLHttpRequest, textStatus) {
                        this; // 调用本次AJAX请求时传递的options参数
                    }
                });
                return false;
    
            
        });
        $("#verifyCode").click(function() {
            $(this).attr("src", "<%=basePath%>verificationCode/VerifyCode?r=" + Math.random());
            return false;
        });
        
        $(".btn-reg").click(function() {
            //layer.msg('这是最常用的吧');

            location.href = 'userLoginController/toRegPage';
            return false;
            
            })
    });
</script>
</head>

<body>
    <div class="beg-login-box">
        <header>
        <h1>后台登录</h1>
        </header>
        <div class="beg-login-main">
            <form class="layui-form">
                <div class="layui-form-item">
                    <label class="login-icon"><i class="layui-icon">&#xe612;</i></label>
                    <input type="text" name="wLoginAccount" lay-verify="required|loginName"
                        autocomplete="off" placeholder="账号/已认证邮箱" class="layui-input">
                </div>
                <div class="layui-form-item">
                    <label class="login-icon"> <i class="layui-icon">&#xe642;</i>
                    </label> <input type="password" name="wLoginPassword" lay-verify="required|password"
                        autocomplete="off" placeholder="登陆密码" class="layui-input">
                </div>

                <div class="layui-form-item">
                    <div class="beg-login-code-box">
                        <label class="login-icon"><i class="layui-icon">&#xe62d;</i></label>
                        <input type="text" name="verifycode" lay-verify="required"
                            autocomplete="off" placeholder="验证码" class="layui-input">
                        <img id="verifyCode" src="verificationCode/VerifyCode"
                            title="点击更换验证码">
                    </div>
                </div>
                <div class="layui-form-item">
                    <div class="beg-pull-left beg-login-remember">
                        <label>记住帐号？</label> <input type="checkbox" name="rememberMe"
                            value="true" lay-skin="switch" checked title="记住帐号">
                    </div>
                    <div class="beg-pull-right beg-login-forget">
                        <p>
                            <a href="javascript:;" class="fr">忘记密码？</a>
                        </p>
                    </div>
                </div>
                <div class="layui-form-item">
                    <button class="layui-btn btn-submit" lay-submit=""  lay-filter="submitlogin">立即登录</button>
                </div>
                <div class="layui-form-item">
                    <button class="layui-btn btn-reg" lay-filter="toRegPage">立即注册</button>
                </div>
            </form>
            <footer>
            <p>Beginner © Spring.Wang</p>
            </footer>
        </div>


    </div>

</body>

</html>