package com.sjb.crash_course.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/add_two_num")
    public int addTwoNumbers(@RequestParam int a, @RequestParam int b){

        return a+b;

    }
}
