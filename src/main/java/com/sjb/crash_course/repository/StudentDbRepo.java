package com.sjb.crash_course.repository;

import com.sjb.crash_course.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  StudentDbRepo extends JpaRepository<Student, Integer>{
    void deleteByEmail(String email);

    Student findByEmail(String email);
}
