package com.company.CollectionFrameworks.ListInterface;

import com.company.Pojo.Student;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListPractice {

    //creating arrayList
    public static ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student(1,"Upendra"),
            new Student(2,"Anjana")));

    //adding elements

   public static void addElements(){
       students.add(new Student(3,"Kiran"));
       students.add(new Student(4,"Yateesh"));
   }

   public static void  printElements(){

       System.out.println("---------------------------");
       students.forEach(System.out::println);

   }

   public static List<Student> sortElementsDsc(){
       return  students.stream().sorted((s1,s2)-> s2.getRollNo()-s1.getRollNo()).collect(Collectors.toList());
   }

    public static List<Student> sortElementsAsc(){
        return  students.stream().sorted((s1,s2)-> s1.getRollNo()-s2.getRollNo()).collect(Collectors.toList());
    }

    public static void methodsONArrayList(){

        Set<Student> studentsSet = new HashSet<>(Arrays.asList(new Student(5,"Harsh"),new Student(6,"PS")));
        students.addAll(studentsSet);
        printElements();
        students.remove(students.size()-1);
        printElements();
        students.remove(new Student(5,"Harsh"));
        printElements();
        students.set(3,new Student(4,"Bhatta"));
        printElements();
    }

    public static void sortUsingComparator(){

       Collections.sort(students, new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o2.getRollNo() - o1.getRollNo();
           }
       });

        System.out.println("Sort using comparotor");


        System.out.println(students);


    }


    public static void interateArrayList(){
       Iterator<Student> interator = students.iterator();
       while (interator.hasNext()){
           System.out.println(interator.next());
       }
    }

    public static void listIteratorDemo(){

       ArrayListPractice.addElements();
       ListIterator<Student> listIterator = students.listIterator();

       if(listIterator.hasNext()){
           if (listIterator.next().getName().equals("Upendra")){
               listIterator.set(new Student(1,"UpendraReplaced"));
           }
       }

        System.out.println(students);

    }

    public static void main(String[] args) {
        listIteratorDemo();
    }
}
