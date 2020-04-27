package com.java.core.fundamentals.demo09;

abstract class Crow extends Birds{
    private int type3;

    public Crow(int type1,int type2,int type3){
        super(type1,type2);
        this.type3 = type3;
    }

    public int getType3() {
        return type3;
    }

    public int count(){
        return getType1()+getType2()+getType3();
    }

}
