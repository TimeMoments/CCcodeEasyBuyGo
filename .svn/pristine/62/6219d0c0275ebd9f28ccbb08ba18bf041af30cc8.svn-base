<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品发布页面</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
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
<style type="text/css">
	.admin-biaogelist{
		margin: 0px;
		padding: 0px;
		left: 0px;
		top: 0px;
	}
</style>
</head>
<body>
	<div class="admin-biaogelist">
	
		    <div class="listbiaoti am-cf">
		      <ul class="am-icon-flag on"> 修改页面</ul>
	
		    </div>
		<form name="questionsForm" method="post" action="<%=request.getContextPath() %>/pinglun.do?method=edit"  style="margin: 0px">
			<div class="fbneirong">
			<h1>修改用户留言</h1>
			<input type="hidden" name="commodity_message_id" value="${map.commodity_message_id}">
  <input type="text" class="am-input-sm"  name="commodity_message_text"  value="${map.commodity_message_text}" >
	
		<input type="submit" value="提交">
			</div>
			</form>

  
		 
</div>
</body>
</html>