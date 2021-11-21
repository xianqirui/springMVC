<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>功能整合</title>
</head>
<base href="<%=basePath%>" />
<body>
<div align="center">
    <p>ssm整合</p>
    <img src="img/下载.png">
    <table>
        <tr>
            <td><a href="addStudents.jsp">学生注册</a></td>
        </tr>
        <tr>
            <td><a href="listStudent.jsp">浏览学生</a> </td>
        </tr>
    </table>
</div>
</body>
</html>
