package com.company;

public class GenricPractice<T>{

    T var1;

    GenricPractice(T var1){
        this.var1 = var1;
    }

    public void setVar1(T var1){
        this.var1 = var1;
    }

    public T getVar1(){
        return var1;
    }


    //generic method
    static <M> void method(M element){

        System.out.println(element);

    }

    static <M extends Number> void methodNumber(M element){

        System.out.println(element);

    }

    public static void main(String[] args) {

        GenricPractice<String> obj1 = new GenricPractice<>("Hello");
        System.out.println(obj1.getVar1());

        GenricPractice<Integer> obj2 = new GenricPractice<>(12);
        System.out.println(obj2.getVar1());
        obj2.setVar1(15);
        System.out.println(obj2.getVar1());

        method(12);
        method(12.5f);
        method("Hi Yateesh!");

       // methodNumber("Hi"); gives error as String doesn't extend Number
        methodNumber(19);


    }

}
