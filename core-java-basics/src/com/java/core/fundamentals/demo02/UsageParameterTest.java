package com.java.core.fundamentals.demo02;

public class UsageParameterTest {
    private double value1;
    private double value2;

    public UsageParameterTest(double value1,double value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }
    public double getValue2(){
        return value2;
    }

    boolean equalTO(UsageParameterTest o){
        if(o.value1 == value1 && o.value2 == value2){
            return true;
        }
        else{
            return false;
        }
    }
}

