<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function (){
            $("button").click(function () {
                //alert("button click");
                $.ajax({
                    url:"doreturnStingData.do",
                    data:{
                        name:"zhangsan",
                        age:20
                    },
                    type:"post",
                    //dataType:"json",
                    success:function (resp) {
                      /*  //从服务器端返回的是json的字符串
                        //jquery会把字符串转换为json对象，赋值个resp
                        //alert(resp.name+"  "+resp.age);
                        $.each(resp,function (i,n) {
                            alert(n.name+"  "+n.age)

                        })*/
                        alert("返回的是文本数据："+resp);
                    }
                })
            })
        })

    </script>
    <%--使用注解--%>
    <%--<script type="text/javascript">
        $(function () {
            $("button").click(function (){
                $.ajax({
                    url:"doStduentjson.do",
                    success:function (data) {
                        alert(data.name+"  "+data.age)
                    }
                })
            })

        })
    </script>--%>

</head>
<body>
<p>处理器方法返回String</p>
<form action="return-viw.do" method="post">
    姓名：<input type="text" name="name">
    <br/>
    年龄：<input type="text" name="age">
    <input type="submit" value="提交参数">
</form>
<p>视图完整路径</p>
<form action="return-String.do" method="post">
    姓名：<input type="text" name="name">
    <br/>
    年龄：<input type="text" name="age">
    <input type="submit" value="提交参数">
</form>
<br/>
<br/>
<button id="btn">发起ajax请求</button>

</body>
</html>
