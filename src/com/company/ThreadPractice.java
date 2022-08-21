package com.company;

import java.beans.Customizer;

public class ThreadPractice {

    static class ThreadDemo1 implements Runnable{

        String msg;
        ThreadSync threadSync;

        ThreadDemo1(String msg, ThreadSync threadSync){
            this.msg = msg;
            this.threadSync = threadSync;
        }

        @Override
        public void run() {

           // display(msg);
            threadSync.display(msg);

        }

    }

   synchronized static void display(String msg){
        for (char c: msg.toCharArray()){
            System.out.print(c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ThreadSync threadSync = new ThreadSync();

        Thread thread1 = new Thread(new ThreadDemo1("Upendra",threadSync));
        Thread thread2 = new Thread(new ThreadDemo1("Bhat",threadSync));
        thread1.start();
        thread2.start();

    }

}

class ThreadSync{

    void display(String msg){

        synchronized (this) {
            for (char c : msg.toCharArray()) {
                System.out.print(c);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

class ATM {

    void displayBalance(Customer customer){
        System.out.print(customer.name);
        System.out.print(" balance is "+ customer.amount);
    }

    void withdrawAmount(Customer customer){
        System.out.print(customer.name);
        System.out.print(" is withdrawing "+ customer.amount);
    }

}

class Customer{

    String name;
    int amount;

    Customer(String name,int amount){

        this.name = name;
        this.amount = amount;

    }
}

