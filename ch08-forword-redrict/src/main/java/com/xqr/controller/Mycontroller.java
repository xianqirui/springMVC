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

//转发
@Controller
public class Mycontroller {

    @RequestMapping(value = "/doForward.do")
    public ModelAndView doForward(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doSome方法");
        //forward显示转发，解决转发到没在视图解析器中的页面，不受解析器的限制
        mv.setViewName("forward:/WEB-INF/view/show.jsp");
        return mv;
    }
    //重定向在hello.jsp中使用${param.myname}获取数据
    @RequestMapping(value = "/doRedirect.do")
    public ModelAndView doRedirect(String name,Integer age){
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        //forward显示转发，解决转发到没在视图解析器中的页面，不受解析器的限制
        mv.setViewName("redirect:/hello.jsp");
        return mv;
    }

}
