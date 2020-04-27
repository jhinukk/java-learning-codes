package com.java.core.fundamentals.demo01;
class Name{
    private static String fname;

    public static String getName(){
        return fname;
    }
    public static void setName(String fname){
        Name.fname = fname;
    }
}

public class NameMain {
    public static void main(String[] args) {
        Name.setName("jm");
        System.out.println(Name.getName());
    }

}
