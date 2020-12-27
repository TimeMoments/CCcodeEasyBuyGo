<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>用户评论</title>
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


<script language="javascript">
			function CheckAll(elementsA, elementsB) {
				for (i = 0; i < elementsA.length; i++) {
					elementsA[i].checked = true;
				}
				if (elementsB.checked == false) {
					for (j = 0; j < elementsA.length; j++) {
						elementsA[j].checked = false;
					}
				}
			}
			//判断用户是否选择了要删除的记录，如果是，则提示“是否删除”；否则提示“请选择要删除的记录”
			function checkdel(delid, formname) {
				var flag = false;
				for (var i = 0; i < delid.length; i++) {
					if (delid[i].checked) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					alert("请选择要删除的记录！");
					return false;
				} else {
					if (confirm("确定要删除吗？")) {
						formname.submit();
					}
				}
			}
			
			</script>
</head>
<body>
<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->

</head>

<body>
<header class="am-topbar admin-header">
  <div class="am-topbar-brand"><img src="assets/i/logo.png"></div>
  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">
    
       
     
      <li class="soso">
        <p>
          <select data-am-selected="{btnWidth: 70, btnSize: 'sm', btnStyle: 'default'}">
            <option value="b">全部</option>
            <option value="o">产品</option>
          </select>
        </p>
        <p class="ycfg">
          <input type="text" class="am-form-field am-input-sm" placeholder="圣诞快乐!" />
        </p>
        <p>
          <button class="am-btn am-btn-xs am-btn-default am-xiao"><i class="am-icon-search"></i></button>
        </p>
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
         <li><a href="<%=request.getContextPath()%>/shangpinliebiao.do?method=query">商品列表</a></li>
               <li><a href="<%=request.getContextPath()%>/pinglun.do?method=query">用户评论</li>
      
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
      	<ul>
				<li><button type="button"class="am-btn am-btn-default am-radius am-btn-xs"></li>
					<a href="<%=request.getContextPath()%>/manager.do?method=query">
                  <input type=button value="首页" >
                      </a>
				
			</ul>
        </li>
      </ul>
    </div>
    <div class="am-popup am-popup-inner" id="my-popup">
      <div class="am-popup-hd">
        <h4 class="am-popup-title">添加商品一级分类</h4>
        <span data-am-modal-close
            class="am-close">&times;</span> </div>
      <div class="am-popup-bd">
        <form class="am-form tjlanmu">
          <div class="am-form-group">
            <div class="zuo">栏目名称：</div>
            <div class="you">
              <input type="email" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
            </div>
          </div>
          <div class="am-form-group">
            <div class="zuo">栏目关键词：</div>
            <div class="you">
              <input type="password" class="am-input-sm" id="doc-ipt-pwd-1" placeholder="请输入关键词">
            </div>
          </div>
          <div class="am-form-group am-cf">
            <div class="zuo">栏目描述：</div>
            <div class="you">
              <textarea class="" rows="2" id="doc-ta-1"></textarea>
            </div>
          </div>
          <div class="am-form-group am-cf">
            <div class="zuo">栏目图片：</div>
            <div class="you" style="height: 45px;">
              <input type="file" id="doc-ipt-file-1">
              <p class="am-form-help">请选择要上传的文件...</p>
            </div>
          </div>
          <div class="am-form-group am-cf">
            <div class="zuo">简介：</div>
            <div class="you">
              <textarea class="" rows="2" id="doc-ta-1"></textarea>
            </div>
          </div>
          <div class="am-form-group am-cf">
            <div class="zuo">状态：</div>
            <div class="you" style="margin-top: 3px;">
              <label class="am-checkbox-inline">
                <input type="checkbox" value="option1">
                显示 </label>
              <label class="am-checkbox-inline">
                <input type="checkbox" value="option2">
                隐藏 </label>
            </div>
          </div>
          <div class="am-form-group am-cf">
            <div class="you">
              <p>
                <button type="submit" class="am-btn am-btn-success am-radius">提交</button>
              </p>
            </div>
          </div>
        </form>
      </div>
    </div>
    
          <div class="am-popup am-popup-inner" id="my-popups">
        <div class="am-popup-hd">
          <h4 class="am-popup-title">修改栏目名称</h4>
          <span data-am-modal-close class="am-close">&times;</span> </div>
        <div class="am-popup-bd">
          <form class="am-form tjlanmu">
            <div class="am-form-group">
              <div class="zuo">栏目名称：</div>
              <div class="you">
                <input type="email" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
              </div>
            </div>
            <div class="am-form-group">
              <div class="zuo">栏目关键词：</div>
              <div class="you">
                <input type="password" class="am-input-sm" id="doc-ipt-pwd-1" placeholder="请输入关键词">
              </div>
            </div>
            <div class="am-form-group am-cf">
              <div class="zuo">栏目描述：</div>
              <div class="you">
                <textarea class="" rows="2" id="doc-ta-1"></textarea>
              </div>
            </div>
            <div class="am-form-group am-cf">
              <div class="zuo">栏目图片：</div>
              <div class="you" style="height: 45px;">
                <input type="file" id="doc-ipt-file-1">
                <p class="am-form-help">请选择要上传的文件...</p>
              </div>
            </div>
            <div class="am-form-group am-cf">
              <div class="zuo">简介：</div>
              <div class="you">
                <textarea class="" rows="2" id="doc-ta-1"></textarea>
              </div>
            </div>
            <div class="am-form-group am-cf">
              <div class="zuo">状态：</div>
              <div class="you" style="margin-top: 3px;">
                <label class="am-checkbox-inline">
                  <input type="checkbox" value="option1">
                  显示 </label>
                <label class="am-checkbox-inline">
                  <input type="checkbox" value="option2">
                  隐藏 </label>
              </div>
            </div>
            <div class="am-form-group am-cf">
              <div class="you">
                <p>
                  <button type="submit" class="am-btn am-btn-success am-radius">提交</button>
                </p>
              </div>
            </div>
          </form>
        </div>
      </div>
    
    
    
    
    
    
    <div class="am-popup am-popup-inner" id="my-popupss">
        <div class="am-popup-hd">
          <h4 class="am-popup-title">复制栏目</h4>
          <span data-am-modal-close class="am-close">&times;</span> </div>
        <div class="am-popup-bd">
          <form class="am-form tjlanmu">
          
          
          <div class="am-form-group">
              <div class="zuo">复制到：</div>
              <div class="you">
              
  <select data-am-selected="{btnWidth: 200, btnSize: 'sm', btnStyle: 'danger'}">
  <option value="a">Apple</option>
  <option value="b">Banana</option>
  <option value="o">Orange</option>
  <option value="m">Mango</option>
</select>
 顶级栏目选默认

              </div>
            </div>
          
          
            <div class="am-form-group">
              <div class="zuo">新栏目名称：</div>
              <div class="you">
                <input type="email" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
              </div>
            </div>
            <div class="am-form-group">
              <div class="zuo">栏目关键词：</div>
              <div class="you">
                <input type="password" class="am-input-sm" id="doc-ipt-pwd-1" placeholder="请输入关键词">
              </div>
            </div>
            <div class="am-form-group am-cf">
              <div class="zuo">栏目描述：</div>
              <div class="you">
                <textarea class="" rows="2" id="doc-ta-1"></textarea>
              </div>
            </div>
            <div class="am-form-group am-cf">
              <div class="zuo">栏目图片：</div>
              <div class="you" style="height: 45px;">
                <input type="file" id="doc-ipt-file-1">
                <p class="am-form-help">请选择要上传的文件...</p>
              </div>
            </div>
            <div class="am-form-group am-cf">
              <div class="zuo">简介：</div>
              <div class="you">
                <textarea class="" rows="2" id="doc-ta-1"></textarea>
              </div>
            </div>
            <div class="am-form-group am-cf">
              <div class="zuo">状态：</div>
              <div class="you" style="margin-top: 3px;">
                <label class="am-checkbox-inline">
                  <input type="checkbox" value="option1">
                  显示 </label>
                <label class="am-checkbox-inline">
                  <input type="checkbox" value="option2">
                  隐藏 </label>
              </div>
            </div>
            <div class="am-form-group am-cf">
              <div class="you">
                <p>
                  <button type="submit" class="am-btn am-btn-success am-radius">提交</button>
                </p>
              </div>
            </div>
          </form>
        </div>
      </div>
    
    <div class="admin-biaogelist">
      <div class="listbiaoti am-cf">
        <ul class="am-icon-flag on">
          用户评论
        </ul>
        <dl class="am-icon-home" style="float: right;">
          当前位置： 首页 > <a href="#">用户评论</a>
        </dl>
        <dl>
          <button type="button" class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus" data-am-modal="{target: '#my-popup'}"> 给商品添加评论</button>
        </dl>
        <!--data-am-modal="{target: '#my-popup'}" 弹出层 ID  弹出层 190行 开始  271行结束--> 
        
      </div>
     <form class="am-form am-g" name="studentForm" action="<%=request.getContextPath() %>/pinglun.do?method=delete" method="post">
        <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover">
          <thead>
            <tr class="am-success">
 <th class="table-check"><input name="checkbox" type="checkbox" class="noborder" onClick="CheckAll(studentForm.delIdArray,studentForm.checkbox)" /></th>
              <th class="table-id">排序</th>
              <th class="table-id am-text-center">ID</th>
              <th class="table-title">商品名称</th>
              <th class="table-type">商品评论</th>
              <th class="table-author am-hide-sm-only">用户ID</th>
             
              <th width="125px" class="table-set">操作</th>
            </tr>
          </thead>
          <tbody>
                <% 
                   List list=(List)request.getAttribute("list_message");
                      for(int i=0;i<list.size();i++)
                      {
                    	  Map map=(Map)list.get(i);
        %>
            <tr>
              <td><input type="checkbox" name="delIdArray" value="<%=map.get("commodity_message_id") %>" class="noborder" /></td>
              <td><input type="text" class="am-form-field am-radius am-input-sm"/></td>
              <td class="am-text-center">14</td>
              <td><%=map.get("commodity_name")%></td>
              <td><%=map.get("commodity_message_text")%></td>
              <td class="am-hide-sm-only"><%=map.get("user_id")%></td>
              <td><div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                   <a href="#">查看</a>
                      <a href="<%=request.getContextPath()%>/pinglun.do?method=editPage&commodity_message_id=<%=map.get("commodity_message_id")%>"> 编辑</a>
                  </div>
                </div></td>
            </tr>
        <%
                        }    
        %>
          
          </tbody>
        </table>
        <div class="am-btn-group am-btn-group-xs">
          <button  type="button" class="am-btn am-btn-default" onClick="checkdel(studentForm.delIdArray,studentForm)" ><span class="am-icon-plus"></span> 删除</button>
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