package com.example.gitdemo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yanchen
 * @data 2018-05-25
 **/
public class MapTest {

    public static void main(String args[]){

        Map<List<Integer>,String> maps = new HashMap<>();



        List<Integer> ints1 = new ArrayList<>();
        ints1.add(11);
        ints1.add(12);
        ints1.add(13);
        ints1.add(14);
        maps.put(ints1,"一");

        List<Integer> ints2 = new ArrayList<>();
        ints2.add(21);
        ints2.add(22);
        ints2.add(23);
        ints2.add(24);
        maps.put(ints2,"二");

        List<Integer> ints3 = new ArrayList<>();
        ints3.add(31);
        ints3.add(32);
        ints3.add(33);
        ints3.add(34);
        maps.put(ints3,"三");

        List<Integer> ints4 = new ArrayList<>();
        ints4.add(41);
        ints4.add(42);
        ints4.add(43);
        ints4.add(44);
        maps.put(ints4,"四");




        maps.forEach((k,v)->{

            System.out.println("aaaaaaaaaa");


        });

















































    }








}
