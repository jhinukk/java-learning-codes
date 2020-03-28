package com.java.core.fundamentals.demo01;

class Rectangle {

    double length;
    double width;

}

public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.length=5;
        rectangle.width=3;
        System.out.println("Rectangle area is = "+2*(rectangle.length+rectangle.width));
    }
}


