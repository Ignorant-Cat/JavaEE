
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path =request.getContextPath(); %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>成功</title>
</head>
<body>
	<div align="center">
		<%= request.getAttribute("result")%>
		<br/>
		<a href="<%= path%>/getAllData">显示数据库</a>	
	</div>
</body>
</html>