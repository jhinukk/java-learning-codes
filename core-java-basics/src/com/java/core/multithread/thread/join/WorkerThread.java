package com.java.core.multithread.thread.join;

public class WorkerThread implements Runnable {

    @Override
    public void run() {
        System.out.println("This thread is "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            System.err.println("Exception occurred "+e.getMessage());
        }
    }
}
