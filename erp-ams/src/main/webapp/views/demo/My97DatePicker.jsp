<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>
        日期控件示例
    </title>
    <link rel="stylesheet" href="../../resources/plugins/layui/css/layui.css">
    <script src="../../resources/plugins/layui/layui.js"></script>
    <!-- 引入日期控件-->
    <script type="text/javascript" src="../../resources/plugins/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>默认修饰</legend>
        </fieldset>
         <div class="layui-form-item">
                <div class="layui-inline">
                  <label class="layui-form-label">示例</label>
                  <div class="layui-input-block">
                    <input type="text" onFocus="WdatePicker({lang:'zh-cn',dateFmt:'yyyyMMdd HH:mm:ss'})" class="layui-input">
                    <pre class="layui-code">显示年月日时分秒：dateFmt:'yyyyMMdd HH:mm:ss' 
格式化:年月日时分秒：dateFmt:'yyyy年MM月dd日 HH时:mm分:ss秒'
隐藏清空按钮：isShowClear:false
设置今天为最小日期：minDate:new Date()
设置今天为最大日期：maxDate:new Date()
在输入框input元素上加入 onFocus="WdatePicker({lang:'zh-cn' ,dateFmt:'yyyyMM'})"
<input type="text" onFocus="WdatePicker({lang:'zh-cn',dateFmt:'yyyyMMdd HH:mm:ss'})" class="layui-input">

                    </pre>
                  </div>
                </div>
         </div>      
<script>
 layui.use(['form', 'laydate','code'], function(){
  var laydate = layui.laydate;
  var form = layui.form;
  var code =layui.code;
  //日期
  laydate.render({
    elem: '#date'
  });
  layui.code({
  title: '显示html'
  ,skin: 'notepad' //如果要默认风格，不用设定该key。
  , encode: true //是否转义html标签。默认不开启
});
});
</script>
</body>
</html>