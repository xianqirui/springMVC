package com.xqr.handler;

import com.xqr.expection.AgeExpection;
import com.xqr.expection.NameExpection;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice:控制器增强,增加功能
@ControllerAdvice
public class GlobalExceptionHandler {
    /*
    处理异常的方法和控制器方法一样
    * */
    @ExceptionHandler(value = NameExpection.class)
    public ModelAndView doNameExpection(Exception exception){
        /*
        异常处理逻辑：
        1.记录异常，日志
        2.发送通知，把异常信息发给相关人员
        3.给用户友好提示
        * */
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","姓名必须为zs");
        mv.addObject("ex",exception);
        mv.setViewName("nameError");
        return mv;
    }

    @ExceptionHandler(value = AgeExpection.class)
    public ModelAndView doAgeExpection(Exception exception){
        /*
        异常处理逻辑：
        1.记录异常，日志
        2.发送通知，把异常信息发给相关人员
        3.给用户友好提示
        * */
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","年龄不能大于80");
        mv.addObject("ex",exception);
        mv.setViewName("ageError");
        return mv;
    }

    //处理其他异常，不知类型的异常
    @ExceptionHandler
    public ModelAndView doOtherExpection(Exception exception){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","姓名必须为zs");
        mv.addObject("ex",exception);
        mv.setViewName("defaultError");
        return mv;
    }
}
