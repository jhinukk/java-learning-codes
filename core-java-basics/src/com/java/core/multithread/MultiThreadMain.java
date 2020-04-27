package com.java.core.multithread;

public class MultiThreadMain {
    public static void main(String[] args) {
        new MultiThread("one");
        new MultiThread("two");
        new MultiThread("three");

        try{
            Thread.sleep(1000);
            System.out.println("out");
        }
        catch(InterruptedException e){
            System.out.println("Main thread is interrupt");
        }
        System.out.println("Main thread is exiting");
    }
}
