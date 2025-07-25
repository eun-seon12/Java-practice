package com.ohgiraffers.practice01;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        return (1+2+3+4+5+6+7+8+9+10);
    }

    public int checkMaxNumber(int num1, int num2){
        return (num1<num2)?num2 : num1;
    }

    public int sumTwoNumber(int num1, int num2){
        return (num1+num2);
    }

    public int minusTwoNumber(int num1, int num3){
        return (num1-num3);
    }
}
