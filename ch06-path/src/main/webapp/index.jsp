<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>解决路径问题</title>
    <%--<base href="http://localhost:8080/ch06_path/" />--%>
    <%--动态获取 ↓--%>
    <base href="<%=basePath%>" />
</head>
<body>
<p>第一个springmvc项目</p>
<%--不加/的解决方法<p><a href="${pageContext.request.contextPath}/test/some.do">发起some.do的get请求</a> </p>
<br/>--%>
<p><a href="test/some.do">发起some.do的get请求</a> </p>
<br/>

</body>
</html>
