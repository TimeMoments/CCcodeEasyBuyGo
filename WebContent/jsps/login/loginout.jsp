<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Untitled Document</title>
</head>
<body>
	<%
			session.invalidate();
			out.println("<script language='javascript'>");
			out.println("window.location.href='../../index.jsp'");
			out.println("</script>");
	%>
</body>
</html>