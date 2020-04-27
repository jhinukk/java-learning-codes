package com.java.core.fundamentals.demo02;

public class ReturnMain {
    public static void main(String[] args) {

        ReturnItem obj1 = new ReturnItem(1);
        ReturnItem obj2;
        System.out.println("a : " + obj1.a);
            obj2 =obj1.increase();
//        System.out.println("a : " + obj2.a);
//        obj2 = obj2.increase();
//        System.out.println("a : " + obj2.a);

    }
}