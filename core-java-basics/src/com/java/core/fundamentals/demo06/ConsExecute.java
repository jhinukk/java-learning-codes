package com.java.core.fundamentals.demo06;

class A {
    public A(){
        System.out.println("Print only A");
    }
}
class B extends A{
    public B(){
        System.out.println("Print only B");
    }
}
class C extends B{
    public C(){
        System.out.println("Print only C");
    }
}
public class ConsExecute {
    public static void main(String[] args) {
        A c= new C();
    }
}
