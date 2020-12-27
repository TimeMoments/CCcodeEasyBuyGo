<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>购物车页面</title>
<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/bootstrap-3.3.4.css">
<script src="http://www.jq22.com/jquery/angular-1.4.6.js"></script>
<script type="text/javascript" src="../../js/angular-ui-router.min.js" ></script>
		<style>
			*{
				margin: 0;
				padding: 0;
			}
			html,body{
				width: 100%;
				height: 100%;
				background-size: 100% 100%;
			}
			table{
				width: 100%;
				border-collapse: collapse;
			}
			table tr th{
				text-align: center;
			}
			table tr th:nth-child(3){
				text-align: left;
			}
			table tr{
				height: 40px;
				border-bottom: 1px solid #d4d4d7;
			}
			table tr td:last-child button{
				width: 30%;
				height: 80%;
				background:#C9302C;
				border-radius: 5px;
				border: 0px;
				color: #fff;
				outline: none;
			}
			table tr td{
				text-align: center;
				color: #151515;
				font-family: "微软雅黑";
				/*border: 1px solid #d4d4d7;*/
				padding-left: 5px;
				font-size: 13px;
				height: 30px;
			}
			table tr td:nth-child(2) img{
				height: 100%;
			}
			table tr td:nth-child(3){
				text-align: left;
			}
			table tr:nth-child(even){
				background: #f4f4f4;
			}
			table tr td:nth-child(4) button{
				width: 25px;
				background: #C9302C;
				border: 1px solid #C9302C;
				color: #fff;
				height: 70%;
			}
			table tr td:nth-child(4) input{
				width: 60px;
				height: 69%;
				border: 1px solid #D4D4D7;
				margin: 0px 5px;
				text-align: center;
			}
			.fcred{
				background: #EBEBE4 !important;
			}
			#button_colore_one{
				
				background-color: rgb(1,161,133);
				border: solid rgb(1,161,133);
			}
			#button_colore_tow{
				width: 60px;
				background-color: rgb(1,161,133);
				border: solid rgb(1,161,133);
			}
			#button_colore_three{
				
				background-color: rgb(1,161,133);
				border: solid rgb(1,161,133);
			}
			.img_class{
				width: 50px;
				height: 30px;
			}
			
		</style>
		<style type="text/css">
			.shows{
				position:absolute;
				display:none;
			}
			.image:hover+.shows{
				display:block;
			}
			.back_input{
				width:80px ;
				height:31px;
				background-color: rgb(1,161,133);
				color:white;
				border:rgb(1,161,133);
				border-radius: 6px;
				right: 0px;
			}
		</style>
	</head>
	<body ng-app="app" ng-controller="cont">
		<div style="margin-left:auto; margin-right:auto; width:600px; padding-top:30px; ">
	    	<input  type="text" name="" value=""  ng-model="abc"  placeholder="输入关键字快速查找">
	    </div>
		<table>
			<tr>
				<th>产品编号</th>
				<th>产品展示</th>
				<th>产品名称</th>
				<th>购买数量</th>
				<th>产品单价</th>
				<th>产品总价</th>
				<th>操作</th>
			</tr>
			<tr  ng-repeat="item in td |filter:abc" ng-class="{'fcred':item.math==0}">
				<td>{{$index+1}}</td>
				<td>
					
					<div class="image">
			    		<img class="img_class" src="img/e5.jpg">
			    	</div>
			    	<div class="shows" >
			     		<img style="width:175px;height:120px" src="img/e5.jpg" />
			     	</div>
			     	
				</td>
				<td>{{item.name}}</td>
				<td><button id="button_colore_one" ng-click="jian(item,$index)">-</button><input type="text" ng-model="item.math" disabled="disabled"><button id="button_colore_one" ng-click="jia(item)">+</button></td>
				<td>{{item.price}} 元</td>
				<td>{{item.math*item.price}}</td>
				<td><button id="button_colore_tow" ng-click="del($index)"> 移 除 </button></td>
			</tr>
			<tr>
				<td>总购买数量</td>
				<td>{{zzprice()}}</td>
				<td></td>
				<td>购物车总价</td>
				<td>{{totalprice()}} 元</td>
				<td colspan="2">
					<button id="button_colore_three" ng-click="removeAll()">清空购物车</button>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" class="back_input" name="Submit" onclick="javascript:history.back(-1);" value="返回
">
				</td>
			</tr>
		</table>
		
		<script>
			var myApp = angular.module("app", ["ui.router"]);
			myApp.controller('cont',function($scope,$http,$state){
				$scope.td=[
					{name:"iphone5",math:1,price:100,},
					{name:"iphone6",math:1,price:200,},
					{name:"iphone6S",math:1,price:300,},
					{name:"iphone7",math:1,price:400,},
					{name:"iphone7 Plus",math:1,price:5699,},
					{name:"iphone8",math:1,price:6699,},
					{name:"iphone X",math:1,price:7699,},
					{name:"iphone XS",math:1,price:8699,},
					{name:"iphone XR",math:1,price:9699,},
					{name:"iphone XS MAX",math:1,price:12999,}
				]
				$scope.jia=function(item){
					item.math++
				}
				$scope.jian=function(item,index){
					if(item.math>0){
						item.math--
					}else{
						item.math==1
					}
//					if(item.math==0){
//		                $scope.td.splice(index, 1); //数量为0是 移除商品
//					}
				}
				$scope.del=function (index) {
	                if (confirm("确认删除吗？") == true) {
	                    $scope.td.splice(index, 1);
	                }
	            }//点击每条删除
				
				$scope.totalprice = function() {
                        var to_price = 0
                        for(var i = 0; i < $scope.td.length; i++) {
                            to_price += $scope.td[i].math * $scope.td[i].price
                        }
                        return to_price;
                 }//总价格
				
				$scope.zzprice=function(){
					var to_price = 0
                        for(var i = 0; i < $scope.td.length; i++) {
                            to_price += $scope.td[i].math
                        }
                        return to_price;
				}//总数
				
				$scope.removeAll = function() {
                    if (confirm("确认清空购物车吗？") == true) {
	                    $scope.td=[];
	                }
                }//清空购物车
				
			})
		</script>
</body>
</html>