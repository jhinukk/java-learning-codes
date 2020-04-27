package com.java.core.fundamentals.demo01;

public class Square{

    public static final int NO_OF_SIDES = 4;

    int sideLength;

    public Square(int sideLength){
        this.sideLength = sideLength;
    }
    public Square(){
        System.out.println("Empty square created");
    }

    int calculateArea(){
        return NO_OF_SIDES * sideLength;
    }
};