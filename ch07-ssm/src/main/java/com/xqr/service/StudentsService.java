package com.xqr.service;

import com.xqr.domain.Students;

import java.util.List;

public interface StudentsService {
    int addStudents(Students students);
    List<Students> findStudents();
}
