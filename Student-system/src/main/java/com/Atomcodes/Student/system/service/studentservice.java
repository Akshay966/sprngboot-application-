package com.Atomcodes.Student.system.service;

import com.Atomcodes.Student.system.model.student;

import java.util.List;

public interface studentservice {
    public student savestudent(student Student);
    public List<student> getAllStudents();

}


