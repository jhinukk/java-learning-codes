package com.java.core.fundamentals.demo06;

class SuperUseFirstSubClass extends SuperUse{
    private int a;
    private int b;

    public SuperUseFirstSubClass(int a,int b,int c,int d){
        super(a,b);
        this.a = c;
        this.b =d;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getParentA() {
        return super.getA();
    }

    public int getParentB() {
        return super.getB();
    }
}
