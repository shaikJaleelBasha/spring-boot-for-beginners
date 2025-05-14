package com.sjb.crash_course.service;


import com.sjb.crash_course.entities.Student;
import com.sjb.crash_course.repository.StudentDbRepo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Primary
public class DbStudentService implements StudentService{

    private final StudentDbRepo repo;

    public DbStudentService(StudentDbRepo repo) {
        this.repo = repo;
    }


    public List<Student> findAllStudents() {
        return repo.findAll();
    }

    public Student saveStudent(Student s) {
        return repo.save(s);
    }

    public Student findByEmail(String email) {
        return repo.findByEmail(email);
    }


    public void deleteStudent(String email) {
        repo.deleteByEmail(email);  // Corrected the method call here
    }

   public  Student updateStudent(Student s){
        return repo.save(s);
    }
    // Define methods specific to DbStudentService if needed
}

