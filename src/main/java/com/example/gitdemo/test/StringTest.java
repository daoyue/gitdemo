package com.example.gitdemo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author yanchen
 * @data 2018-05-31
 **/
public class StringTest {

    public static void main(String[] args){
        Ponser ponser1 = new Ponser(1L,"a");
        Ponser ponser2 = new Ponser(3L,"b");
        Ponser ponser3 = new Ponser(2L,"c");
        Ponser ponser4 = new Ponser(1L,"d");


        List<Ponser> ponsers = new ArrayList<>();
        ponsers.add(ponser1);
        ponsers.add(ponser2);
        ponsers.add(ponser3);
        ponsers.add(ponser4);

        Map<Long,List<Ponser>> ponserMap =
                ponsers.stream()
                        .collect(Collectors.groupingBy(Ponser::getId,Collectors.toList()));


        String a = null;
    }

static class Ponser{

        private Long id ;
        private String name;

    Ponser(Long id,String name){
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


}
