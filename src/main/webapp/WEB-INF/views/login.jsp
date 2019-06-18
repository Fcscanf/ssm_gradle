<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2019-06-13/0013
  Time: 下午 20:15
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
    <title>登录页面</title>
</head>
<body>
<h3>用户登录</h3>  <br>
<form name="form1" method="post" action="${pageContext.request.contextPath}/user/validateUser">
    <table>
        <tr>
            <td><label>用户名：</label></td>
            <td><input type="text" name="userName"></td>
        </tr>
        <tr>
            <td><label>密码：</label></td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="登录"></td>
            <td><a href="${pageContext.request.contextPath}">返回首页--${key}</a></td>
        </tr>
    </table>
</form>
</body>
</html>

