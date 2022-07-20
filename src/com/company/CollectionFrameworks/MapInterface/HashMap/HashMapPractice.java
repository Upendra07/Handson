package com.company.CollectionFrameworks.MapInterface.HashMap;

import com.company.CollectionFrameworks.ListInterface.ArrayListPractice;
import com.company.Pojo.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapPractice {

    static Map<Integer, Student> studentMap = new HashMap<>();

    public static void addToMap(){

        studentMap.put(1,new Student(1,"Upendra"));
        studentMap.put(2,new Student(2,"Anjana"));
        studentMap.put(3,new Student(3,"Yateesh"));
        studentMap.put(4,new Student(4,"Kiran"));

    }

    public static void iterateOverMap(){

        for (Map.Entry<Integer,Student> entry: studentMap.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }

    public static void iterateUsingForeach(){

        studentMap.forEach((key,value)-> System.out.println(key + " - " +value));

    }

    public static void methods(){


        System.out.println(studentMap.containsKey(1));
        System.out.println("__________________________________________");
        System.out.println(studentMap.values());
        System.out.println("__________________________________________");
        System.out.println(studentMap.keySet());


    }

    public static Map<Integer, Student> SortWithValues(){

        return  studentMap.entrySet()
              .stream()
              .sorted((e1,e2) -> e1.getValue().getName()
                      .compareTo(e2.getValue().getName()))
                      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new
              ));

    }

   public static void listToMap(){
        Map<Integer,String> sMap = ArrayListPractice.students.stream()
                .collect(Collectors.toMap(
                        Student::getRollNo,
                        Student::getName,
                        (student1,student2) -> student2,
                        LinkedHashMap::new
                ));
       System.out.println(sMap);
   }

    public static void main(String[] args) {
        addToMap();
        System.out.println("__________________________________________");
        System.out.println(studentMap);

        System.out.println("__________________________________________");
        iterateOverMap();

        System.out.println("__________________________________________");
        iterateUsingForeach();

        System.out.println("__________________________________________");
        methods();

        System.out.println("__________________________________________");

        System.out.println("Sort with values");
        System.out.println(SortWithValues());

        System.out.println("___________________________________________");
        listToMap();
    }

}
