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
    <title>Hello</title>
</head>
<body>
<h1>File</h1>
${filePo.description}
${filePo.file.originalFilename}
</body>
</html>
