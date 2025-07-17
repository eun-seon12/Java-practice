package com.projectnull.foundation.practice;

import java.util.Scanner;

public class test0717 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 문제 7.

        System.out.print("정수를 하나 입력하세요 : ");
        int num1 = sc.nextInt();

        if (num1>0) {
            System.out.println("양수다");
        } else {
            System.out.println("양수가 아니다");
        }

        // 문제 8.

        System.out.print("정수를 하나 입력하세요 : ");
        int num2 = sc.nextInt();

        if (num2 %2 == 0) {
            System.out.println("짝수다");
        } else {
            System.out.println("홀수다");
        }

         // 문제 9. 다시

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("태어난 월을 입력하세요 : ");
        int month = sc.nextInt();
        System.out.print("태어난 일을 입력하세요 : ");
        int day = sc.nextInt();


        if (month>=1 && month<=6 ) {
            if (day >= 1 && day <= 15) {
                System.out.println(name + "의 선물은 배민 쿠폰 입니다.");
            } else {
                System.out.println(name+"의 선물은 사탕입니다.");
            }} else {
            if (day>=16&&day<=31) {
                System.out.println("스타벅스");
            }else {
                System.out.println("사탕");
            }
        }

//            } else if (day >= 16 && day <= 31) {
//                System.out.println(name + "의 선물은 스타벅스 커피입니다");
//            } else {
//                System.out.println(name + "의 선물은 사탕입니다.");
//            }


         // 문제 10.

        System.out.print("나이가 어떻게 되세요? : ");
        int age = sc.nextInt();

        if (age>=20) {
            System.out.println("판매 가능합니다.");
        } else{
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요. ");
        }

         // 문제 11.

        System.out.print("당첨 번호가 어떻게 되세요? : ");
        int number = sc.nextInt();

        if (number >= 1 && number <= 10) {
            if(number%2!=0) {
                System.out.println("홀수네요, 인형 선물입니다!");
            } else {
                System.out.println("짝수네요, 모자 선물입니다!");
            }
        } else {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        }

        // 문제 12.

        System.out.print("성실 점수 : ");
        int snum = sc.nextInt();
        System.out.print("서비스 점수 : ");
        int service = sc.nextInt();
        System.out.print("미소 점수 : ");
        int smile = sc.nextInt();

        int avg = (snum+service+smile)/3;

        if (avg>=60){
            if (snum>=40 && service>=40 && smile>=40){
                System.out.println("합격입니다.");
            } else if (snum<40) {
                System.out.println("성실 점수 미달로 불합격입니다.");
            } else if (service<40) {
                System.out.println("서비스 점수 미달로 불합격입니다.");
            } else if (smile<40) {
                System.out.println("미소 점수 미달로 불합격입니다.");
            }
        } else {
            System.out.println("평균 점수 미달로 불합격입니다.");
        }

        // 문제 13.

//        System.out.print("월 급여 입력 : ");
//        int month = sc.nextInt();
//        System.out.print("매출액 입력 : ");
//        int sales = sc.nextInt();
//
//        double bonusper = sc.nextDouble();
//        int bonus= sc.nextInt();
//        int total = sc.nextInt();
//
//        if (sales>=5000){
//            bonus=sales*0.05;
//        } else if (sales>=3000) {
//            bonus=sales*0.03;
//        } else if (sales>=1000) {
//            bonus=sales*0.01
//        } else {
//            bonus=sales*0;
//        }
//
//        System.out.println("===================");
//        System.out.println("매출액 : "+ sales);
//        System.out.println("보너스율 : "+bonusper);
//        System.out.println("월 급여 : "+month);
//        System.out.println("보너스 금액 : "+bonus);
//        System.out.println("===================");
//        System.out.println("총 급여 : "+ total );

   }
}
