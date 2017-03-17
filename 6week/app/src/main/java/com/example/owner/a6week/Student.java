package com.example.owner.a6week;

public class Student {
    private String Name;
    private String Age;

    public Student(String name,String age) {
        this.Name = name;
        this.Age = age;
    }

    public String getStudentname() {

        return this.Name;
    }
    public String getStudentage() {

        return this.Age;
    }
}
