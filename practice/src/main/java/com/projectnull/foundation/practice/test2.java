package com.projectnull.foundation.practice;

public class test2 {

    public static void main(String[] args) {

        /* 실습문제 1 */
        int num1 =10;
        int num2 =20;

        int result = (num1<num2)? num2 : num1;

        System.out.println("두 수 중에서 큰 수는 " + result + "입니다.");



        /* 실습문제 2 */
        int score=70;

        String result2 = (score>=60)? "합격입니다" : "아쉽지만 불합격입니다";

        System.out.println(result2);



        /* 실습문제 3 */
        int num3=5;

        String result3 = (num3 % 2==0)? "짝수입니다" : "홀수입니다" ;

        System.out.println("입력하신 수는 " + result3);
    }
}
