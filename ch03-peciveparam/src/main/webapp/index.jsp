<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>提交参数给Controller</p>

<form action="receiveproperty.do" method="post">
    姓名：<input type="text" name="name">
    <br/>
    年龄：<input type="text" name="age">
    <input type="submit" value="提交参数">
</form>
<br/>
<p>请求参数名和处理器方法的参数名不一样</p>
<form action="receiveparam.do" method="post">
    姓名：<input type="text" name="rname">
    <br/>
    年龄：<input type="text" name="rage">
    <input type="submit" value="提交参数">
</form>
<p>java对象强求接收参数</p>
<form action="receiveobject.do" method="post">
    姓名：<input type="text" name="name">
    <br/>
    年龄：<input type="text" name="age">
    <input type="submit" value="提交参数">
</form>
</body>
</html>
