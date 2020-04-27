package com.java.core.multithread;

public class JoinAlive implements Runnable{
    private String name;
    private Thread t;

    public JoinAlive(String newThread){
        this.name = newThread;
        this.t = new Thread(this,name);
        System.out.println("New Thread : "+t);
        this.t.start();
    }

    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name +" : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(name+" interrupted");
        }
        System.out.println(name+" exiting");
    }

	public String getName() {
		return name;
	}

	public Thread getT() {
		return t;
	}
}
