package com.java.core.fundamentals.demo01;

class BasicInheritanceChild extends BasicInheritance{

    private double height;
    public BasicInheritanceChild(double boxLength,double boxWidth,double height) {

        super(boxLength,boxWidth);
        this.height = height;
    }
    public double boxVolume(){
        return this.height * this.getBoxLength() * this.getBoxLength();
    }
}
