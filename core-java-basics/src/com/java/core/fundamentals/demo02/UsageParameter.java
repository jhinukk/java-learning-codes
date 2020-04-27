package com.java.core.fundamentals.demo02;

class Test{
    int i,j;
    public Test(int i,int j){
        this.i = i;
        this.j =j;
    }

    void math(Test o){
        o.i *= 2;
        o.j /=2;
    }
}
public class UsageParameter {
    public static void main(String[] args) {
        int a=10,b=20;
        Test test = new Test(a, b);

        System.out.println("A and B before call "+ test.i+" "+test.j);

        test.math(test);
        System.out.println("A and B after call "+ test.i+" "+test.j);
    }

}
