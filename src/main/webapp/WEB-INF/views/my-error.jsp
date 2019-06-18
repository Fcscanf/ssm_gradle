<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2019-06-18/0018
  Time: 上午 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>自定义异常处理</title>
</head>
<body>
<h1>自定义异常处理</h1>
${ex}
<%--页面打印错误日志信息--%>
<%exception.printStackTrace(response.getWriter());%>
</body>
</html>
