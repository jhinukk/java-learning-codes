package com.java.core.fundamentals.demo09;

public abstract class Birds {
    private int type1;
    private int type2;

    public Birds(int type1,int type2){
        this.type1 = type1;
        this.type2 = type2;
    }

    public int getType1() {
        return type1;
    }

    public int getType2() {
        return type2;
    }

//    abstract String sound();

}
