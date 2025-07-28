package com.ohgiraffers.practice03;

public class Rectangle extends Shape {

    private double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    double area() {
        return w * h;
    }

    @Override
    String getName() {
        return "사각형의 넓이는";
    }
}
