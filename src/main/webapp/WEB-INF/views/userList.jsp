<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2019-06-13/0013
  Time: 下午 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>用户列表</title>
</head>
<body>
<table>
    <c:forEach var="user"   items="${requestScope.userList}">
        <tr>
            <td><a href="${pageContext.request.contextPath}/user/getUserInfo?userName=${user.userName}">
                    ${user.userName}</a></td>
            <td>${user.name}</td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="${pageContext.request.contextPath}">返回首页</a>
</body>
</html>

