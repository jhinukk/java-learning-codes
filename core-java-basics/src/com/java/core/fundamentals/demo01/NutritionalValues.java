package com.java.core.fundamentals.demo01;

/**
 * Example of Constrictor chaining;
 */
public class NutritionalValues {

    private double sugar;
    private double water;
    private double oil;

    public NutritionalValues(double sugar){
        this(sugar, 0);
    }

    public NutritionalValues(double sugar, double water){
        this(sugar, water, 0);
    }

    public NutritionalValues(double sugar, double water, double oil){
        if(sugar <= 0){
            throw new RuntimeException("Sugar value can't be less than or equals to zero.");
        }
        this.sugar = sugar;
        this.water = water;
        this.oil = oil;
    }

    public double getSugar() {
        return sugar;
    }

    public double getWater() {
        return water;
    }

    public double getOil() {
        return oil;
    }
}
