package com.java.core.fundamentals.demo01;

public class BasicOverriding {
    private int subFirstNo;
    private int subSecondNo;

    public BasicOverriding(int subFirstNo, int subSecondNo){
        this.subFirstNo = subFirstNo;
        this.subSecondNo = subSecondNo;
    }
    public int getSubFirstNo(){
        return this.subFirstNo;
    }
    public int getSubSecondNo(){
        return this.subSecondNo;
    }
    public int sub(){
        return getSubFirstNo()-getSubSecondNo();
    }
}
