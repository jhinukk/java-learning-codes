package com.java.core.fundamentals.demo10;

public class NestedTry2 {
    public static void main(String[] args) {
        try{
            try{
                int a= 12;
                int b=a/0;
                System.out.println(b);
            }
            catch (ArithmeticException e2){
                System.out.println("First catch working");
            }

            try{
                int a[]={5,9,8};
                System.out.println(a[12]);
            }
            catch (ArrayIndexOutOfBoundsException e3){
                System.out.println("Second catch is working");
            }

            System.out.println("Try full complete");
        }
        catch(ArithmeticException e){
            System.out.println("ans is  "+e);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ans is ......" + e);
        }
    }
}
