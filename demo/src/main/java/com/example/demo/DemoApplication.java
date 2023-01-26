package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.*;

@SpringBootApplication
public class DemoApplication {

    //comment
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(1L);
        ArrayList<String> listStr = new ArrayList<>();
        arrayList.forEach(y -> listStr.add(String.valueOf(y)));
        //System.out.println("listStr = " + listStr);
        arrayList.remove(0);
        //System.out.println(listStr);

        List<String> list = new ArrayList<>();
        list.add("Sebastian");


        String str = "HOLA";

        List<String> listita = new ArrayList<>(Collections.singletonList(str));
        listita.add(String.valueOf(1L));
        //System.out.println("listita = " + listita);

        Object obj = new Object();
        ArrayList<Object> arrayObj = new ArrayList<>();
        arrayObj.add(obj);
        arrayObj.add(1);
        System.out.println("obj = " + arrayObj);
    }

}


