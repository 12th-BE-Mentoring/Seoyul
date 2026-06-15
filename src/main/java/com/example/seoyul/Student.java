package com.example.seoyul;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id @GeneratedValue
    private Long id;

    private int classes;
    private String school;

    public Student(String school) {
        this.school = school;
    }

    public Student(Long id) {
        this.id = id;
    }

    public Student(String school , Long id, int classes) {
        this.school = school;
        this.id = id;
        this.classes = classes;
    }

    public Student(){

    }

    public Student(int classes) {
        this.classes = classes;
    }

    public void changeClass(int classes) {
        this.classes = classes;

    }

}
