layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element'], function(){
  var laydate = layui.laydate //日期
  ,laypage = layui.laypage //分页
  layer = layui.layer //弹层
  ,table = layui.table //表格
  ,carousel = layui.carousel //轮播
  ,upload = layui.upload //上传
  ,element = layui.element; //元素操作
  
  //执行一个 table 实例
  table.render({
    elem: '#idTest'
    ,url:'json/demo1.json'//数据接口
    ,cols: [[//表头
      {type:'numbers',fixed:'left'}
      ,{type:'checkbox', fixed: 'left',align:'center'}
      ,{field:'id', width:80, title: 'ID', sort: true, fixed: 'left'}
      ,{field:'username', width:80, title: '用户名'}
      ,{field:'email', width:80, title: '邮箱'}
      ,{field:'sex', width:80, title: '性别', sort: true}
      ,{field:'city', width:80, title: '城市'}
      ,{field:'sign',width:200, title: '签名'}
      ,{field:'experience', width:80, title: '积分', sort: true}
      ,{field:'ip', width:80, title: 'IP', sort: true}
      ,{field:'logins', width:80, title: '登录次数'}
      ,{field:'joinTime', width:135, title: '加入时间', sort: true}
      ,{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}
    ]]
    ,page: { //详细参数可参考 laypage 组件文档
      //curr: 5//设定初始在第 5 页
      groups: 3//只显示 1 个连续页码
      ,first: true//不显示首页
      ,last: true//不显示尾页
      ,layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
      }
    ,height: 300
    ,cellMinWidth: 80
    ,skin: 'row' //表格风格
    ,even: true
    //,size: 'lg' //尺寸
    ,limits: [2,5,10]
    ,limit: 2 //每页默认显示的数量
    //,loading: false //请求数据时，是否显示loading  
  });
  //监听表格复选框选择
  table.on('checkbox(demo)', function(obj){
    console.log(obj)
  });
  //监听工具条
  table.on('tool(demo)', function(obj){
    var data = obj.data;
    if(obj.event === 'detail'){
      layer.msg('ID：'+ data.id + ' 的查看操作');
    } else if(obj.event === 'del'){
      layer.confirm('真的删除行么', function(index){
        obj.del();
        layer.close(index);
      });
    } else if(obj.event === 'edit'){
      layer.alert('编辑行：<br>'+ JSON.stringify(data))
    }
  });
  
  var $ = layui.$, active = {
    getCheckData: function(){ //获取选中数据
      var checkStatus = table.checkStatus('idTest')
      ,data = checkStatus.data;
      layer.alert(JSON.stringify(data));
    }
    ,getCheckLength: function(){ //获取选中数目
      var checkStatus = table.checkStatus('idTest')
      ,data = checkStatus.data;
      layer.msg('选中了：'+ data.length + ' 个');
    }
    ,isAll: function(){ //验证是否全选
      var checkStatus = table.checkStatus('idTest');
      layer.msg(checkStatus.isAll ? '全选': '未全选')
    }
  };
  
  $('.demoTable .layui-btn').on('click', function(){
    var type = $(this).data('type');
    active[type] ? active[type].call(this) : '';
  });
});