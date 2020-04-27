package com.java.core.fundamentals.demo10;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            String a= null;
//            int array[] = new int[10];
//            array[10] = 3/ 0;
            System.out.println(a.length());
        }
        catch(ArithmeticException e){
            System.out.println("1st"+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("2nd"+e.getMessage());
        }
        catch (Exception e){
            System.out.println("3rd"+e.getMessage());
        }
    }
}
