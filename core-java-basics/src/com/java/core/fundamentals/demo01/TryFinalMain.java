package com.java.core.fundamentals.demo01;
class TryFinal {
    private final double Pi = 3.14;
    private  double radius;

    public double getRadius(){
        return radius;
    }

    public TryFinal(double radius){
        this.radius = radius;
    }

    public double circleRadius(){
        return 2*Pi*getRadius()*getRadius();
    }

}

public class TryFinalMain{
public static void main(String[]args){

    TryFinal tryfinal = new TryFinal(5);
    System.out.println("circle output is "+ tryfinal.circleRadius());
        }
        }
