package com.java.core.fundamentals.demo01;

public class GroceryItem {

    private double rice;
    private double dal;
    private double spices;

    public GroceryItem(double rice,double dal,double spices){

        this.rice = rice;
        this.dal = dal;
        this.spices = spices;

    }
    public GroceryItem(double rice,double spices){
      this(rice,spices,0);
    }

    public GroceryItem(double rice){
        this(rice,0,0);
    }

    public double totalItems(){
        return this.rice+this.spices+this.dal;
    }
}
