package com.company;

import java.io.*;

public class SerializationPractice implements Serializable {

    private int rollNo;
    private String name;

    SerializationPractice(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SerializationPractice{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationPractice obj = new SerializationPractice(1,"Upendra");

        //Serializing
        FileOutputStream fos = new FileOutputStream("serObj.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        //De-serialize
        FileInputStream fis = new FileInputStream("serObj.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializationPractice obj2 =(SerializationPractice) ois.readObject();
        System.out.println(obj2);


    }

}
