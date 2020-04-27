package com.java.core.fundamentals.demo10;

public class UseTry {
    public static void main(String[] args) {

        int a, d;
        try {
             d = 0;
             a = 34 / d;
            System.out.println("That will not be printed");
        } catch (ArithmeticException e) {
            System.out.println("Divisible by 0");
            System.out.println("After catch System");
        }
    }
}
