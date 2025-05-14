package com.sjb.crash_course.service;


import com.sjb.crash_course.entities.Student;
import com.sjb.crash_course.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpleService implements StudentService {

    private final StudentRepository studentRepository;

    public StudentImpleService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> findAllStudents(){
        return this.studentRepository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student s) {
        return this.studentRepository.saveStudent(s);
    }

    @Override
    public Student findByEmail(String email) {
        return this.studentRepository.findByEmail(email);
    }

    @Override
    public void deleteStudent(String email) {

        this.studentRepository.deleteStudent(email);

    }

    @Override
    public Student updateStudent(Student s) {
        return this.studentRepository.updateStudent(s);
    }
}
