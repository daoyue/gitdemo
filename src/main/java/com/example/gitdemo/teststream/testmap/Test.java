package com.example.gitdemo.teststream.testmap;

import com.example.gitdemo.domain.OutStudent;
import com.example.gitdemo.domain.Person;
import com.example.gitdemo.domain.Student;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author yanchen
 * @data 2018-06-03
 **/
public class Test {

    public static void main(String[] args){

        Student student1 = new Student("a",3,7);
        Student student2 = new Student("n",3,6);
        Student student3 = new Student("a",2,3);
        Person person = new Person("c",3);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        List<String> strings1 = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        List<String> stringsAll = new ArrayList<>();
        strings1.add("a");
        strings1.add("b");
        strings2.add("a");
        strings2.add("b");
       strings2.removeAll(strings1);

        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        ids.add(2L);

        List<Long> newIds = ids.stream().distinct().collect(Collectors.toList());
        System.out.println(newIds);


        List<Student> result = new LinkedList<>();
        for (Student student : studentList) {
            boolean b = result.stream().anyMatch(u -> u.getName().equals(student.getName()));
            if (!b) {
                result.add(student);
            }
        }

        List<Student> studentList1 = studentList.stream()
                .map(MapHelp::mapStudent3)
                .filter(student->Objects.nonNull(student))
                .collect(Collectors.toList());
        System.out.println(studentList1);


        OutStudent outStudent1 = new OutStudent(student1);
        OutStudent outStudent2 = new OutStudent(student2);
        OutStudent outStudent3 = new OutStudent(student3);

        List<OutStudent> outStudentList = new ArrayList<>();
        outStudentList.add(outStudent1);
        outStudentList.add(outStudent2);
        outStudentList.add(outStudent3);

        Map<String,List<OutStudent>> mapOutStudent = outStudentList.stream().collect(Collectors.groupingBy(outStudent->outStudent.getStudent().getName(),Collectors.toList()));

        System.out.println(mapOutStudent);
    }



}
