<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>商品展示</title>
<link rel="stylesheet" href="../css/bootstrap.min.css">
<link rel="stylesheet" href="../css/bootstrap-select.css">
<link href="../css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Resale Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<!--fonts-->
<link href='http://fonts.useso.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!--//fonts-->	
<!-- js -->
<script type="text/javascript" src="../js/jquery.min.js"></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../js/bootstrap.min.js"></script>
<script src="../js/bootstrap-select.js"></script>
<script>
  $(document).ready(function () {
    var mySelect = $('#first-disabled2');

    $('#special').on('click', function () {
      mySelect.find('option:selected').prop('disabled', true);
      mySelect.selectpicker('refresh');
    });

    $('#special2').on('click', function () {
      mySelect.find('option:disabled').prop('disabled', false);
      mySelect.selectpicker('refresh');
    });

    $('#basic2').selectpicker({
      liveSearch: true,
      maxOptions: 1
    });
  });
</script>
<script type="text/javascript" src="../js/jquery.leanModal.min.js"></script>
<link href="../css/jquery.uls.css" rel="stylesheet"/>
<link href="../css/jquery.uls.grid.css" rel="stylesheet"/>
<link href="../css/jquery.uls.lcd.css" rel="stylesheet"/>
<!-- Source -->
<script src="../js/jquery.uls.data.js"></script>
<script src="../js/jquery.uls.data.utils.js"></script>
<script src="../js/jquery.uls.lcd.js"></script>
<script src="../js/jquery.uls.languagefilter.js"></script>
<script src="../js/jquery.uls.regionfilter.js"></script>
<script src="../js/jquery.uls.core.js"></script>
<script>
			$( document ).ready( function() {
				$( '.uls-trigger' ).uls( {
					onSelect : function( language ) {
						var languageName = $.uls.data.getAutonym( language );
						$( '.uls-trigger' ).text( languageName );
					},
					quickList: ['en', 'hi', 'he', 'ml', 'ta', 'fr'] //FIXME
				} );
			} );
		</script>
		<link rel="stylesheet" href="../css/flexslider.css" media="screen" />
</head>
<body>
<div class="header">
		<div class="container">
			<div class="logo">
				<a href="index.html"><span>轻</span>松购</a>
			</div>
			<div class="header-right">
			<a class="account" href="<%=request.getContextPath()%>/jsps/login/login.jsp">登录</a>
				<a class="account" href="<%=request.getContextPath()%>/jsps/login/register.jsp">注册</a>
			
			</div>
		</div>
		</div>
	
	<div class="banner text-center">
	  <div class="container">    
		  <h1>出售  <span class="segment-heading">在线 </span>转售</h1>
	  	<p>轻松购 要相信光</p>
			<a href="post-ad.html">发布</a>
	  </div>
	</div>
	<!--single-page-->
	<div class="single-page main-grid-border">
		<div class="container">
			<ol class="breadcrumb" style="margin-bottom: 5px;">
				<li><a href="<%=request.getContextPath()%>/index.jsp">首页</a></li>
				<li><a href="<%=request.getContextPath()%>/categories.jsp">导航栏</a></li>
			</ol>
			<div class="product-desc">
				<div class="col-md-7 product-view">
					<h2>商品的具体展示</h2>
					<p> <i class="glyphicon glyphicon-map-marker"></i><a href="#">state</a>, <a href="#">city</a>| Added at 06:55 pm, Ad ID: 987654321</p>
					<div class="flexslider">
						<ul class="slides">
							<li data-thumb="../images/ss1.jpg">
								<img src="../images/ss1.jpg" />
							</li>
							<li data-thumb="../images/ss2.jpg">
								<img src="../images/ss2.jpg" />
							</li>
							<li data-thumb="../images/ss3.jpg">
								<img src="../images/ss3.jpg" />
							</li>
						</ul>
					</div>
					<!-- FlexSlider -->
					  <script defer src="../js/jquery.flexslider.js"></script>
					<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

						<script>
					// Can also be used with $(document).ready()
					$(window).load(function() {
					  $('.flexslider').flexslider({
						animation: "slide",
						controlNav: "thumbnails"
					  });
					});
					</script>
					<!-- //FlexSlider -->
								<% 
								Map map=(Map)request.getAttribute("map_queryone");
								System.out.print(map);
								%>
					<div class="product-details">
						<h4>名称 :<%=map.get("commodity_name")%>asdaa</h4>
						<h4>几成新 :<%=map.get("commodity_degree")%></h4>    
						<h4>上架日期：<%=map.get("commodity_time")%></h4>
						<h4>备注：<%=map.get("commodity_remark")%></h4>
					<a href="#"><h4>加入购物车</h4> </a>
					</div>
					
				</div>
				<div class="col-md-5 product-details-grid">
					<div class="item-price">
						<div class="product-price">
							<p class="p-price">价格</p>
							<h3 class="rate">$ 259</h3>
							<div class="clearfix"></div>
						</div>
						<div class="condition">
							<p class="p-price">交易方式</p>
							<h4>都可以</h4>
							<div class="clearfix"></div>
						</div>
						<div class="itemtype">
							<p class="p-price">类型</p>
							<h4>Phone</h4>
							<div class="clearfix"></div>
						</div>
					</div>
					<div class="interested text-center">
						<h4>对这个感兴趣吗?</h4><br><br>
						<h4><a href="#">联系卖家</a></h4>
					</div>
						<div class="tips">
						<h4>买家安全须知</h4>
							<ol>
								<li><a href="#">由于显示器、拍照和做图的过程中，产品可能发生颜色细微偏差！颜色以实物为准！</a></li>
								<li><a href="#">由于显示器、拍照和做图的过程中，产品可能发生颜色细微偏差！颜色以实物为准！</a></li>
								<li><a href="#">由于显示器、拍照和做图的过程中，产品可能发生颜色细微偏差！颜色以实物为准！</a></li>
								<li><a href="#">由于显示器、拍照和做图的过程中，产品可能发生颜色细微偏差！颜色以实物为准！</a></li>
								<li><a href="#">由于显示器、拍照和做图的过程中，产品可能发生颜色细微偏差！颜色以实物为准！</a></li>
								<li><a href="#">由于显示器、拍照和做图的过程中，产品可能发生颜色细微偏差！颜色以实物为准！</a></li>
								<li><a href="#">由于显示器、拍照和做图的过程中，产品可能发生颜色细微偏差！颜色以实物为准！</a></li>
								<li><a href="#">由于显示器、拍照和做图的过程中，产品可能发生颜色细微偏差！颜色以实物为准！</a></li>
								<li><a href="#">由于显示器、拍照和做图的过程中，产品可能发生颜色细微偏差！颜色以实物为准！</a></li>
							</ol>
						</div>
				</div>
			<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--//single-page-->
	<!--footer section start-->		
		<footer>
			<div class="footer-top">
				<div class="container">
					<div class="foo-grids">
						<div class="col-md-3 footer-grid">
							<h4 class="footer-head">介绍</h4>
							<p>早已确定的事实是，在查看页面布局时，读者会被页面的可读内容分散注意力。</p>
							<p>使用Lorem Ipsum的要点是，它具有或多或少的普通字母，而不是在此处使用“内容”。</p>
						</div>
						<div class="col-md-3 footer-grid">
							<h4 class="footer-head">帮助</h4>
							<ul>
								<li><a href="howitworks.html">怎样工作</a></li>						
								<li><a href="sitemap.html">网站地图</a></li>
								<li><a href="faq.html">常见问题</a></li>
								<li><a href="feedback.html">反馈</a></li>
								<li><a href="contact.html">联系</a></li>
								<li><a href="typography.html">简码</a></li>
							</ul>
						</div>
						<div class="col-md-3 footer-grid">
							<h4 class="footer-head">信息</h4>
							<ul>
								<li><a href="regions.html">位置图</a></li>	
								<li><a href="terms.html">使用条款</a></li>
								<li><a href="popular-search.html">热门搜寻</a></li>	
								<li><a href="privacy.html">隐私政策</a></li>	
							</ul>
						</div>
						<div class="col-md-3 footer-grid">
							<h4 class="footer-head">联系我们</h4>
							<span class="hq">总部</span>
							<address>
								<ul class="location">
									<li><span class="glyphicon glyphicon-map-marker"></span></li>
									<li>888888888888888888</li>
									<div class="clearfix"></div>
								</ul>	
								<ul class="location">
									<li><span class="glyphicon glyphicon-earphone"></span></li>
									<li>+000000000000</li>
									<div class="clearfix"></div>
								</ul>	
								<ul class="location">
									<li><span class="glyphicon glyphicon-envelope"></span></li>
									<li><a href="mailto:info@qq.com">mail@****.com</a></li>
									<div class="clearfix"></div>
								</ul>						
							</address>
						</div>
						<div class="clearfix"></div>
					</div>						
				</div>	
			</div>	
			<div class="footer-bottom text-center">
			<div class="container">
				<div class="footer-logo">
					<a href="#"><span>轻</span>松购</a>
				</div>
				<div class="footer-social-icons">
					<ul>
						<li><a class="facebook" href="#"><span>Facebook</span></a></li>
						<li><a class="twitter" href="#"><span>Twitter</span></a></li>
						<li><a class="flickr" href="#"><span>Flickr</span></a></li>
						<li><a class="googleplus" href="#"><span>Google+</span></a></li>
						<li><a class="dribbble" href="#"><span>Dribbble</span></a></li>
					</ul>
				</div>
				<div class="copyrights">
					<p>Copyright &copy; 2016.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		</footer>
        <!--footer section end-->
</body>
</html>