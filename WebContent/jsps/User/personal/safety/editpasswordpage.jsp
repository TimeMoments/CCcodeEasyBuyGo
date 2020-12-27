<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">
<title>修改密码</title>
<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
<link href="https://cdn.bootcss.com/amazeui/2.5.1/css/amazeui.css" rel="stylesheet" type="text/css" />

<link href="css/personal.css" rel="stylesheet" type="text/css">
<link href="css/stepstyle.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script src="https://cdn.bootcss.com/amazeui/2.5.1/js/amazeui.min.js"></script>
<style type="text/css">
	.button_btn_danger{
		background-color: #dd514c;
		border:6px solid #dd514c;
		
	}

</style>
<script type="text/javascript">
function checkForm(){
	//alert("1.文件域的非空验证.....");
	var userOldPassword = document.getElementById("userOldPassword").value;
	var userNewPassword = document.getElementById("userNewPassword").value;
	var userConfirmPassword = document.getElementById("userConfirmPassword").value;
	if(userOldPassword==""){
		alert("请输入原密码！");
		return false;
	}else if (userNewPassword=="") {
		alert("请输入新密码！");
		return false;
	}else if (userConfirmPassword=="") {
		alert("请输入确认密码！");
		return false;
	}else if (userNewPassword!=userConfirmPassword) {
		alert("新密码与确认密码不一致，请重新输入！");
		return false;
	}
	  
	
  }


</script>
</head>
<body>
<!--头 -->
		<header>
			<article>
				<div class="mt-logo">
					<!--顶部导航条 -->
					<div class="header-top">
						<div class="am-container header">
							
							<ul class="message-r">
								<div class="topMessage my-shangcheng">
									<div class="menu-hd MyShangcheng"><a href="#" target="_top">会员中心</a></div>
								</div>
								<div class="topMessage mini-cart">
									<div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><span>商户中心</span><strong id="J_MiniCartNum" class="h"></strong></a></div>
								</div>
								<div class="topMessage favorite">
									<div class="menu-hd"><a href="#" target="_top"><span>帮助</span></a></div>
								</div>
							</ul>
						</div>
					</div>

						<!--悬浮搜索框-->

						<div class="nav white">
							<div class="logoBig">
								<li><img src="images/logobig.png" /></li>
							</div>

							<div class="search-bar pr">
								<a name="index_none_header_sysc" href="#"></a>
								<form>
									<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
									<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
								</form>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
			</article>
		</header>
            <div class="nav-table">
					   <div class="long-title"><span class="all-goods">全部分类</span></div>
					   <div class="nav-cont">
							<ul>
								<li class="index"><a href="#">首页</a></li>
                                
							</ul>
						    
						</div>
			</div>
			<b class="line"></b>
		<div class="center">
			<div class="col-main">
				<div class="main-wrap">

					<div class="am-cf am-padding">
						<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">修改密码</strong> / <small>Password</small></div>
					</div>
					<hr/>
					<!--进度条-->
					<div class="m-progress">
						<div class="m-progress-list">
							<span class="step-1 step">
                                <em class="u-progress-stage-bg"></em>
                                <i class="u-stage-icon-inner">1<em class="bg"></em></i>
                                <p class="stage-name">重置密码</p>
                            </span>
							<span class="step-2 step">
                                <em class="u-progress-stage-bg"></em>
                                <i class="u-stage-icon-inner">2<em class="bg"></em></i>
                                <p class="stage-name">完成</p>
                            </span>
							<span class="u-progress-placeholder"></span>
						</div>
						<div class="u-progress-bar total-steps-2">
							<div class="u-progress-bar-inner"></div>
						</div>
					</div>
					<form class="am-form am-form-horizontal" name="form1" method="post" action="<%=request.getContextPath()%>/User/personalsafety.do?method=editSafetyPassword&user_id=<%=((Map)session.getAttribute("user")).get("user_id")%>"  onsubmit="return checkForm(form1)">
						<div class="am-form-group">
							<label for="user-old-password" class="am-form-label">原密码</label>
							<div class="am-form-content">
								<input type="password" name="originalPassword"  id="userOldPassword" placeholder="请输入原登录密码">
							</div>
						</div>
						<div class="am-form-group">
							<label for="user-new-password" class="am-form-label">新密码</label>
							<div class="am-form-content">
								<input type="password" name="newPassword" id="userNewPassword" placeholder="由数字、字母组合">
							</div>
						</div>
						<div class="am-form-group">
							<label for="user-confirm-password" class="am-form-label">确认密码</label>
							<div class="am-form-content">
								<input type="password" name="confirm_new_password" id="userConfirmPassword" placeholder="请再次输入上面的密码">
							</div>
						</div>
						<div class="info-btn">
							<div class="am-btn am-btn-danger">
								<input class="button_btn_danger"  type="submit" value="保存修改"/>
							</div>
						</div>

					</form>

				</div>
				<!--底部-->
				<div class="footer">
					<div class="footer-hd">
						<p>
							<a href="#">恒望科技</a>
							<b>|</b>
							<a href="#">商城首页</a>
							<b>|</b>
							<a href="#">支付宝</a>
							<b>|</b>
							<a href="#">物流</a>
						</p>
					</div>
					<div class="footer-bd">
						<p>
							<a href="#">关于恒望</a>
							<a href="#">合作伙伴</a>
							<a href="#">联系我们</a>
							<a href="#">网站地图</a>
							<em>© 2016-2026 XXXX 版权所有 <a href="http://www.cssmoban.com/" target="_blank" title="版权所有">版权所有</a> - Collect from</em>
						</p>
					</div>
				</div>
			</div>

			<aside class="menu">
				<ul>
					<li class="person">
						<a href="<%=request.getContextPath() %>/jsps/User/personalCenter .jsp">个人中心</a>
					</li>
					<li class="person">
						<a href="#">个人资料</a>
						<ul>
							<li> <a href="<%=request.getContextPath()%>/User.do?method=query&user_id=<%=((Map)session.getAttribute("user")).get("user_id")%>">个人信息</a></li>
							<li> <a href="<%=request.getContextPath()%>/User/personalsafety.do?method=querySafety&user_id=<%=((Map)session.getAttribute("user")).get("user_id")%>">安全设置</a></li>
							<li> <a href="<%=request.getContextPath() %>/jsps/User/address.jsp">收货地址</a></li>
						</ul>
					</li>
					<li class="person">
						<a href="#">我的交易</a>
						<ul>
							<li><a href="<%=request.getContextPath() %>/jsps/User/order.jsp">订单管理</a></li>
							<li> <a href="<%=request.getContextPath() %>/jsps/User/change.jsp">退款售后</a></li>
						</ul>
					</li>
					<li class="person">
						<a href="#">我的资产</a>
						<ul>
							<li> <a href="coupon.html">优惠券 </a></li>
							<li> <a href="bonus.html">红包</a></li>
							<li> <a href="bill.html">账单明细</a></li>
						</ul>
					</li>

					<li class="person">
						<a href="#">我的小窝</a>
						<ul>
							<li> <a href="collection.html">收藏</a></li>
							<li> <a href="foot.html">足迹</a></li>
							<li> <a href="comment.html">评价</a></li>
							<li> <a href="news.html">消息</a></li>
						</ul>
					</li>

				</ul>

			</aside>
		</div>

	</body>
</html>