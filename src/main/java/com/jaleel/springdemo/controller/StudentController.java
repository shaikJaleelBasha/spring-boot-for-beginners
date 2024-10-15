package com.jaleel.springdemo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    //this is tightly coupled because we are creating the instance manually
    //private  StudentService = new StudentService();



//    this is field injection
//    @Autowired
//    private StudentService studentService;



    private StudentService studentService;

    //this is constructor injection it is highly recommended to use the constructor  injection instead of field injection
//    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }


   @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }
}
