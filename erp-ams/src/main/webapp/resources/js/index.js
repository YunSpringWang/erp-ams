layui.use(['layer', 'element', 'util','jquery'], function () {
    var element = layui.element;
    var layer = layui.layer; 
    var $ = layui.jquery;
    var util = layui.util; //导航的hover效果、二级菜单等功能，需要依赖element模块
    var side = $('.my-side');
    var form = layui.form;
  //iframe自适应
    $(window).on('resize',function() {
        var $obj = $('#tabContent');
        $obj.height($(this).height() - 187);
        $obj.find('iframe').each(function() {
            $(this).height($obj.height());
            $(this).width($obj.width());
        });
    }).resize(); 

   //iframe自适应  
    function resize() {
        var $content = $('#tabContent');
        $content.height($(this).height() - 187);
        $content.find('iframe').each(function() {
            $(this).height($content.height());
            $(this).width($content.width());
        });
    }
  
    // 监听导航(side)点击切换页面
    element.on('nav(nav-side)', function (elem) {
        // 添加tab方法
        addTab(element,elem);
    });

    // 监听顶部左侧导航

    // 监听顶部右侧导航
    element.on('nav(side-right)', function (elem) {
        // 修改skin
      var $that = $(this);
      var skin = $that.children('a').data('skin');
      switchSkin(skin);
    });
    // 添加TAB选项卡
    function addTab(element,elem){
        var card    = 'tab-card';                               // 选项卡对象
        var title   = elem.children('a').html();                // 导航栏text
        var src     = elem.children('a').attr('href-url');      // 导航栏跳转URL
        var id      = new Date().getTime();                     // ID
        var flag    = getTitleId(card, title);                  // 是否有该选项卡存在
        // 大于0就是有该选项卡了
        if(flag > 0){
            id = flag;
        }else{
            if(src){
                //新增
                element.tabAdd(card, {
                    title: '<span>'+title+'</span>'
                    ,content: '<iframe src="' + src + '" frameborder="0"></iframe>'
                    ,id: id
                });
                // 关闭弹窗
                layer.closeAll();
            }
        }
        // 切换相应的ID tab
        element.tabChange(card, id);
        resize();
        // 提示信息
        layer.msg(title);
    }
    // 根据导航栏text获取lay-id
    function getTitleId(card,title){
        var id = -1;
        $(document).find(".layui-tab[lay-filter=" + card + "] ul li").each(function(){
            if(title === $(this).find('span').html()){
                id = $(this).attr('lay-id');
            }
        });
        return id;
    }
            //信息弹窗
             layer.open({
                      type: 1,
                      //基本层类型
                      anim: 2,
                      //弹出动画(从最底部往上滑入)
                      skin: "layui-layer-rim",
                      //样式类名
                      area: ["300px", "200px"],
                      //宽高
                      offset: "rb",
                      //坐标
                      content: '<div style="text-align:center; margin-top: 60px;"><i class="layui-icon">&#xe60b;</i> 您有新88888888888的订单</div>',
                      shade: 0 //遮罩
                    });
 //全屏
     $('.admin-side-full').on('click', function () {
        console.info("hahhahhhhh")
        var docElm = document.documentElement;
        //W3C  
        if (docElm.requestFullscreen) {
            docElm.requestFullscreen();
        }
        //FireFox  
        else if (docElm.mozRequestFullScreen) {
            docElm.mozRequestFullScreen();
        }
        //Chrome等  
        else if (docElm.webkitRequestFullScreen) {
            docElm.webkitRequestFullScreen();
        }
        //IE11
        else if (elem.msRequestFullscreen) {
            elem.msRequestFullscreen();
        }
       layer.msg('按Esc即可退出全屏');
    });
 
//收缩左侧菜单
            $('.kits-ide-fold').off('click').on('click', function() {
                if (_side.hasClass('my-sided')) {
                    _side.removeClass('kit-sided');
                    _doc.find('div.layui-body').removeClass('kit-body-folded');
                    _doc.find('div.layui-footer').removeClass('kit-footer-folded');
                } else {
                    _side.addClass('my-sided');
                    _doc.find('div.layui-body').addClass('kit-body-folded');
                    _doc.find('div.layui-footer').addClass('kit-footer-folded');
                }
            });

    // 皮肤
                var setSkin = function(value) {
                    layui.data('kit_skin', {
                        key: 'skin',
                        value: value
                    });
                },
                getSkinName = function() {
                    return layui.data('kit_skin').skin;
                },
                switchSkin = function(value) {
                    var _target = $('link[kit-skin]')[0];
                    _target.href = _target.href.substring(0, _target.href.lastIndexOf('/') + 1) + value + _target.href.substring(_target.href.lastIndexOf('.'));
                    setSkin(value);
                },
                initSkin = function() {
                    var skin = getSkinName();
                    switchSkin(skin === undefined ? 'default' : skin);
                }();

    //时间
function data(){
    var d=new Date(),str='';
    str +=d.getFullYear()+'年'; //获取当前年份
    str +=d.getMonth()+1+'月'; //获取当前月份（0——11）
    str +=d.getDate()+'日';
    return str;
}
function week(){
    var arr = new Array("日", "一", "二", "三", "四", "五", "六");
    var week = new Date().getDay();
    return "星期" + arr[week];
}

function time(){
    var d=new Date();
    var hours=d.getHours();
    var minutes = d.getMinutes()>9?d.getMinutes().toString():'0' + d.getMinutes();
    var seconds = d.getSeconds()>9?d.getSeconds().toString():'0' + d.getSeconds();
    var str = hours + ':' + minutes + ':' + seconds;
    return str;
}

setInterval(function(){
    $("#nowTime").children(".data").html(data());
    $("#nowTime").children(".week").html(week());
    $("#nowTime").children(".time").html(time());
},1000);


});


