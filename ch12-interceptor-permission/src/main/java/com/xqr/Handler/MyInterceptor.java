package com.xqr.Handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

//拦截器类，拦截用户请求
public class MyInterceptor implements HandlerInterceptor {
    //验证用户登录信息
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器1111-preHandle方法");
        String loginName="";
        //从session中获取值
        Object atter=request.getSession().getAttribute("name");
        if(atter!=null){
            loginName=(String)atter;
        }
        if (!"zs".equals(loginName)){
            request.getRequestDispatcher("/tips.jsp").forward(request,response);
            return false;
        }
        return true;

    }
}
