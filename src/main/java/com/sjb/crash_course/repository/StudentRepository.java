package com.sjb.crash_course.repository;

import com.sjb.crash_course.entities.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class StudentRepository {

    private final List<Student> STUDENT = new ArrayList<>();

    public List<Student> findAllStudents(){
        return STUDENT;
    }


    public Student saveStudent(Student s) {
         STUDENT.add(s);
         return  s;

    }


    public Student findByEmail(String email) {
    return STUDENT.stream()
                  .filter(s -> email.equals(s.getEmail()))
                  .findFirst() // Retrieves the first matching student, if any
                  .orElse(null); // Returns null if no student is found
}


    public void deleteStudent(String email) {

        var student = findByEmail(email);
        STUDENT.remove(student);

    }


    public Student updateStudent(Student s) {
        var studentIndex = IntStream.range(0, STUDENT.size()).filter(i->STUDENT.get(i).getEmail().equals(s.getEmail())).findFirst().orElse(-1);
        if(studentIndex > -1){
            STUDENT.set(studentIndex, s);
        }
        return s;
    }



}
