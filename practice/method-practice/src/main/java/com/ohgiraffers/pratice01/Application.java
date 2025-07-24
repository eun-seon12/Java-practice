package com.ohgiraffers.pratice01;

public class Application {

    public static void main(String[] args) {

        int num1=10;
        int num2=20;
        int num3=5;

        Calculator calculator = new Calculator();

        calculator.checkMethod();


        int sum1to10 = calculator.sum1to10();
        System.out.println("1부터 10까지의 합 : "+sum1to10);

        int max = calculator.checkMaxNumber(num1, num2);
        System.out.println("두 수 중 큰 수는 "+ max +"이다.");

        int sum= calculator.sumTwoNumber(num1,num2);
        System.out.println(num1+"과 "+num2+"의 합은 : "+sum);

        int minus = calculator.minusTwoNumber(num1, num3);
        System.out.println(num1+"과 "+num3+"의 차는 : "+minus);

    }
}
