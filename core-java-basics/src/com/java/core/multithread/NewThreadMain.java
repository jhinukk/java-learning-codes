package com.java.core.multithread;

public class NewThreadMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadRunable());
        thread.start();
            try{
                for(int i=0;i<=5;i++){
                    System.out.println("Parent: "+i);
                    Thread.sleep(1000);
                }
            }
            catch(Exception e){
                System.out.println("Child Error is :"+e);
            }


    }
}
