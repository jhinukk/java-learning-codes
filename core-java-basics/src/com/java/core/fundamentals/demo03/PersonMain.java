package com.java.core.fundamentals.demo03;

public class PersonMain {

    public static void main(String[] args) {

        Address permanentAddress = new Address("A-001", "XX Lane", "YY", 88122101, "Sahar");
        Address presentAddress = new Address("B-001", "PP Road", "ZZ", 72333337, "Gram");

        Person person = new Person("John", 987654310, 65, permanentAddress, presentAddress);
        System.out.println(person.getPermanentAddress());
    }
}
