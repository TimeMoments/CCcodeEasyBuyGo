<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品分类页面</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-select.css">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Resale Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> 
			addEventListener("load", 
					function() {
							setTimeout(hideURLbar, 0); }, false); 
					function hideURLbar(){
							window.scrollTo(0,1);
					}
</script>
<!-- //for-mobile-apps -->
<!--fonts-->
<link href='http://fonts.useso.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!--//fonts-->	
<!-- js -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-select.js"></script>
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
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
<link href="css/jquery.uls.css" rel="stylesheet"/>
<link href="css/jquery.uls.grid.css" rel="stylesheet"/>
<link href="css/jquery.uls.lcd.css" rel="stylesheet"/>
<!-- Source -->
<script src="js/jquery.uls.data.js"></script>
<script src="js/jquery.uls.data.utils.js"></script>
<script src="js/jquery.uls.lcd.js"></script>
<script src="js/jquery.uls.languagefilter.js"></script>
<script src="js/jquery.uls.regionfilter.js"></script>
<script src="js/jquery.uls.core.js"></script>
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
		<link rel="stylesheet" type="text/css" href="css/easy-responsive-tabs.css " />
    <script src="js/easyResponsiveTabs.js"></script>
</head>
<body>
<div class="header">
		<div class="container">
			<div class="logo">
				<a href="index.html"><span>轻松</span>购</a>
			</div>
			<div class="header-right">
			<a class="account" href="<%=request.getContextPath() %>/jsps/login/login.jsp">登录</a>
			<a class="account" href="<%=request.getContextPath() %>/jsps/login/register.jsp">注册</a>
		
	<!-- Large modal -->
			<div class="selectregion">
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
					aria-hidden="true">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
										&times;</button>
									
								</div>
							</div>
						</div>
					</div>
				<script>
				$('#myModal').modal('');
				</script>
			</div>
		</div>
		</div>
	</div>
	<div class="banner text-center">
	  <div class="container">    
	  <h1>出售  <span class="segment-heading">   在线 </span>转售</h1>
	  	<p>轻松购 要相信光</p>
	      
			<a href="post-ad.html" >发布</a>
	  </div>
	</div>
	<!-- Categories -->
	<!--Vertical Tab-->
	<div class="categories-section main-grid-border">
		<div class="container">
			<h2 class="head">主要类别</h2>
			<div class="category-list">
				<div id="parentVerticalTab">
					<ul class="resp-tabs-list hor_1">
					<c:forEach items="${tag_list}" var="map">
						<li>${map.tag_name}</li>
						</c:forEach>
						<a href="all-classifieds.html">全部</a>
					</ul>
					<div class="resp-tabs-container hor_1">
						<span class="active total" style="display:block;" data-toggle="modal" data-target="#myModal"><strong>全部使用</strong> (所在地区选择)</span>
						
						<c:forEach items="${tag_list }" var="map">
						<div>
							<div class="category">
								<div class="category-img">
									<img src="images/cat1.png" title="image" alt="" />
								</div>
								<div class="category-info">
									<h4>${map.tag_name }</h4>
									<span>${map.tag_has}个商品</span>
									<a href="<%=request.getContextPath()%>/category.do?method=query&id=${map.tag_id}">查询所有信息</a>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="sub-categories">
								<ul>
									<li><a href="<%=request.getContextPath()%>/category.do?method=query&id=${map.tag_id}">移动电话</a></li>
									
									<div class="clearfix"></div>
								</ul>
							</div>
						</div>
						</c:forEach>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<!--Plug-in Initialisation-->
	<script type="text/javascript">
    $(document).ready(function() {

        //Vertical Tab
        $('#parentVerticalTab').easyResponsiveTabs({
            type: 'vertical', //Types: default, vertical, accordion
            width: 'auto', //auto or any width like 600px
            fit: true, // 100% fit in a container
            closed: 'accordion', // Start closed if in accordion view
            tabidentify: 'hor_1', // The tab groups identifier
            activate: function(event) { // Callback function if tab is switched
                var $tab = $(this);
                var $info = $('#nested-tabInfo2');
                var $name = $('span', $info);
                $name.text($tab.text());
                $info.show();
            }
        });
    });
</script>
	<!-- //Categories -->
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
									<li>+00000000000000</li>
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
					<a href="index.html"><span>轻松</span>购</a>
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
				
				<div class="clearfix"></div>
			</div>
		</div>
		</footer>
        <!--footer section end-->
</body>
</html>