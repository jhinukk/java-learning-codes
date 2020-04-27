package com.java.core.fundamentals.demo03;

public class MainUniversity {
    public static void main(String[] args) {

        Library library = new Library("ABC Library",10000,20);

        University university =new University("ABC","Xyz road",100,library);
        System.out.println("University details "+university.toString()+" "+library.toString());

    }
}
