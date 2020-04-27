package com.java.core.fundamentals.demo02;

public class UsageParameterTestMain {
    public static void main(String[] args) {

        UsageParameterTest usageParameterTest =new UsageParameterTest(12,5);
        UsageParameterTest usageParameterTest2 = new UsageParameterTest(12,5);
        UsageParameterTest usageParameterTest3 = new UsageParameterTest(5,5);

        System.out.println(usageParameterTest.equalTO(usageParameterTest2));
        System.out.println(usageParameterTest.equalTO(usageParameterTest3));

    }
}
