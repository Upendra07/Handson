package com.company.CollectionFrameworks.SetInterface;

import com.company.Pojo.Student;

import java.util.HashSet;

public class HashSetPractice {

    static HashSet<String> strings = new HashSet<>();


    public static void addElements(){
        strings.add("Upendra");
        strings.add("Anjana");
        strings.add("Rock");
        strings.add("Upendra");
        strings.add(null);
    }



    public static void clearSet(){
        strings.clear();
    }

    public static void main(String[] args) {
        addElements();
        System.out.println(strings);
        clearSet();
        System.out.println(strings);
    }

}
