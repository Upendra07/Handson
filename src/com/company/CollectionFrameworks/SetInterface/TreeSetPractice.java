package com.company.CollectionFrameworks.SetInterface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {


    static Set<String> treeSet = new TreeSet<>();

    public static void addElements(){
       try {
           treeSet.add("Upendra");
           treeSet.add("Anjana");
           treeSet.add(null);
       }catch (NullPointerException e){
           System.out.println(e.toString());
       }
    }

    public static void main(String[] args) {

        addElements();
        System.out.println(treeSet);

    }

}
