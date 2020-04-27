package com.java.core.fundamentals.demo02;

public class ReturnItem {
    int a;
    public ReturnItem(int i){
        this.a = i;
    }
    ReturnItem increase(){
        ReturnItem returnItem = new ReturnItem(a+10);
        return returnItem;
    }
}
