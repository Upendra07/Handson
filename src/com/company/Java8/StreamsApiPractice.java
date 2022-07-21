package com.company.Java8;

import com.company.CollectionFrameworks.ListInterface.ArrayListPractice;
import com.company.Pojo.Student;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApiPractice {

    //creating empty Stream
    static Stream<String> emptyStream = Stream.empty();
    static Stream<Student> studentStream;
    static List<Student> studentsList;

    //creating string from list
    static void createStreamFromList(){
        ArrayListPractice.addElements();
        studentsList = ArrayListPractice.students;
        studentStream = studentsList.stream();
    }

    public static void main(String[] args) {

        createStreamFromList();

        System.out.println("All students");
        System.out.println("------------------------------");
        System.out.println(studentsList);
        System.out.println();

        //filter()
        System.out.println("Filtering roll no > 2");
        System.out.println("------------------------------");
        studentStream.filter(student -> student.getRollNo()>2).forEach(System.out::println);
        System.out.println();

        //map()
        System.out.println("mapping every name with prefix rollnumber");
        System.out.println("------------------------------");
        ArrayListPractice.students.stream().map(student -> new Student(student.getRollNo(),student.getRollNo()+student.getName())).forEach(System.out::println);
        System.out.println();

        //sorted()
        System.out.println("sorting with student name");
        System.out.println("------------------------------");
        ArrayListPractice.students.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).forEach(System.out::println);
        System.out.println();

        //collect
        List<Student> collectedList = ArrayListPractice.students.stream()
                .sorted((s1,s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList());

        //reduce - below will return the object will at last lowest name length
        Optional<Student> studentOptional = ArrayListPractice.students.stream()
                .reduce((s1,s2)-> s1.getName().length()<s2.getName().length()? s1 : s2 );

        studentOptional.ifPresent(System.out::println);

        //max

        Optional<Student> stud =  ArrayListPractice.students.stream().max((s1,s2)-> s1.getName().length() - s2.getName().length() );
        stud.ifPresent(System.out::println);





    }


}
