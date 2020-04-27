package com.java.core.fundamentals.demo01;

public class SquareMain {

    public static void main(String[] args) {

        Square square1 = new Square(5);
        Square square2 = new Square();

        System.out.println(square1.calculateArea());
        System.out.println(square2.calculateArea());
    }
}
