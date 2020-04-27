package com.java.core.fundamentals.demo06;

public class SuperUseMain {
    public static void main(String[] args) {
        SuperUseFirstSubClass superObj = new SuperUseFirstSubClass(1, 2, 3, 4);
        SuperUse superobj2 = new SuperUseSecondSubClass(9, 8, 7, 6, 5);

        System.out.println(superObj.getA());
        System.out.println(superObj.getB());
        System.out.println(superObj.getParentA());
        System.out.println(superObj.getParentB());
        System.out.println(((SuperUseSecondSubClass)superobj2).mul());

    }
}