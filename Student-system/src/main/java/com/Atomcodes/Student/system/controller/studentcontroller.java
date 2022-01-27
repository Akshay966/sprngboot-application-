package com.Atomcodes.Student.system.controller;

import com.Atomcodes.Student.system.model.student;
import com.Atomcodes.Student.system.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentcontroller {
    @Autowired
    private studentservice studentservice;


    @PostMapping("/add")
    public String add(@RequestBody student student){
        studentservice.savestudent(student);
        return "New student is added";
    }
    @GetMapping("/getAll")
    public List<student> getAllStudents(){
        return studentservice.getAllStudents();
    }
}

