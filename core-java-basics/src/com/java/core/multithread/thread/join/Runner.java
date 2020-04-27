package com.java.core.multithread.thread.join;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        Thread workerThread1 = new Thread(new WorkerThread());
        Thread workerThread2 = new Thread(new WorkerThread());
        Thread workerThread3 = new Thread(new WorkerThread());
        Thread workerThread4 = new Thread(new WorkerThread());

        workerThread1.start();
        workerThread2.start();
        workerThread3.start();
        workerThread4.start();

        workerThread1.join();
        workerThread2.join();
        workerThread3.join();
        workerThread4.join();


    }
}
