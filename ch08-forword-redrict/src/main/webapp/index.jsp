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
<p>ModeadnView实现forward</p>
<form action="doForward.do" method="post">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="submit" value="提交请求">
</form>
<br/>
<p>ModeadnView实现redirect</p>
<form action="doRedirect.do" method="post">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="submit" value="提交请求">
</form>

</body>
</html>
