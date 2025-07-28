package com.ohgiraffers.practice03;

public class Application {

    public static void main(String[] args) {

        Shape[] shapes = {new Circle(2), new Rectangle(3, 4)};

        for (Shape s : shapes) {
            s.printArea();
        }

    }
}
