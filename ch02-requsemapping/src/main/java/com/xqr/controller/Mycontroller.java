package com.xqr.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/*
@RequestMapping:
value；所有类的公共部分
* */

@RequestMapping(value = "/test")
@Controller
public class Mycontroller {
    /*
    @RequestMapping;请求映射
    属性 methed 表示请求的方式
    * */
    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
            /*处理some.do的请求*/
        //调用service处理，把处理结果放到返回值ModelAndView
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doSome方法");

        mv.setViewName("show");


        return mv;
    }
    @RequestMapping(value = "/other.do",method = RequestMethod.POST)
    public ModelAndView doOther(){

        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doSome方法");
        //指定视图
        // mv.setViewName("/WEB-INF/view/show.jsp");
        //但配置了视图解析器后，可用逻辑名指定视图
        mv.setViewName("other");
        return mv;
    }
    @RequestMapping(value = "/first.do")
    public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response,
                                HttpSession session){

        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发,你好"
                +request.getParameter("name"));
        mv.addObject("fun","执行的是doSome方法");
        //指定视图
        // mv.setViewName("/WEB-INF/view/show.jsp");
        //但配置了视图解析器后，可用逻辑名指定视图
        mv.setViewName("other");
        return mv;
    }
}
