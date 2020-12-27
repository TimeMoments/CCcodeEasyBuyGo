<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>订单列表</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="assets/css/admin.css">
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/app.js"></script>
</head>
<body>
<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->






</head>

<body>
<header class="am-topbar admin-header">
  <div class="am-topbar-brand"><img src="assets/i/logo.png"></div>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">
 <li class="kuanjie">
 	<a href="#">个人中心</a> 
 </li>

 <li class="soso">
 	
<p>   
	
	<select data-am-selected="{btnWidth: 70, btnSize: 'sm', btnStyle: 'default'}">
          <option value="b">全部</option>
          <option value="o">产品</option>
        </select>

</p>

<p class="ycfg"><input type="text" class="am-form-field am-input-sm" placeholder="圣诞快乐!" /></p>
<p><button class="am-btn am-btn-xs am-btn-default am-xiao"><i class="am-icon-search"></i></button></p>
 </li>




      <li class="am-hide-sm-only" style="float: right;"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main"> 

<div class="nav-navicon admin-main admin-sidebar">
    
    
    <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：清风抚雪</div>
    <div class="sideMenu">
      <div class="sideMenu">
      <h3 class="am-icon-flag"><em></em> <a href="#">商品管理</a></h3>
      <ul>
        <li><a href="<%=request.getContextPath()%>/jsps/manager/commodity/shangdian/commodity_list.jsp">商品列表</a></li>
        <li><a href="<%=request.getContextPath()%>/jsps/manager/commodity/shangdian/pinglun.jsp">用户评论</li>
      
      </ul>
      <h3 class="am-icon-cart-plus"><em></em> <a href="#"> 订单管理</a></h3>
      <ul>
      <li><a href="<%=request.getContextPath()%>/jsps/manager/commodity/shangdian/dingdan.jsp">订单列表</a></li>
      </ul>
    
      <h3 class="am-icon-volume-up"><em></em> <a href="#">信息通知</a></h3>
      <ul>
        <li><a href="<%=request.getContextPath()%>/jsps/manager/commodity/shangdian/xinxi.jsp">站内消息 /留言</a></li>
        <li><a href="<%=request.getContextPath()%>/jsps/manager/commodity/shangdian/xinxi.jsp">邮件</a></li>
          <li><a href="<%=request.getContextPath()%>/jsps/manager/commodity/shangdian/xinxi.jsp">反馈</a></li>
      </ul>
      <h3 class="am-icon-gears"><em></em> <a href="#">系统设置</a></h3>
      <ul>
      <li><a href="<%=request.getContextPath()%>/jsps/manager/commodity/shangdian/shezhi.jsp">数据备份</a></li>
      <li><a href="<%=request.getContextPath()%>/jsps/manager/commodity/shangdian/shezhi.jsp">邮件管理</a></li>
     <li><a href="<%=request.getContextPath()%>/jsps/manager/commodity/shangdian/shezhi.jsp">权限</a></li>
      <li><a href="<%=request.getContextPath()%>/jsps/manager/commodity/shangdian/shezhi.jsp">网络设置</a></li>
      </ul>
    </div>
    <!-- sideMenu End --> 
    
    <script type="text/javascript">
			jQuery(".sideMenu").slide({
				titCell:"h3", //鼠标触发对象
				targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
				effect:"slideDown", //targetCell下拉效果
				delayTime:300 , //效果时间
				triggerTime:150, //鼠标延迟触发时间（默认150）
				defaultPlay:true,//默认是否执行效果（默认true）
				returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）
				});
		</script> 

    
    
    
    
    
    
    
</div>

<div class=" admin-content">
	
		<div class="daohang">
		
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs"> 
					<ul>
				<li><button type="button"class="am-btn am-btn-default am-radius am-btn-xs"></li>
					<a href="<%=request.getContextPath()%>/manager.do?method=query">
                  <input type=button value="首页" >
                      </a>
			</ul>
</div>
    </div>
</div>
	


<div class="admin-biaogelist">
	
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 订单列表</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">订单列表</a></dl>
      
      <dl>
        <button type="button" class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus" > 补充线订单</button>
      </dl>
      <!--这里打开的是新页面-->
    </div>
    


    <form class="am-form am-g">
          <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover">
            <thead>
              <tr class="am-success">
                <th class="table-check"><input type="checkbox" /></th>

                <th class="table-id">ID</th>
                <th class="table-title">商品名称</th>
                <th class="table-type">购买数量</th>
                <th class="table-author am-hide-sm-only">购买人</th>
                <th class="table-author am-hide-sm-only">地址</th>
                <th class="table-date am-hide-sm-only">购买日期</th>
                <th width="130px" class="table-set">操作</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td><input type="checkbox" /></td>
                
                <td>14</td>
                <td><a href="#">Business management</a></td>
                <td>3件 （消费455个积分）</td>
                <td class="am-hide-sm-only">访问</td><td class="am-hide-sm-only">访问</td>
                <td class="am-hide-sm-only">2014年9月4日 7:28:47</td>
                <td>
                	
                	
                      	
                	<div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
           <a href="#"> 查看</a>&nbsp;&nbsp;
                          <a href="#"> 编辑</a>
                    </div>
                  </div>
                	
                	
                	
                	
                	
                	
                </td>
              </tr>
              <tr>
                <td><input type="checkbox" /></td>
                
                <td>15</td>
                <td><a href="#">Business management</a></td>
                <td>default</td>
                <td class="am-hide-sm-only"><i class="am-icon-close am-text-primary"></i></td><td class="am-hide-sm-only">访问</td>
                <td class="am-hide-sm-only">2014年9月4日 7:28:47</td>
                <td>
                	
                	<div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                       <a href="#">查看</a>&nbsp;&nbsp;
                          <a href="#"> 编辑</a></span></button>
                    </div>
                  </div>
                
                </td>
              </tr>
            </tbody>
          </table>
          
                 <div class="am-btn-group am-btn-group-xs">
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 删除</button>
             
            </div>
        
          <hr />
    
        </form>
 
 
 
 
 <div class="foods">
  <ul>
    版权所有@2020
  </ul>
  <dl>
    <a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a>
  </dl>
</div>




</div>

</div>




</div>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]--> 

<!--[if (gte IE 9)|!(IE)]><!--> 
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->



</body>
</html>