package com.company.Java8;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalPractice {

    static Optional<String> emptyOptional = Optional.empty();
    static Optional<String> optional = Optional.of("Upendra");

    public static void main(String[] args) {
        if(optional.isPresent()){
            System.out.println(optional.get());
        }

        System.out.println(emptyOptional.orElse("Hi"));
        System.out.println(emptyOptional.orElseGet(()->"Hi"));

        optional.ifPresent(s -> System.out.println(s.length()));
        emptyOptional.ifPresent(s -> System.out.println(s.length()));


        try {
            emptyOptional.orElseThrow();
        }catch (NoSuchElementException e){
            System.out.println("Exception catched");
            System.out.println(e.getMessage());
        }


    }
}
