package com.java.core.fundamentals.demo06;

class SuperUseSecondSubClass extends SuperUseFirstSubClass {
    private int a;

    public SuperUseSecondSubClass(int a,int b,int c,int d,int e){
        super(a,b,c,d);
        this.a = e;
    }

    public int getchildA() {
        return a;
    }
    public int mul(){
        return super.getParentA() * getchildA();
    }
}
