package com.java.core.fundamentals.demo01;

public class BasicInheritanceMain {
    public static void main(String[] args) {

        BasicInheritanceChild basicInheritanceChild = new BasicInheritanceChild(12,45,35);

        System.out.println("Box area is = "+basicInheritanceChild.boxArea());
        System.out.println("Box volume is = "+basicInheritanceChild.boxVolume());
    }
}
