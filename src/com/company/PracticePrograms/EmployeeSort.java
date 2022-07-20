package com.company.PracticePrograms;

import com.company.Pojo.Employee;

import java.util.*;
import java.util.stream.Collectors;

//Name          salary     age
//
//        Ram        50000         25                //before sorting
//        Bheem    45000         21
//        Krishna    60000        30
//        Radha      20000        28
//        Shyam      80000       24
//
//
//        Shyam      80000      24
//        Krishna      60000     30               //after sorting
//        Ram          50000     25
//        Bheem	      45000     21
//        Radha        20000    28



public class EmployeeSort {


    static ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("Ram",50000L,25),
            new Employee("Bheem",45000L,21),
            new Employee("Krishna",60000L,30),
            new Employee("Radha",20000L,30),
            new Employee("Shyam",80000L,30)
    ));


    public static void showEmployees(){
        employees.forEach(System.out::println);
    }

   public static List<Employee> sortEmployeesUsingStreams(){

        return  employees.stream().sorted((e1,e2) -> (int) (e2.getSalary()-e1.getSalary())).collect(Collectors.toList());

   }

   public static List<Employee> sortUsingComparator(){
         Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            }
        });

         return employees;
   }

   public static void main(String[] args){

        System.out.println("Employees before sort");
        showEmployees();
       System.out.println("Employees after sort using streams");
       sortEmployeesUsingStreams().forEach(System.out::println);
       System.out.println("Employees after sort using Comparator");
       sortUsingComparator().forEach(System.out::println);
   }

}
