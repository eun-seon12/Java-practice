package com.ohgiraffers.practice02;

abstract class Animal {

    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {return name;}
    public abstract void sound();
    public void move(){
        System.out.println(name+"이(가) 움직입니다.");
    }


}
