<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>激活验证码</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/register.do?method=userServlet" method="post">
       <table>
         <tr>
         <td>验证码：</td>
         <td><input type="text" name="ucode" value=""/></td>
         <td><input type="submit" value="验证" /></td>
         </tr>
         
       </table>
     </form>
</body>
</html>