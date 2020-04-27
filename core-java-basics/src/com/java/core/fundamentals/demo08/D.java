package com.java.core.fundamentals.demo08;

interface A {
    default void m() {System.out.println("hello from A"); }
}
interface B extends A {
    default void m() { System.out.println("hello from B"); }
}
interface C extends A {
}
class D implements B, C {
    public static void main(String[] args) {
        B c = new D();
        
    }
}


