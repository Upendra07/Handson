package com.company;

public class BinaryTree {

    public static void main(String[] args) {

        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Node root = BinaryTreeBuilder.buildTree(nodes);

        preOrder(root);

    }

    public static void preOrder(Node root){

        if(root == null){
            return;
        }

        System.out.println(root.data);
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }

}

class Node{
    int data;
    Node leftNode;
    Node rightNode;

    Node(int data){
        this.data = data;
        leftNode = null;
        rightNode = null;
    }
}


class BinaryTreeBuilder {

    static int index = -1;

    public static Node buildTree(int[] nodes) {
        index++;

        if (nodes[index] == -1) {

            return null;

        }

        Node newNode = new Node(nodes[index]);
        newNode.leftNode = buildTree(nodes);
        newNode.rightNode = buildTree(nodes);

        return newNode;

    }
}
