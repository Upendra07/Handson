package com.company;


import com.company.Pojo.Student;

public class Main {


    public static void main(String[] args) {

//        //ArrayList
//        ArrayListPractice.addElements();
//        ArrayListPractice.printElements();
//
//        System.out.println("________________________________");
//        System.out.println(ArrayListPractice.sortElementsAsc());
//        System.out.println("________________________________");
//        System.out.println(ArrayListPractice.sortElementsDsc());
//        ArrayListPractice.methodsONArrayList();
//        ArrayListPractice.sortUsingComparator();


//          //Linked List
//
//        LinkedListPractice.addElements();
//        LinkedListPractice.linkedListSpecific();
//        LinkedListPractice.interate();

        //Queue

//        PriorityQueuePractice.QueueSpecific();
//        ArrayDequePractice.dequeMethods();


        Student s = new Student(100,"Upendra");
        method(s);
        System.out.println(s.getName());

    }

    public static void method(Student s){
        s.setName("Yateesh");
        System.out.println(s.getRollNo());

    }
}
