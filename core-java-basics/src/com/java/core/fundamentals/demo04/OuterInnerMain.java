package com.java.core.fundamentals.demo04;

public class OuterInnerMain {
    public static void main(String[] args) {
        OuterInner outerInner = new OuterInner(12,45);
        OuterInner.Inner inner = outerInner.new Inner();
    }
}
