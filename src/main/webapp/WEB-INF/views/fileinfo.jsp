<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ page import="org.springframework.web.multipart.MultipartFile" %>
<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2019-06-17/0017
  Time: 下午 20:30
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
    <title>文件信息</title>
</head>
<body>
<c:forEach items="${mutilFilePo.descriptions}" var="desc">
    ${desc}
</c:forEach>
${filePo.description}
${filePo.file.originalFilename}
${key}
</body>
</html>
