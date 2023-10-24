<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示数据</title>
</head>
<body >
	<div align="center">
	<h1>User表数据</h1>
	<table border="1">
		<tr>
		<td>username</td>
		<td>pass</td>
		</tr>
	    <c:forEach items="${userList}" var="user">
			<tr>
			<td>${user.username}</td>
			<td>${user.pass}</td>
			</tr>
		</c:forEach>
	</table>
	<h1>Person表数据</h1>
	<table border="1">
		<tr>
		<td>username</td>
		<td>name</td>
		<td>age</td>
		<td>teleno</td>
		</tr>
	    <c:forEach items="${personList}" var="person">
			<tr>
			<td>${person.username}</td>
			<td>${person.name}</td>
			<td>${person.age}</td>
			<td>${person.teleno}</td>
			</tr>
		</c:forEach>
	</table>
	<br/><br/>
	<a href="index.jsp">返回主页</a>
	</div>
</body>
</html>