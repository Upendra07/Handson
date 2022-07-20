package com.company.Java8;

import java.util.StringJoiner;

public class StringJoinerPractice {



    public static void main(String[] args) {
        StringJoiner myString = new StringJoiner(" ","(",")");
        myString.add("This");
        myString.add("is");
        myString.add("Nextuple");

        System.out.println(myString.toString());
    }

}
