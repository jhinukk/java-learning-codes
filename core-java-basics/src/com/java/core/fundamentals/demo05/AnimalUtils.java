package com.java.core.fundamentals.demo05;

public class AnimalUtils {

    public static void playWithAnimal(Animal animal){
       if(animal instanceof Alssasian){
           ((Alssasian) animal).size();
       }
       else if(animal instanceof Dog){
           ((Dog) animal).bark();
       }
       else if(animal instanceof Horse){
           ((Horse) animal).run();
       }
       else{
           animal.walk();
       }
    }
}
