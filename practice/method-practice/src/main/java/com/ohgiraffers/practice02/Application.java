package com.ohgiraffers.practice02;

public class Application {

    public static void main(String[] args) {


        SimpleOperations simpleope = new SimpleOperations();

        simpleope.printMessage();

        int start=1;
        int end =10;
        int sum = simpleope.sumNumbers(start, end);
        System.out.println(start+"부터 "+end +"까지의 숫자들의 합은 : "+sum);

        int num = 10;
        if (simpleope.isEvenNumber(num)){
            System.out.println(num+"은 짝수입니다.");
        } else{
            System.out.println(num+"은 홀수입니다.");
        }

        String inputstr = "Hello World";
        char ch = 'o';
        int count = simpleope.countCharacter(inputstr,ch);
        System.out.println(inputstr+"에서 "+ch+"의 개수는 : "+ count);

        String rv = simpleope.reverseString(inputstr);
        System.out.println(inputstr+"를 뒤집은 결과는 : "+rv);
    }
}
