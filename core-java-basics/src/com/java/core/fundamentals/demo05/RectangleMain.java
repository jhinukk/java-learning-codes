package com.java.core.fundamentals.demo05;

public class RectangleMain {
    public static void main(String[] args) {
        RectangleBox rectanglebox = new RectangleBox(12,15,20,58);
        RectanglePrismBox prismbox = new RectanglePrismBox();
        int vol,vol2;

        vol = rectanglebox.rectangleVolume();
        System.out.println("Volume of Rectangle Box is "+vol);
        System.out.println("Weight of Rectangle Box is "+rectanglebox.getWeight());
        System.out.println();

        vol2=prismbox.prismvolume();
        System.out.println("Volume of Rectangle Prism Box is "+vol2);
        System.out.println();

        prismbox = rectanglebox;
        System.out.println("Volume of Rectangle Prism Box is "+((RectangleBox) prismbox).rectangleVolume());
    }
}
