package com.xqr.Handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

//拦截器类，拦截用户请求
public class MyInterceptor implements HandlerInterceptor {
    private long btime=0;
    //预处理方法
    //参数：Object handler:被拦截的控制器对象
    //返回值boolean
    //控制器方法之前执行（dosome）
    //验证请求信息
     /*
    preHandle返回true
    拦截器preHandle方法
    执行MyController中的doSome方法
    拦截器postHandle方法
    拦截器afterCompletion方法
    * */
    /*
    preHandle返回false请求截至
    拦截器preHandle方法
    * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        btime=System.currentTimeMillis();
        System.out.println("拦截器preHandle方法");
        //给浏览器反馈
        return true;
    }
    //后处理方法
    //拦截对象为:Object handler:Controller对象
    //处理方法返回值
    //
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mv) throws Exception {
        System.out.println("拦截器postHandle方法");
        //对原来的dosome执行结果调整
        if(mv!=null){
            mv.addObject("mydate",new Date());
            //修改视图
            mv.setViewName("other");
        }
     }
    /*
    afterCompletion：最后执行
    Exception ex：异常
    1.请求处理完成后执行，一般为视图处理后
    2.一般做资源回收
    * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器afterCompletion方法");
        long etime=System.currentTimeMillis();
        System.out.println("计算从perhandler到请求处理完成的时间："+(etime-btime));
    }
}
