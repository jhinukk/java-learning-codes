package com.java.core.multithread;

public class JoinAliveMain {
    public static void main(String[] args) {
        JoinAlive t1= new JoinAlive("one");
        JoinAlive t2= new JoinAlive("two");

        System.out.println("one "+t1.getT().isAlive());
        System.out.println("Two "+t2.getT().isAlive());

        try{
            System.out.println("start....");
            t2.getT().join();
            t1.getT().join();

        }
        catch(InterruptedException e){
            System.out.println("Main thread is interrupt");
        }

        System.out.println("one "+t1.getT().isAlive());
        System.out.println("two "+t2.getT().isAlive());

    }
}
