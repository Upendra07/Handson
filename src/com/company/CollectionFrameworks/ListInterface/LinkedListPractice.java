package com.company.CollectionFrameworks.ListInterface;

import com.company.Pojo.Student;

import java.util.*;
import java.util.stream.Collectors;


//Internal working is different from ArrayList, have some specific methods from Queue Interface.
// All the methods of ArrayList are also applicable for LinkedList

public class LinkedListPractice {

    static LinkedList<Student> students = new LinkedList<>();

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

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getRollNo() - o1.getRollNo();
            }
        });

        System.out.println("Sort using comparotor");
        System.out.println(students);

    }


    public static void linkedListSpecific(){

        System.out.println(students.peek());
        students.addFirst(new Student(8,"XYZ"));
        students.removeFirst();
        //Likewise removeLast() and addLast() are also there. Helpful in implementing stack data structure

    }

    static public void interate(){

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
