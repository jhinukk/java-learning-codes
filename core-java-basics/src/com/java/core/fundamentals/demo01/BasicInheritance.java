package com.java.core.fundamentals.demo01;

public class BasicInheritance {

    private double boxLength;
    private double boxWidth;

    public BasicInheritance(double boxLength,double boxWidth){
        this.boxLength = boxLength;
        this.boxWidth = boxLength;
    }

    public double boxArea(){
        return this.boxLength * this.boxWidth;
    }

    public double getBoxLength() {
        return boxLength;
    }

    public double getBoxWidth() {
        return boxWidth;
    }
}
