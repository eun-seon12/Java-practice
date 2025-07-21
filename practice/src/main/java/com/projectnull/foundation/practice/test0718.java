package com.projectnull.foundation.practice;

import java.util.Scanner;

public class test0718 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 문제 1.

        int sum=0;

        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("sum = " + sum);

        // 문제 2.
        System.out.println();
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int sum2=0;
        int i2 = 1;
        while (i2<=num){
            sum2 += i2;
            i2++;
        }
        System.out.println("1부터 " + num + "까지의 합 : "+ sum2);

        // 문제 3.
        System.out.println();
        System.out.println("==== 7단 구구단 ====");

        for (int dan=7;dan<8;dan++){
            for (int su=1;su<10;su++){

                System.out.println(dan+" * "+su+" = "+(dan*su));
            }
            System.out.println();
        }

        // 문제 4.

        System.out.print("정수를 입력하세요 : ");

        int num2 = sc.nextInt();

        int sum3=0;
        int i3 = 1;
        while (i3<=num2) {
            if (i3%2==0) {
                sum3 += i3;
            }
            i3++;
        }
        System.out.println("1부터 " + num2 +"까지 짝수의 합 : "+sum3);

        // 문제 5.
        System.out.println();
        sc.nextLine();

        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        System.out.println("========= for문 =========");
        for (int i4=0; i4<str.length();i4++){
            char ch = str.charAt(i4);

            System.out.println(i4+ " : " +ch);
        }

        System.out.println("========= while문 =========");
        int index =0;
        while (index<str.length()){
            char ch = str.charAt(index);

            System.out.println(index+" : "+ch);

            index++;
        }
        System.out.println();

        // 문제 6.

        for(char ch2='a';ch2<='z';ch2++){
            System.out.print(ch2);
        }
        System.out.println();

        // 문제 7.
        System.out.println();
        System.out.print("정수를 입력하세요 : ");
        int num3 = sc.nextInt();

        String str2="";

        int i5 =1;
        while (i5<=num3){
            if(i5%2!=0){
                str2+= "토";
            }else {
                str2+= "마";
            }
            i5++;
        }
        System.out.println(str2);
    }
}