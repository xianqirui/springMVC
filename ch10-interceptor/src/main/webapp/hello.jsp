<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>/hello.jsp从request作用域返回结果</h3>
<h3>姓名：${param.myname}</h3>
<h3>年龄：${param.myage}</h3>
<h3>取数据：<%=request.getParameter("myname")%></h3>

</body>
</html>
