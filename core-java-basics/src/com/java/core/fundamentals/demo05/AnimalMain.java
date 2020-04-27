package com.java.core.fundamentals.demo05;

public class AnimalMain {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal alssasian = new Alssasian();

        AnimalUtils.playWithAnimal(dog);
    }
}
