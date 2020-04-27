package com.java.core.fundamentals.demo03;

public class Person {

    private String name;
    private long contactNo;
    private double age;
    private Address permanentAddress;
    private Address presentAddress;

    public Person(String name, long contactNo, double age, Address permanentAddress, Address presentAddress) {
        this.name = name;
        this.contactNo = contactNo;
        this.age = age;
        this.permanentAddress = permanentAddress;
        this.presentAddress = presentAddress;
    }

    public String getName(){
        return name;
    }

    public long getContactNo(){
        return contactNo;
    }

    public double getAge() {
        return age;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }
}
