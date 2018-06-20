package com.example.gitdemo.domain;

/**
 * @author yanchen
 * @data 2018-06-03
 **/
public class OutStudent {

    private Student student;

    public OutStudent(){

    }

    public OutStudent(Student student){
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
