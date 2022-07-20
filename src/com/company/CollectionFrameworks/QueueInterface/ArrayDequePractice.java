package com.company.CollectionFrameworks.QueueInterface;


import com.company.Pojo.Student;

import java.util.ArrayDeque;
import java.util.Deque;

//Unlike PriorityQueue using Queue interface,
// in ArrayDeque using Deque interface can make addition or deletion from both the ends of queue
public class ArrayDequePractice {


    static  Deque<Student> deque = new ArrayDeque<>();


    static public void dequeMethods(){

        deque.add(new Student(4,"Upendra"));
        deque.add(new Student(2,"Anjana"));
        deque.offer(new Student(3,"Yateesh"));
        deque.add(new Student(1,"KD"));

        deque.peek();
        deque.peekFirst();
        deque.peekLast();
        deque.addFirst(new Student(87,"Alien"));
        deque.addLast(new Student(88,"JamesWebb"));

        System.out.println("-----------------------------------");
        System.out.println(deque.poll());
        System.out.println("-----------------------------------");
        deque.forEach(System.out::println);

    }



}
