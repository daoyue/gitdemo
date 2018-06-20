package com.example.gitdemo.teststream.testmap;

import com.example.gitdemo.domain.Person;
import com.example.gitdemo.domain.Student;

/**
 * @author yanchen
 * @data 2018-06-03
 **/
public class MapHelp {



    public static Student mapStudent(Student student,Person person){
        Student student1 = new Student();
        student1.setName(person.getName());
        student1.setAge(person.getAge());

        return student1;
    }

    public static Student mapStudent2(Student student){
        Student student1 = new Student();
        student1.setName("v");
        student1.setAge(7);

        return student1;
    }

    public static Student mapStudent3(Student student){
        Student student1 = new Student();
        student1 = student;
        if(student1.getAge() == 1){
            return student1;
        }
        return null;

    }


}
