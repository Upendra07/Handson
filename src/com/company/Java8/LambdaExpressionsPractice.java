package com.company.Java8;

import com.company.CollectionFrameworks.ListInterface.ArrayListPractice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressionsPractice {

    @FunctionalInterface
    interface IMyInterface{
        int addNumbers(int a,int b);
    }



    public static void main(String[] args) {

        //converting user defined functional interface to lambda Expression
        IMyInterface iMyInterface = (a,b) -> a+b;
        int sum = iMyInterface.addNumbers(10,20);
        System.out.println(sum);

        //Using predefined Interfaces to define lambda expressions

        Predicate<String> predicate = (s) -> s.length()>7;
        System.out.println(predicate.test("Upendra"));
        System.out.println(predicate.test("Yateesh Hegde"));

        Function<String,Integer> function = (s) -> s.length();
        System.out.println(function.apply("Upendra"));

        // above function can also be written as below using method reference
        Function<String,Integer> function1 = String::length;
        System.out.println(function.apply("Yateesh Hegde"));

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Helllo Yateesh");

        Supplier<Integer> supplier = () -> 12+1;
        System.out.println(supplier.get());

        //using lambda expression in foreach
        System.out.println("using lambda in foreach");
        System.out.println("________________________________________");
        ArrayListPractice.addElements();
        ArrayListPractice.students.forEach(student -> {
            System.out.println(student);
        });


    }


}
