package com.java.core.fundamentals.demo10;

public class NestedTry {
    public static void main(String[] args) {
        try{
            try{
                try{
                    int a[]= {1,2,3};
                    String b = null;
                    System.out.println(a[1]);
                    System.out.println(b.length());
                }
                catch(ArithmeticException e3){
                    System.out.println("e3 block....."+e3);
                }
                }
            catch(ArithmeticException e2){
                System.out.println("e2 block"+e2);
            }
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("e1 block"+e1);
        }
        catch (Exception e){
            System.out.println("e block"+e);
        }

        System.out.println("handel in many try block");
    }
}
