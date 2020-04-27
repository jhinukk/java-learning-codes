package com.java.core.multithread;

public class ThreadMain {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current Thread: "+t);

        t.setName("My New Thread");
        System.out.println("New Thread: "+t);

        try{
            for(int i=5; i>3; i--){
                System.out.println(i);
                Thread.sleep(1000);
                throw new RuntimeException("General Exception thrown by Jhinuk");
            }
        }
        catch(Exception e){
            System.out.println("Exception thrown: "+e.getMessage());
        }
    }
}
