<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>手机页面</title>
<link rel="stylesheet" href="../../../css/bootstrap.min.css">
<link rel="stylesheet" href="../../../css/bootstrap-select.css">
<link href="../../../css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="../../../css/jquery-ui1.css">
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
<script type="text/javascript" src="../../../js/jquery.min.js"></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../../../js/bootstrap.min.js"></script>
<script src="../../../js/bootstrap-select.js"></script>
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
<script type="text/javascript" src="../../../js/jquery.leanModal.min.js"></script>
<link href="../../../css/jquery.uls.css" rel="stylesheet"/>
<link href="../../../css/jquery.uls.grid.css" rel="stylesheet"/>
<link href="../../../css/jquery.uls.lcd.css" rel="stylesheet"/>
<!-- Source -->
<script src="../../../js/jquery.uls.data.js"></script>
<script src="../../../js/jquery.uls.data.utils.js"></script>
<script src="../../../js/jquery.uls.lcd.js"></script>
<script src="../../../js/jquery.uls.languagefilter.js"></script>
<script src="../../../js/jquery.uls.regionfilter.js"></script>
<script src="../../../js/jquery.uls.core.js"></script>
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
    <script src="../../../js/tabs.js"></script>
	
<script type="text/javascript">
$(document).ready(function () {    
var elem=$('#container ul');      
	$('#viewcontrols a').on('click',function(e) {
		if ($(this).hasClass('gridview')) {
			elem.fadeOut(1000, function () {
				$('#container ul').removeClass('list').addClass('grid');
				$('#viewcontrols').removeClass('view-controls-list').addClass('view-controls-grid');
				$('#viewcontrols .gridview').addClass('active');
				$('#viewcontrols .listview').removeClass('active');
				elem.fadeIn(1000);
			});						
		}
		else if($(this).hasClass('listview')) {
			elem.fadeOut(1000, function () {
				$('#container ul').removeClass('grid').addClass('list');
				$('#viewcontrols').removeClass('view-controls-grid').addClass('view-controls-list');
				$('#viewcontrols .gridview').removeClass('active');
				$('#viewcontrols .listview').addClass('active');
				elem.fadeIn(1000);
			});									
		}
	});
});
</script>
</head>
<body>
<div class="header">
		<div class="container">
			<div class="logo">
				<a href="index.html"><span>轻</span>松购</a>
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
								
								<div class="modal-body">
									 <form class="form-horizontal" role="form">
										
									  </form>    
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
			<h1> <span class="segment-heading">    </span> </h1>
			<p></p>
			<p></p>
			<a href="post-ad.html" >发布</a>
	  </div>
	</div>
	<!-- Mobiles -->
	<div class="total-ads main-grid-border">
		<div class="container">
			<div class="select-box">
				<div class="select-city-for-local-ads ads-list">

				</div>
				<div class="browse-category ads-list">
					
				</div>
				<div class="search-product ads-list">
					<label>搜索</label>
					<div class="search">
						<div id="custom-search-input">
						<div class="input-group">
							<input type="text" class="form-control input-lg"  />
							<span class="input-group-btn">
								<button class="btn btn-info btn-lg" type="button">
									<i class="glyphicon glyphicon-search"></i>
								</button>
							</span>
						</div>
					</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
			<ol class="breadcrumb" style="margin-bottom: 5px;">
				  <li><a href="<%=request.getContextPath()%>/inedx.jsp">首页</a></li>
			  <li><a href="<%=request.getContextPath()%>/categories.jsp">分类目录</a></li>
			  <li class="active">手机</li>
			</ol>
			<div class="ads-grid">
				<div class="side-bar col-md-3">
					<div class="search-hotel">
					<h3 class="sear-head">名称包含</h3>
					<form>
						<input type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Product name...';}" required="">
						<input type="submit" value=" ">
					</form>
				</div>
				
				<div class="range">
					<h3 class="sear-head">价格范围</h3>
							<ul class="dropdown-menu6">
								<li>
									                
									<div id="slider-range"></div>							
										<input type="text" id="amount" style="border: 0; color: #ffffff; font-weight: normal;" />
									</li>			
							</ul>
							<!---->
							<script type="text/javascript" src="../../../js/jquery-ui.js"></script>
							<script type='text/javascript'>//<![CDATA[ 
							$(window).load(function(){
							 $( "#slider-range" ).slider({
										range: true,
										min: 0,
										max: 9000,
										values: [ 50, 6000 ],
										slide: function( event, ui ) {  $( "#amount" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
										}
							 });
							$( "#amount" ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) + " - $" + $( "#slider-range" ).slider( "values", 1 ) );

							});//]]>  

							</script>
							
				</div>
				<div class="brand-select">
					<h3 class="sear-head">品牌</h3>
					  <select class="selectpicker" data-live-search="true">
					  <option data-tokens="All">All</option>
					  
					</select>
				</div>
				<div class="featured-ads">
					<h2 class="sear-head fer">推荐</h2>
					<div class="featured-ad">
						<a href="<%=request.getContextPath()%>/jsps/commodityR.do?method=queryone&commodity_id=c1">
							<div class="featured-ad-left">
								<img src="../../../images/f1.jpg" title="ad image" alt="" />
							</div>
							<div class="featured-ad-right">
								<h4>手机</h4>
								<p>￥450</p>
							</div>
							</a>
							<div class="clearfix"></div>
					
					</div>
					<div class="clearfix"></div>
				</div>
				</div>
				<div class="ads-display col-md-9">
					<div class="wrapper">					
					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
					  <ul id="myTab" class="nav nav-tabs nav-tabs-responsive" role="tablist">
						<li role="presentation" class="active">
						  <a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">
							<span class="text">商品展示</span>
						  </a>
						</li>
						<li role="presentation" class="next">
						  <a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile">
							<span class="text">九成新</span>
						  </a>
						</li>
						<li role="presentation">
						  <a href="#samsa" role="tab" id="samsa-tab" data-toggle="tab" aria-controls="samsa">
							<span class="text">八成新</span>
						  </a>
						</li>
					  </ul>
					  <div id="myTabContent" class="tab-content">
						<div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
						   <div>
												<div id="container">
								<div class="view-controls-list" id="viewcontrols">
									<label>视图 :</label>
									<a class="gridview"><i class="glyphicon glyphicon-th"></i></a>
									<a class="listview active"><i class="glyphicon glyphicon-th-list"></i></a>
								</div>
								<div class="sort">
								   <div class="sort-by">
										<label>排序方式 : </label>
										<select>
														<option value="">最近的</option>
														<option value="">价格: 从低到高</option>
														<option value="">价格: 从高到低</option>
										</select>
									   </div>
									 </div>
								<div class="clearfix"></div>
							<ul class="list">
								<a href="<%=request.getContextPath()%>/jsps/commodityR.do?method=queryone&commodity_id=c1">
									<li>
									<img src="../../../images/m1.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">There are many variations of passages of Lorem Ipsum</h5>
									<span class="adprice">$290</span>
									<p class="catpath">Mobile Phones » Brand</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:55</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="<%=request.getContextPath()%>/jsps/single.jsp">
									<li>
									<img src="images/m2.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">It is a long established fact that a reader</h5>
									<span class="adprice">$310</span>
									<p class="catpath">Mobile Phones » Brand</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:45</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
							<a href="<%=request.getContextPath()%>/jsps/single.jsp">
									<li>
									<img src="images/m3.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">Contrary to popular belief, Lorem Ipsum is not</h5>
									<span class="adprice">$190</span>
									<p class="catpath">Mobile Phones » Brand</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:30</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
							<a href="<%=request.getContextPath()%>/jsps/single.jsp">
									<li>
									<img src="images/m4.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">The standard chunk of Lorem Ipsum used since the</h5>
									<span class="adprice">$480</span>
									<p class="catpath">Mobile Phones » Brand</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:25</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="<%=request.getContextPath()%>/jsps/single.jsp">
									<li>
									<img src="images/m5.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">Sed ut perspiciatis unde omnis iste natus error sit voluptatem</h5>
									<span class="adprice">$859</span>
									<p class="catpath">Mobile Phones » Brand</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:24</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
							
					
							</ul>
						</div>
							</div>
						</div>
						<div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
						 <div>
												<div id="container">
								<div class="view-controls-list" id="viewcontrols">
									<label>view :</label>
									<a class="gridview"><i class="glyphicon glyphicon-th"></i></a>
									<a class="listview active"><i class="glyphicon glyphicon-th-list"></i></a>
								</div>
								<div class="sort">
								   <div class="sort-by">
										<label>排序方式 : </label>
										<select>
														<option value="">最近的</option>
														<option value="">价格: 从低到高</option>
														<option value="">价格: 从高到低</option>
										</select>
										</select>
									   </div>
									 </div>
								<div class="clearfix"></div>
							<ul class="list">
								<a href="<%=request.getContextPath()%>/jsps/single.jsp">
									<li>
									<img src="../../../images/m1.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">There are many variations of passages of Lorem Ipsum</h5>
									<span class="adprice">$290</span>
									<p class="catpath">Mobile Phones » Brand</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:55</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
					
							
					
							</ul>
						</div>
							</div>
						</div>
						<div role="tabpanel" class="tab-pane fade" id="samsa" aria-labelledby="samsa-tab">
						  <div>
												<div id="container">
								<div class="view-controls-list" id="viewcontrols">
									<label>view :</label>
									<a class="gridview"><i class="glyphicon glyphicon-th"></i></a>
									<a class="listview active"><i class="glyphicon glyphicon-th-list"></i></a>
								</div>
								<div class="sort">
								   <div class="sort-by">
										<label>排序方式 : </label>
										<select>
														<option value="">最近的</option>
														<option value="">价格: 从低到高</option>
														<option value="">价格: 从高到低</option>
										</select>
										</select>
									   </div>
									 </div>
								<div class="clearfix"></div>
							<ul class="list">
						<a href="<%=request.getContextPath()%>/jsps/single.jsp">
									<li>
									<img src="images/m1.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">There are many variations of passages of Lorem Ipsum</h5>
									<span class="adprice">$290</span>
									<p class="catpath">Mobile Phones » Brand</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:55</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="<%=request.getContextPath()%>/jsps/single.jsp">
									<li>
									<img src="images/m2.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">It is a long established fact that a reader</h5>
									<span class="adprice">$310</span>
									<p class="catpath">Mobile Phones » Brand</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:45</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
							<a href="<%=request.getContextPath()%>/jsps/single.jsp">
									<li>
									<img src="images/m3.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">Contrary to popular belief, Lorem Ipsum is not</h5>
									<span class="adprice">$190</span>
									<p class="catpath">Mobile Phones » Brand</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:30</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
							</ul>
						</div>
							</div>
						</div>
					  </div>
					</div>
				</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>	
	</div>
	<!-- // Mobiles -->
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
					<a href="index.html"><span>Re</span>sale</a>
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
</html></html>