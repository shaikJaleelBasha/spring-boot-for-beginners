package com.sjb.crash_course.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class MyController {

    @GetMapping("/")
    public List<String> findAllStudents(){
        return  List.of(
                "jaleel",
                "22"
        );
    }

}
