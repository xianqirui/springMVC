package com.xqr.dao;

import com.xqr.domain.Students;

import java.util.List;

public interface StudentsDao {
    int insertStudents(Students students);
    List<Students> selectStudents();
}
