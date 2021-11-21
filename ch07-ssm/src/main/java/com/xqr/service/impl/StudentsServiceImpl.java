package com.xqr.service.impl;

import com.xqr.dao.StudentsDao;
import com.xqr.domain.Students;
import com.xqr.service.StudentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentsServiceImpl implements StudentsService {
    @Resource
    private StudentsDao studentsDao;
    @Override
    public int addStudents(Students students) {
        int num=studentsDao.insertStudents(students);
        return num;
    }

    @Override
    public List<Students> findStudents() {

        return studentsDao.selectStudents();
    }
}
