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
    <title>Title</title>
</head>
<body>
<h1>aaaaa</h1>
<table>
    <tr>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <c:forEach items="${itmesList}" var="abc">
        <tr>
            <td>${abc.name}</td>
            <td>${abc.age}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
