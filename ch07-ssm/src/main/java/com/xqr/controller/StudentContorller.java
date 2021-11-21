package com.xqr.controller;

import com.xqr.domain.Students;
import com.xqr.service.StudentsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentContorller {
    @Resource
    private StudentsService service;
    @RequestMapping("/addStudnet.do")
    public ModelAndView addStudent(Students students){
        String tipe="注册失败";
        ModelAndView mv=new ModelAndView();
        //调用service处理studenets
        int i = service.addStudents(students);
        if(i>0){
            tipe="学生["+students.getName()+"]注册成功";
        }
        mv.addObject("tipe",tipe);
        mv.setViewName("result");
        return mv;
    }
    //处理查询,相应ajax
    @RequestMapping("/queryStudents.do")
    @ResponseBody
    public List<Students> queryStudents(){
    List<Students> student=service.findStudents();
    return student;
    }
}
