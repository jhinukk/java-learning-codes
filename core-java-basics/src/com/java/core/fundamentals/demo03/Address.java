package com.java.core.fundamentals.demo03;

public class Address {

    private String houseNumber;
    private String roadName;
    private String area;
    private int pinCode;
    private String state;

    public Address(String houseNumber, String roadName, String area, int pinCode, String state) {
        this.houseNumber = houseNumber;
        this.roadName = roadName;
        this.area = area;
        this.pinCode = pinCode;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + houseNumber + '\'' +
                ", roadName='" + roadName + '\'' +
                ", area='" + area + '\'' +
                ", pinCode=" + pinCode +
                ", state='" + state + '\'' +
                '}';
    }
}
