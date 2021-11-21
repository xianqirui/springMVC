package com.xqr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


/*
创建处理器对象，放在springmvc容器中
* */
@Controller
public class Mycontroller {
    /*
    处理用户的请求,springmvc使用方法来处理
    * */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
            /*处理some.do的请求*/
        //调用service处理，把处理结果放到返回值ModelAndView
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doSome方法");
        //指定视图
       // mv.setViewName("/WEB-INF/view/show.jsp");
        //但配置了视图解析器后，可用逻辑名指定视图
        mv.setViewName("show");


        return mv;
    }
    @RequestMapping(value = "/other.do")
    public ModelAndView doOther(){
        /*处理some.do的请求*/
        //调用service处理，把处理结果放到返回值ModelAndView
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doSome方法");
        //指定视图
        // mv.setViewName("/WEB-INF/view/show.jsp");
        //但配置了视图解析器后，可用逻辑名指定视图
        mv.setViewName("other");

        //mv.setView(new RedirectView("/a.jsp"));

        return mv;
    }
}
