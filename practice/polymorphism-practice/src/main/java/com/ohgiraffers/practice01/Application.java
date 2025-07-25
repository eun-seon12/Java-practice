package com.ohgiraffers.practice01;

public class Application {

    public static void main(String[] args) {

        InterCar interCar = new Car();

        interCar.run();
        interCar.stop();

        Car car = new FireCar();
        ((FireCar) car).sprayWater(); //up-casting

        Interhorn interhorn = new Car();
        interhorn.horn();

        FireCar fireCar = new FireCar();

        fireCar.sprayWater();
    }


}
