package com.company;

import javax.sound.midi.MidiFileFormat;

public class BST {

    static class Node{
        int data;
        Node left;
        Node right;


        Node(int data){
            this.data = data;
        }

    }



    public static Node insertNode(Node root,int value){

        if(root == null){
            root = new Node(value);
            return root;
        }

        else if(value<root.data){

            root.left = insertNode(root.left,value);

        }else{

            root.right = insertNode(root.right,value);

        }

        return root;

    }

    public static void inOrder(Node root){

        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static boolean searchElement(Node root,int key){

        if (root == null){
            return false;
        }

        if(key == root.data){
            return true;
        }else if(key<root.data){
            return searchElement(root.left,key);
        }else {
            return searchElement(root.right,key);
        }


    }


    public static void main(String[] args) {

        Node root=null;

        int[] values = {5,1,3,4,6};

        for(int i=0;i<values.length;i++){
            root = insertNode(root,values[i]);
        }

        inOrder(root);

        System.out.println(searchElement(root,5));

    }
}
