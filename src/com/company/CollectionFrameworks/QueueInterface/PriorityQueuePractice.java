package com.company.CollectionFrameworks.QueueInterface;

import com.company.Pojo.Student;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {

    static Queue<Student> students = new PriorityQueue<>();


   public static void QueueSpecific(){

       students.offer(new Student(3,"Shreemati"));
       students.offer(new Student(1,"Upendra"));
       students.offer(new Student(2,"Anjana"));

       System.out.println(students.poll());
       System.out.println(students.poll());


       System.out.println("-----------------");

        students.forEach(System.out::println);

        //System.out.println(students.peek());

//       System.out.println(students.peek());
//       System.out.println(students.element());
//       System.out.println("-----------------");
//       students.forEach(System.out::println);

    }

}
