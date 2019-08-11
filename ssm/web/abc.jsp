<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-5-30
  Time: 0:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>ssm</title>
</head>
<body>
<h1>aaaaa</h1>
<table>
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>余额</td>
    </tr>
    <c:forEach items="${itmesList}" var="abc">
        <tr>
            <td>${abc.id}</td>
            <td>${abc.nameA}</td>
            <td>${abc.moneyA}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
