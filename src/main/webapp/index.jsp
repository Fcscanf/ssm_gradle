<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2019-06-13/0013
  Time: 下午 15:40
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
      <title>首页</title>
  </head>
  <body>
  <div style="position:absolute;left:200px;top:100px">
      <a href="${pageContext.request.contextPath}/user/regUser">用户注册</a><br/><br/>
      <a href="${pageContext.request.contextPath}/user/login">用户登录</a> <br><br>
      <a href="${pageContext.request.contextPath}/user/userlist">用户列表</a>
  </div>
  </body>
</html>
