package com.ohgiraffers.practice03;

abstract class Shape {

    abstract double area();
    abstract String getName();

    public void printArea() {
        System.out.println(getName()+ " : " + area());
    }
}
