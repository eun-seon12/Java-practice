package com.ohgiraffers.practice02;

public class Dog extends Animal {

    public Dog(String name) { super(name); }

    @Override
    public void sound() {

        System.out.println(getName() + "이(가) 월월하고 웁니다.");
    }

    public void smell(){

        System.out.println(getName()+"이(가) 냄새를 맡는다.");
    }


}
