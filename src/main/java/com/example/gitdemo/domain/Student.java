package com.example.gitdemo.domain;

/**
 * @author yanchen
 * @data 2018-06-03
 **/
public class Student {

    private String name;

    private Integer age;

    private Integer age2;

    public Student(){}

    public Student(String name,Integer age,Integer age2){
        this.name = name;
        this.age = age;
        this.age2 = age2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge2() {
        return age2;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }
}
