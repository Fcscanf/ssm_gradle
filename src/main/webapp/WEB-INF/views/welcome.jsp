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
    <title>登录成功</title>
</head>
<body>
${requestScope.user.userName}登录成功！  <br><br>

<a href="${pageContext.request.contextPath}/user/userlist">
    查看用户列表</a> <br>

</body>
</html>

