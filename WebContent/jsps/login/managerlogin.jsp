<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>后台管理登录页面</title>
<link rel="stylesheet" href="../../css/bootstrap.min.css">
<link rel="stylesheet" href="../../css/bootstrap-select.css">
<link href="../../css/style.css" rel="stylesheet" type="text/css" media="all" />
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
				window.scrollTo(0,1); }
</script>
<!-- //for-mobile-apps -->
<!--fonts-->
<link href='http://fonts.useso.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!--//fonts-->	
<!-- js -->
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../../js/bootstrap.min.js"></script>
<script src="../../js/bootstrap-select.js"></script>
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
<script type="text/javascript" src="../../js/jquery.leanModal.min.js"></script>
<link href="../../css/jquery.uls.css" rel="stylesheet"/>
<link href="../../css/jquery.uls.grid.css" rel="stylesheet"/>
<link href="../../css/jquery.uls.lcd.css" rel="stylesheet"/>
<!-- Source -->
<script src="../../js/jquery.uls.data.js"></script>
<script src="../../js/jquery.uls.data.utils.js"></script>
<script src="../../js/jquery.uls.lcd.js"></script>
<script src="../../js/jquery.uls.languagefilter.js"></script>
<script src="../../js/jquery.uls.regionfilter.js"></script>
<script src="../../js/jquery.uls.core.js"></script>
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
<script type="text/javascript">
	function doForm(){
		var name=document.getElementById("name").value;
		if(name==""){
			alert("请输入用户名！");
			document.getElementById("name").focus();//重新获取焦点
			return false;
		}
		var pass=document.getElementById("pass").value;
		if(pass==""){
			alert("请输入密码！");
			document.getElementById("pass").focus();//重新获取焦点
			return false;
		}
	}
</script>
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
	 <section>
			<div id="page-wrapper" class="sign-in-wrapper">
				<div class="graphs">
					<div class="sign-in-form">
						<div class="sign-in-form-top">
							<h1>管理员登录</h1>
						</div>
						<div class="signin">
							
							<form name="managerForm" action="<%=request.getContextPath() %>/login.do?method=managerlogin" method="post" focus="name" onsubmit="return doForm()">
								<div class="log-input">
									<div class="log-input-left">
									   <input type="text" class="user" name="manager_name" value="用户名/邮箱" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名/邮箱';}"/>
									</div>
									<span class="checkbox2">
										 <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i></label>
									</span>
									<div class="clearfix"> </div>
								</div>
								<div class="log-input">
									<div class="log-input-left">
									   <input type="password" class="lock" name="manager_pass" value="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名/邮箱';}"/>
									</div>
									<span class="checkbox2">
										 <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i></label>
									</span>
									<div class="clearfix"> </div>
								</div>
								<input type="submit" value="登录">
							</form>	
							<div></div>
							<div class="signin-rit">
								<span class="checkbox1">
									 <label class="checkbox">
									 	<input type="checkbox" name="checkbox" checked="">保存密码
									 </label>
								</span>
								<p><a href="#">忘记密码</a> </p>
								<div class="clearfix"> </div>
							</div>
						</div>
				<!-- 	
						<div class="new_people">
							<h2>新人注册</h2>
							<p>
								Easy Shopping Easy shopping easy, your only choice.<br />
								Hurry up and register!
							</p>
							<a href="<%=request.getContextPath() %>/jsps/login/register.jsp">立即注册</a>
						</div>
				 -->			
					</div>
				</div>
			</div>
	</section>
</body>
</html>