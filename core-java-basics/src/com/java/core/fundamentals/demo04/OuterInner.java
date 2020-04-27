package com.java.core.fundamentals.demo04;

public class OuterInner {
    public int a;
    public int b;

    public OuterInner(int a,int b){
        this.a = a;
        this.b = b;
    }

    public class Inner{
        public void display(){
           System.out.print("Output is "+a);
        }
    }
/*    void Textdisplay(){
        Inner inner = new Inner();
        inner.display();
    }*/
}
