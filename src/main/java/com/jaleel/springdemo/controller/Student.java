package com.jaleel.springdemo.controller;

import java.time.LocalDate;

public class Student {
    private String firstname;


    private String lastname;


    private LocalDate dateOdBirth;


    private String email;


    private int age;

    public Student() {

    }
    public Student(String firstName, String lastName, LocalDate dob, String email, int age) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.dateOdBirth = dob;
        this.email = email;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOdBirth() {
        return dateOdBirth;
    }

    public void setDateOdBirth(LocalDate dateOdBirth) {
        this.dateOdBirth = dateOdBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
