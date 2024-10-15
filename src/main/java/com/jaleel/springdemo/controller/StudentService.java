package com.jaleel.springdemo.controller;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
            new Student(
                    "Jaleel",
                    "Basha",
                    LocalDate.now(),
                    "jaleelbashashaik18@gmail.com",
                    34
            ),
                new Student(
                        "vamsi hima",
                        "krishna",
                        LocalDate.now(),
                        "vamsikrishna19@gmai.com",
                        23
                ),
                new Student(
                        "student 3",
                        "krishna",
                        LocalDate.now(),
                        "vamsikrishna19@gmai.com",
                        23
                )

        );
    }
}

