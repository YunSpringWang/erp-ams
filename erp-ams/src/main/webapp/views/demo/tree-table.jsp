<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title></title>
     <link rel="stylesheet" href="../../resources/plugins/layui/css/layui.css">
    <script type="text/javascript" src="../../resources/plugins/layui/layui.js"></script>
        <link rel="stylesheet" href="../../resources/css/table.css">

</head>
<body class="body">

<fieldset class="layui-elem-field layui-field-title">
    <legend>
        <span class="layui-breadcrumb">
            <a href="javascript:;">扩展</a>
            <a><cite>tree table</cite></a>
        </span>
    </legend>
</fieldset>

<!-- tree table -->
<div class="my-tree-table-box">
    <!-- tree -->
    <ul id="tree" class="tree-table-tree-box">
    </ul><div class="tree-table-table-box">
        <div class="my-btn-box">
            <span class="fl">
                <a class="layui-btn layui-btn-danger" id="btn-delete-all">批量删除</a>
                <a class="layui-btn btn-default btn-add" id="btn-add-article">发布文章</a>
            </span>
            <span class="fr">
                <span class="layui-form-label">搜索条件：</span>
                <div class="layui-input-inline">
                    <input type="text" autocomplete="off" placeholder="请输入搜索条件" class="layui-input">
                </div>
                <button class="layui-btn mgl-20">查询</button>
            </span>
        </div>
        <!-- table -->
        <table id="dateTable" class="layui-table">
            <thead>
            <tr>
                <th><input type="checkbox" class="my-checkbox" /></th>
                <th>名称</th>
                <th>型号</th>
                <th>规格</th>
                <th>价格</th>
                <th>简介</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="1" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷1</td>
                <td>X1121</td>
                <td>大</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="2" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷2</td>
                <td>X1121</td>
                <td>大</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="3" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷3</td>
                <td>X1121</td>
                <td>大</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="4" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷4</td>
                <td>X1121</td>
                <td>大</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="5" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷5</td>
                <td>X1121</td>
                <td>大</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="6" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷6</td>
                <td>X1121</td>
                <td>大</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="7" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷7</td>
                <td>X1121</td>
                <td>大</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="8" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷8</td>
                <td>X1121</td>
                <td>中</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="9" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷9</td>
                <td>X1121</td>
                <td>大</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="10" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷10</td>
                <td>X1121</td>
                <td>小</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="11" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷11</td>
                <td>X1121</td>
                <td>大</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" class="my-checkbox" data-id="12" /></td>
                <td>心相印红悦卫生纸卷纸3层*12卷12</td>
                <td>X1121</td>
                <td>中</td>
                <td>￥25.5</td>
                <td>心相印红悦卫生纸卷纸3层*12卷</td>
                <td>
                    <button class="layui-btn layui-btn-small">查看</button>
                    <button class="layui-btn layui-btn-small layui-btn-normal">编辑</button>
                    <button class="layui-btn layui-btn-small layui-btn-danger">删除</button>
                </td>
            </tr>
            </tbody>
        </table>
    </div>

</div>


<!-- jQuery -->
<script type="text/javascript" src="../../resources/js/table-tool.js"></script>
<script type="text/javascript" src="http://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://code.jquery.com/jquery-1.10.2.min.js"></script>

<script type="text/javascript">
    layui.use(['tree','element', 'layer'], function() {
        var $ = layui.jquery,element = layui.element,layer = layui.layer;

        // 树        更多操作请查看 http://www.layui.com/demo/tree.html
        layui.tree({
            elem: '#tree' //传入元素选择器
            ,click: function(item){ //点击节点回调
                layer.msg('当前节名称：'+ item.name + '<br>全部参数：'+ JSON.stringify(item));
                console.log(item);
            }
            ,nodes: [{ //节点
                name: '父节点1'
                ,children: [{
                    name: '子节点11'
                    ,children: [{
                        name: '子节点111'
                    }]
                },{
                    name: '子节点12'
                }]
            },{
                name: '父节点2'
                ,children: [{
                    name: '子节点21'
                    ,children: [{
                        name: '子节点211'
                    }]
                }]
            }]
        });

        // 初始化表格
        $('#dateTable').DataTable({
            "dom": '<"top">rt<"bottom"flp><"clear">',
            "autoWidth": false,                     // 自适应宽度
            "stateSave": true,                      // 刷新后保存页数
            "order": [[1, "desc"]],               // 排序
            "searching": false,                     // 本地搜索
            "info": true,                           // 控制是否显示表格左下角的信息
            "stripeClasses": ["odd", "even"],       // 为奇偶行加上样式，兼容不支持CSS伪类的场合
            "aoColumnDefs": [{                      // 指定列不参与排序
                "orderable": false,
                "aTargets": [0, 6]                   // 对应你的表格的列数
            }],
            "pagingType": "simple_numbers",         // 分页样式 simple,simple_numbers,full,full_numbers
            "language": {                           // 国际化
                "url": 'language.json'
            }
        });
        
        // 例:获取ids
        $(document).on('click','#btn-delete-all', function(){
            // getIds(table对象,获取input为id的属性)
            var list = getIds($('#dateTable'),'data-id');
            if(list == null || list == ''){
                layer.msg('未选择');
            }else{
                layer.msg(list);
            }
        });

        // you code ...

    });
</script>
</body>
</html>