package com.xqr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*
@RequestMapping:
value；所有类的公共部分
* */

//@RequestMapping(value = "/test")
@Controller
public class Mycontroller {
    /*处理器方法返回String*/
    @RequestMapping(value = "/some")
    public ModelAndView doSome(String name, Integer age){
        System.out.println("姓名："+name+"  "+"年龄："+age);
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }
}
