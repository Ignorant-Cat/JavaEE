<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<% String path =request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User表的删除</title>
</head>
<body>
<script type="text/javascript">
    function check(){
        if(document.getElementById("id1").value === ""){
            alert("username不能为空！");
            return false;
        }
        if(!confirm("真的要删除吗？")){
            return false;
        }
        return true;
    }
</script>
<form action="<%=path %>/delUser" method="post" onsubmit="return check()">
    <div align="center">
        <h1>User表的删除</h1>
        <table border="0">
            <tr>
                <td>username</td>
                <td><input type="text" name="username" id="id1"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="删除"></td>
            </tr>
        </table>
        <a href="index.jsp">返回主页</a>
    </div>
</form>
</body>
</html>