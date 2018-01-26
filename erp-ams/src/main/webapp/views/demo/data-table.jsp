<html>
    <head>
        <meta charset="UTF-8">
        <title>
            首页
        </title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
        <link rel="stylesheet" href="../../resources/plugins/layui/css/layui.css">
        <link rel="stylesheet" type="text/css" href="../../resources/css/table.css">
    </head>
    <body>
        <div class="tab-body">
            <div class="handle-box">
                <ul>
                    <li class="handle-item">
                        <span class="layui-form-label">
                            输入用户名：
                        </span>
                        <div class="layui-input-inline">
                            <input type="text" autocomplete="off" placeholder="请输入搜索条件" class="layui-input">
                        </div>
                        <button class="layui-btn mgl-20">
                            查询
                        </button>
                        <button class="layui-btn mgl-20" id="refresh">
                            刷新
                        </button>
                        <span class="fr">
                            <a class="layui-btn layui-btn-danger radius btn-delect" id="btn-delect-all">
                                <i class="linyer icon-delect">
                                </i>
                                批量删除
                            </a>
                            <a class="layui-btn btn-add btn-default" id="btn-adduser">
                                <i class="linyer icon-add">
                                </i>
                                添加用户
                            </a>
                        </span>
                    </li>
                </ul>
            </div>
            <div class="layui-clear">
                <div class="tableTools fr">
                    <div class="tableTools-box">
                        <a class="dt-button buttons-collection buttons-colvis layui-btn table-tool"
                        tabindex="0" aria-controls="userTable">
                            <span>
                                <i class="linyer icon-search">
                                </i>
                                <span class="hidden">
                                    显示/隐藏列
                                </span>
                            </span>
                        </a>
                        <a class="dt-button buttons-copy buttons-html5 layui-btn table-tool" tabindex="0"
                        aria-controls="userTable">
                            <span>
                                <i class="linyer icon-copy">
                                </i>
                                <span class="hidden">
                                    复制到剪贴板
                                </span>
                            </span>
                        </a>
                        <a class="dt-button buttons-csv buttons-html5 layui-btn table-tool" tabindex="0"
                        aria-controls="userTable">
                            <span>
                                <i class="linyer icon-exports">
                                </i>
                                <span class="hidden">
                                    导出csv
                                </span>
                            </span>
                        </a>
                        <a class="dt-button buttons-print layui-btn table-tool" tabindex="0" aria-controls="userTable">
                            <span>
                                <i class="linyer icon-print">
                                </i>
                                <span class="hidden">
                                    打印
                                </span>
                            </span>
                        </a>
                    </div>
                </div>
            </div>
           <!-- <div class="layui-btn-group demoTable">
  <button class="layui-btn" data-type="getCheckData">获取选中行数据</button>
  <button class="layui-btn" data-type="getCheckLength">获取选中数目</button>
  <button class="layui-btn" data-type="isAll">验证是否全选</button>
</div>
-->
            <table class="layui-hide" id="idTest" lay-filter="demo"></table>
            <script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
        </div>
        <script src="../../resources/plugins/layui/layui.js"></script>
        <script src="../../resources/js/user.js"></script>
        <ul class="layui-fixbar"><li class="layui-icon layui-fixbar-top" lay-type="top" style="display: list-item;"></li></ul>
    </body>
</html>