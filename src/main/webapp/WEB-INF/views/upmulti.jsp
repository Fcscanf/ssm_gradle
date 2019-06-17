<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2019-06-17/0017
  Time: 下午 20:32
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
    <title>多文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/up/multifiles" method="post" enctype="multipart/form-data">
    <input type="file" name="files"><br />
    <input type="text" name="descriptions">
    <input type="file" name="files"><br />
    <input type="text" name="descriptions">
    <input type="file" name="files"><br />
    <input type="text" name="descriptions">
    <input type="submit" name="提交">
</form>
</body>
</html>
