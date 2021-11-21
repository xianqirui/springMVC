package com.xqr.controller;

import com.xqr.expection.AgeExpection;
import com.xqr.expection.MyUserExpection;
import com.xqr.expection.NameExpection;
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

    @RequestMapping(value = "/some.do")
    public ModelAndView dosome(String name,Integer age) throws MyUserExpection {
        //处理异常
        ModelAndView mv=new ModelAndView();

        //根据请求参数抛出异常
        if(!"zs".equals(name)){
            throw new NameExpection("姓名不正确！");
        }
        if(age==null||age>80){
            throw new AgeExpection("年龄比较大了！");
        }
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }


}
