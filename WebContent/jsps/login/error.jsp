<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>错误提示</title>
</head>
<body>
	<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#EEEEEE">
			<tr>
				<td align="center">
					<table width="350" height="192" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td align="center" background="<%=request.getContextPath() %>/images/error.jpg">
								&nbsp;&nbsp;错误提示信息:
								<%=request.getAttribute("error") %> <br> <br> <input name="Submit"
								type="submit" class="btn_grey" value="返回"
								onClick="history.back(-1)">
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
</body>
</html>