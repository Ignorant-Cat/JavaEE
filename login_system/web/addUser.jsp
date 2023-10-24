<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String path =request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User表的插入</title>
</head>
<body>
	<script type="text/javascript">
	function check(){
		if(document.getElementById("id1").value == ""){
		    alert("username不能为空！");
		    return false;
		}
		if(document.getElementById("id2").value == ""){
		    alert("password不能为空！");
		    return false;
		}
		return true;
	}
	</script>
	<form action="<%=path %>/addUser" method="post" onsubmit="return check()">
		<div align="center">
			<h1>User表的插入</h1>
			<table border="0">
				<tr>
					<td>username</td>
					<td><input type="text" name="username" id="id1"></td>
				</tr>
				<tr>
					<td>password</td>
					<td><input type="text" name="pass" id="id2"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="插入"></td>
				</tr>						
			</table>
			<a href="index.jsp">返回主页</a>	
		</div>
	</form>
</body>
</html>