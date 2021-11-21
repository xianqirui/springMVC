package com.xqr.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xqr.ov.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
/*
@RequestMapping:
value；所有类的公共部分
* */

//@RequestMapping(value = "/test")
@Controller
public class Mycontroller {
    /*处理器方法返回String*/
    @RequestMapping(value = "/return-viw.do")
    public String doReturnviw(HttpServletRequest request,String name,Integer age){
        System.out.println("姓名："+name+"  "+"年龄："+age);
        //手工数据
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
        //show:逻辑视图名称
        return "show";
    }
//用String表示完整试图路径，不能有视图解析器
    @RequestMapping(value = "/return-String.do")
    public String doReturnviw2(HttpServletRequest request,String name,Integer age){
        System.out.println("姓名："+name+"  "+"年龄："+age);
        //手工数据
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
        //show:逻辑视图名称
        return "/WEB-INF/view/show.jsp";
    }
//返回值void，处理ajax请求
    @RequestMapping(value = "/returnVoid-ajax.do")
    public void doReturnVoidajax(HttpServletResponse response,String name,Integer age) throws IOException {
        System.out.println("==============ajax:姓名："+name+"  "+"年龄："+age);
     //处理ajax，使用json处理数据
        //service完成了
        Student student=new Student();
        student.setName(name);
        student.setAge(String.valueOf(age));
        String json="";
        if(student!=null){
            ObjectMapper om=new ObjectMapper();
            json=om.writeValueAsString(student);
            System.out.println("student转换的json==="+json);
        }
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw=response.getWriter();
        pw.println(json);
        pw.flush();
        pw.close();
    }
    //使用注解
    @ResponseBody
    @RequestMapping(value = "/doStduentjson.do")
    public Student doStduentjson(String name,Integer age){
        Student student=new Student();
        student.setName("张三");
        student.setAge(String.valueOf(19));
        return student;

    }
    //处理器返回值是集和
    @ResponseBody
    @RequestMapping(value = "/doStduentjsonArray.do")
    public List<Student> doStduentjsonObjectArray(String name, Integer age){
        List<Student> list=new ArrayList<>();

        Student student=new Student();
        student.setName("张三");
        student.setAge(String.valueOf(19));
        list.add(student);

         student=new Student();
        student.setName("李四");
        student.setAge(String.valueOf(28));
        list.add(student);
        return list;
    }
    /*处理器方法返回值string字符串数据*/
    /*区分返回的字符串是数据还是试图看是否有@ResponseBody
    * 有@ResponseBody是数据，反之视图*/
    //默认使用”text/plain;charset=ISO-8859-1“作为contextType，导致中文乱码
    @ResponseBody
    @RequestMapping(value = "/doreturnStingData.do",produces="text/plain;charset=utf-8")
    public String doStringDAta(String name,Integer age){
        return "hello SpringMVC 返回对象，数据";
    }

}
