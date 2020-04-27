package com.java.core.multithread;

public class ThreadRunable implements Runnable{
    public void run(){
        try{
            for(int i=0;i<=5;i++){
                System.out.println("Child: "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Child Error is :"+e);
        }
    }

}
