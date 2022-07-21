package com.company.PracticePrograms.Strings;


import java.util.HashMap;
import java.util.LinkedHashMap;

//count number of occurances of a character in string
public class Question1String {
    public static void main(String[] args) {
        String str = "mississippi";

        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();

        for(char c: str.toCharArray()){

            if (hashMap.containsKey(c)){

                hashMap.replace(c,hashMap.get(c)+1);

            }else{

                hashMap.put(c,1);

            }

        }

        System.out.println(hashMap);
    }

}
