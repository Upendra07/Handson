package com.company.PracticePrograms.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//remove duplicate characters from string
public class Question3String {


    public static void main(String[] args) {
        String str = "javahava"; //a,v are repeated so they have to removed
        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();

        for(char c: str.toCharArray()){

            if (hashMap.containsKey(c)){

                hashMap.replace(c,hashMap.get(c)+1);

            }else{

                hashMap.put(c,1);

            }

        }


        for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
            if (entry.getValue()>1){
                str = str.replace(entry.getKey().toString(),"");
            }
        }

        System.out.println(str);

    }





}
