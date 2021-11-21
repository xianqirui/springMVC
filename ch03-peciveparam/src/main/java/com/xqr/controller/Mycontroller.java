package com.xqr.controller;

import com.xqr.ov.Student;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/*
@RequestMapping:
value；所有类的公共部分
* */

//@RequestMapping(value = "/test")
@Controller
public class Mycontroller {
    /*实现逐个接收参数*/
    @RequestMapping(value = "/receiveproperty.do")
    public ModelAndView doSome(String name,Integer age){
        System.out.println("姓名："+name+"年龄："+age);
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("mygae",age);
        mv.setViewName("show");
        return mv;
    }
    /*
    请求中参数名和形参名不一样
    使用校正请求参数名@RequestParam
    使用位置，处理器方法的形参定义的前面
    required = false表示也可以没有参数
    * */
    @RequestMapping(value = "/receiveparam.do")
    public ModelAndView receive(@RequestParam(value = "rname",required = false)String name,
                                @RequestParam(value = "rage",required = false)Integer age){
        System.out.println("姓名："+name+"年龄："+age);
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }
    /*
    处理器方法形参名是对象
    * */
    @RequestMapping(value = "/receiveobject.do")
    public ModelAndView receiveobject(Student mystudent){
        System.out.println("姓名："+mystudent.getName()+"年龄："+mystudent.getAge());
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",mystudent.getName());
        mv.addObject("myage",mystudent.getAge());
        mv.addObject("mystudent",mystudent);
        mv.setViewName("show");
        return mv;
    }

}
