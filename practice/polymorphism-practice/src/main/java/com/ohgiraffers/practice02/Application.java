package com.ohgiraffers.practice02;

public class Application {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("봄"), new Cat("춘식")};
        for (Animal animal : animals) {
            animal.move();
            animal.sound();

            if(animal instanceof Dog){
                Dog dog = (Dog)animal;
                dog.smell();
            }
            if(animal instanceof Cat){
                Cat cat = (Cat)animal;
                cat.grooming();
            }

        }
    }
}