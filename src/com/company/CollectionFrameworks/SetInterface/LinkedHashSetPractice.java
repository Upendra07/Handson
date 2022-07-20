package com.company.CollectionFrameworks.SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

//Maintains insertion order in set
public class LinkedHashSetPractice {
    static Set<String> lHashSet = new LinkedHashSet<>();

    public static void addElements(){
        lHashSet.add("Upendra");
        lHashSet.add("Anjana");
        lHashSet.add("Upendra");
        lHashSet.add("Yateesh");
    }

    public static void main(String[] args) {
        addElements();
        System.out.println(lHashSet);
    }

}
