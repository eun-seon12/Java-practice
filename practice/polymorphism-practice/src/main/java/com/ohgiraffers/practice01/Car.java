package com.ohgiraffers.practice01;

public class Car implements InterCar, Interhorn {

    @Override
    public void run() {
        System.out.println("차가 달린다.");
    }

    @Override
    public void stop(){
        System.out.println("차가 멈춘다.");
    }

    @Override
    public void horn() {

        System.out.println("빵빵");
    }
}
