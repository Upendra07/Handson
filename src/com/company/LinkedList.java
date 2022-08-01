package com.company;

public class LinkedList {

    Node head;

     class Node{
        String data;
        Node next;

        Node(String data){
          this.data = data;
        }
    }



    public void addFirst(String data){

        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;


    }

    public void addLast(String data){
         Node node = new Node(data);
         if(head == null){
             head = node;
             return;
         }

         Node currentNode = head;
         while (currentNode.next != null){
             currentNode = currentNode.next ;
         }
         currentNode.next = node;
    }

    public void printList(){

        if(head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node current = head;
        while (current != null){
            System.out.print(current.data + "->");

            current = current.next;
        }
        System.out.println("NULL");
    }

    public void removeFirst(){
         if(head == null){
             System.out.println("Linked list is empty");
             return;
         }

         if(head.next == null){
             head = null;
             return;
         }

         head.next = head;

    }

    public void removeLast(){

         if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node current = head;
        Node secondlast =null;

        while (current.next != null){
            secondlast = current;
            current = current.next;
        }

        secondlast.next = null;
    }

}
