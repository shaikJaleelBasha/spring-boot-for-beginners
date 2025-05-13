package com.sjb.crash_course.service;


import com.sjb.crash_course.entities.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(

                new Student(
                        "jaleel",
                        "basha",
                           LocalDate.now(),
                        "jaleel@gmail.com",
                        21
                ),

                new Student(
                        "nis=ar",
                        "basha",
                           LocalDate.now(),
                        "jaleel@gmail.com",
                        21
                )
        );
    }
}
