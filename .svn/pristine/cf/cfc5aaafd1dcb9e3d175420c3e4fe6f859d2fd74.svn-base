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
		<form name="questionsForm" method="post" action="<%=request.getContextPath() %>/shangpinliebiao.do?method=edit"  style="margin: 0px">
			<div class="fbneirong">
			
			
	
			    <div class="am-form-group am-cf">
			      <div class="zuo">商品名称：</div>
			      <div class="you">
			      	<input type="hidden" name="commodity_id" value="${map.commodity_id}"/>
			        <input type="text" class="am-input-sm"  name="commodity_name"  value="${map.commodity_name}" >
			      </div>
			    </div>
			    <div class="am-form-group am-cf">
			      <div class="zuo">商品成色：</div>
			      <div class="you">
			        <input type="text" class="am-input-sm" id="doc-ipt-pwd-1" name="commodity_degree" value="${map.commodity_degree}" >
			      </div>
			    </div>
			      <div class="am-form-group am-cf">
			      <div class="zuo">分类：</div>
			      <div class="you">
			        <input type="text" class="am-input-sm" id="doc-ipt-pwd-1" name="tag_name" value="${map.tag_name}" >
			      </div>
			    </div>
			      <div class="am-form-group am-cf">
			      <div class="zuo">商品备注：</div>
			      <div class="you">
			        <input type="text" class="am-input-sm" id="doc-ipt-pwd-1" name="commodity_remark" value="${map.commodity_remark}" >
			      </div>
			    </div>
			   
			    <div class="am-form-group am-cf">
			      <div class="zuo">上传日期：</div>
			      <div class="you">
			        <input type="text" class="am-input-sm"  name="commodity_time" value="${map.commodity_time}" >
			      </div>
			    </div>
			    <div class="am-form-group am-cf">
			      <div class="you" style="margin-left: 11%;">
			          <button type="submit" class="am-btn am-btn-success am-radius">修改</button>
			      </div>
			    </div>
		
			</div>
			</form>

  
		 
</div>
</body>
</html>