package com.sjb.crash_course.service;

import com.sjb.crash_course.entities.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAllStudents();

    public Student saveStudent(Student s);

    public Student findByEmail(String email);


    public Student deleteStudent(String email);

    Student updateStudent(Student s);
}
