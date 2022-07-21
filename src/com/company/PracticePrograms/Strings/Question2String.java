package com.company.PracticePrograms.Strings;


import java.util.HashMap;
import java.util.LinkedHashMap;

//Find maximum occuring character in string

public class Question2String {
    public static void main(String[] args) {
        String str = "Java";

        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();

        for(char c: str.toCharArray()){

            if (hashMap.containsKey(c)){

                hashMap.replace(c,hashMap.get(c)+1);

            }else{

                hashMap.put(c,1);

            }

        }

        hashMap.entrySet().stream()
                .reduce((e1,e2)-> e1.getValue()>e2.getValue() ? e1 : e2)
                .ifPresent(System.out::println);

    }


    public static char getMaxOccuringChar(String line)
    {
        HashMap<Character,Integer> hMap = new HashMap<>();


        for(char c: line.toCharArray()){
            if(!hMap.containsKey(c)){
                hMap.put(c,0);
            }else{
                hMap.put(c,hMap.get(c)+1);
            }
        }


        return hMap.entrySet().stream().max((e1,e2)->e1.getValue()-e2.getValue()).get().getKey();


    }
}
