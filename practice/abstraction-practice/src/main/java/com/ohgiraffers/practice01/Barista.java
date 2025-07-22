package com.ohgiraffers.practice01;

public class Barista {

    private final Machine machine = new Machine();

    public void turnOn() {
        machine.turnOn();
    }
    public void pressShot(){
        machine.make();
    }
    public void stopShot(){
        machine.stop();
    }
    public void turnOff(){
        machine.turnoff();
    }
}
