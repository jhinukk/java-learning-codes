package com.java.core.multithread;

public class Caller implements Runnable {
   Callme target;
   String msg;
   Thread t;

   public Caller(Callme target ,String s){
       target = target;
       msg = s;
       t = new Thread(this);
       t.start();
   }
   @Override
   public void run(){

   }
}
