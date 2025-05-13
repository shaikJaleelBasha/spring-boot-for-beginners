package com.sjb.crash_course.controllers;


import com.sjb.crash_course.entities.Student;
import com.sjb.crash_course.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class MyController {

    private StudentService studentService;

    @Autowired
    public MyController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> findAllStudents(){
        return  studentService.findAllStudents();
    }

}
