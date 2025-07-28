package com.ohgiraffers.practice03;

public class Circle extends Shape {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }
    @Override
    double area() {
        return Math.PI * r * r;
    }

    @Override
    String getName() {
        return "원의 넓이는";
    }
}
