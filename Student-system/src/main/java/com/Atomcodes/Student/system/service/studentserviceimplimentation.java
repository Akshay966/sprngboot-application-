package com.Atomcodes.Student.system.service;

import com.Atomcodes.Student.system.model.student;
import com.Atomcodes.Student.system.repository.studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentserviceimplimentation implements studentservice{

    @Autowired
    private studentrepository studentrepository;

    @Override
    public student savestudent(student Student) {
        return studentrepository.save(Student);
    }

    @Override
    public List<student> getAllStudents() {
        return studentrepository.findAll();
    }
}


