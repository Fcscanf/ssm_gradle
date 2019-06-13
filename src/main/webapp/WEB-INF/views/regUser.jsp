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
    <title>用户注册</title>
</head>
<body>
<h3>用户注册</h3>    <br>
<form method="post" action="${pageContext.request.contextPath}/user/addUser">
    <table>
        <tr>
            <td><label>登录名：</label></td>
            <td><input type="text" name="userName"></td>
        </tr>
        <tr>
            <td><label>密码：</label></td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><label>真实姓名：</label></td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>

