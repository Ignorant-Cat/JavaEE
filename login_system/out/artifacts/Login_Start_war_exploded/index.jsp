<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String path =request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
	<div align="center">
		<h1>Users</h1>
		<a href="addUser.jsp">插入</a>
		<a href="delUser.jsp">删除</a>
		<h1>Person</h1>
		<a href="addPerson.jsp">插入</a>
		<a href="delPerson.jsp">删除</a>
		<br/><br/>
		<a href="<%= path%>/getAllData">显示数据库</a>
	</div>
</body>
</html>