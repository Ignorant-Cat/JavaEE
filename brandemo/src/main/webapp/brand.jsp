<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>${user.username}欢迎你</h1>
<input type="button" value="新增" id="add"><br>

<hr>
<table border="1" cellspacing="0" width="90%">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${brands}" var="brand" varStatus="status">
        <tr align="center">
                <%--<td>${brand.id}</td>--%>
            <td>${status.count}</td>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>
            <c:if test="${brand.status == 1}">
                <td>启用</td>
            </c:if>
            <c:if test="${brand.status != 1}">
                <td>禁用</td>
            </c:if>
            <td><input type="button" id="update" value="修改" onclick="update(${brand.id})">
            <input type="button" id="delete" value="删除" onclick="del(${brand.id})"></td>
        </tr>
    </c:forEach>
</table>

<script>
    document.getElementById("add").onclick = function () {
        location.href = "/brandemo/addBrand.jsp";
    }
    function update(id) {
        location.href = "/brandemo/selectByIdServlet?id=" + id;
    }
    function del(id) {
        if(confirm("你确定要删除吗？")){
            location.href = "/brandemo/deleteByIdServlet?id=" + id;
        }else {
            alert("已经取消删除！");
        }
    }

</script>
</body>
</html>