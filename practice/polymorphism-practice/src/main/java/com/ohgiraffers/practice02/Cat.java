package com.ohgiraffers.practice02;

public class Cat extends Animal {

    public Cat(String name) { super(name); }

    @Override
    public void sound() {

        System.out.println(getName() + "이(가) 미야오하고 웁니다.");
    }

    public void grooming(){

        System.out.println(getName()+"이(가) 그루밍을 한다.");
    }
}
