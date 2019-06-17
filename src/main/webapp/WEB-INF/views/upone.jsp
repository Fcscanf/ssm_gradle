<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2019-06-17/0017
  Time: 下午 20:33
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
    <title>单文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/up/onefile" method="post" enctype="multipart/form-data">
    <input type="file" name="file"><br />
    <input type="text" name="description">
    <input type="submit" name="提交">
</form>
</body>
</html>
