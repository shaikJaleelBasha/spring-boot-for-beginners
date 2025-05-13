package com.sjb.crash_course.controllers;


import com.sjb.crash_course.entities.Student;
import com.sjb.crash_course.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class MyController {

    private final StudentService studentService;

    @Autowired
    public MyController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> findAllStudents(){
        return  studentService.findAllStudents();
    }


    @PostMapping
    public Student save(@RequestBody Student s){
        studentService.saveStudent(s);
        return s;
    }

    @GetMapping("/{email}")
    public Student findEmail(@PathVariable("email") String email){
        return  studentService.findByEmail(email);
    }


    @DeleteMapping("/{email}")
    public Student  deleteStudent(@PathVariable("email") String email){
       return studentService.deleteStudent(email);
    }


    @PutMapping
    public Student updateStudent(@RequestBody Student s){

        return studentService.updateStudent(s);
    }



}
