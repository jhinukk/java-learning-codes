package com.java.core.fundamentals.demo03;

class Recursion {
//    private int a;
//
//    public Recursion(int a){
//        this.a = a;
//    }
//    public int geta(){
//        return a;
 //   }
    public int factorial(int a){
        int result;
        if(a==0) return 1;
        result = factorial(a-1)*a;
        return result;
    }
}

public class RecursionMain{
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.factorial(4));
    }
}