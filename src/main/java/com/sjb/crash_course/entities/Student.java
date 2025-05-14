package com.sjb.crash_course.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;


    private LocalDate dob;


    private String email;

    private int age;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    // Ensure the date format is correctly parsed if you're passing it as a string
    public void setDob(String dob) {
        this.dob = LocalDate.parse(dob);
        calculateAge();
    }

    public int getAge() {
        return age;
    }

    private void calculateAge() {
        if (dob != null) {
            this.age = Period.between(dob, LocalDate.now()).getYears();
        }
    }

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(Integer id, String firstName, String lastName, LocalDate dob, String email, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.age = age;
    }
}
