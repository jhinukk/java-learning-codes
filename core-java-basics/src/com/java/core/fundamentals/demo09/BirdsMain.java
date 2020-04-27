package com.java.core.fundamentals.demo09;

public class BirdsMain {
    public static void main(String[] args) {
        IndianCrow crow = new IndianCrow(12,15,20);

        System.out.println(crow.sound());
        System.out.println(crow.count());
    }
}
