package com.xqr.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/*
@RequestMapping:
value；所有类的公共部分
* */

//转发
@Controller
public class Mycontroller {


    @RequestMapping(value = "/some.do")
    public ModelAndView dosome(String name,Integer age) {
        System.out.println("执行MyController中的doSome方法");
        //处理异常
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }


}
