package com.projectnull.foundation.practice;

import java.util.Scanner;

public class test0720 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        // 채린님 문제

        System.out.print("1부터 10 사이의 정수를 입력하세요 : ");
        int num=sc.nextInt();

        if(num>10 || num<1){
            System.out.println("1부터 10 사이의 정수를 입력해주세요!");
            return;
        }
        for (int dan =1; dan<=num;dan++){
            if(dan%2!=0){
                for(int i=1;i<=9;i++){
                    System.out.println(dan+" * "+i+" = "+(dan*i));
                }
                System.out.println();
            }
        }

        // 예슬님 문제

        System.out.println("=== 메뉴 ===");
        System.out.println("1. 불고기버거");
        System.out.println("2. 치즈버거");
        System.out.println("3. 새우버거");
        System.out.println("4. 감자튀김");
        System.out.println("5. 콜라");

        System.out.print("메뉴 번호를 입력하세요 : ");
        int num2 = sc.nextInt();

        switch (num2){
            case 1:
                System.out.println("불고기버거를 선택하셨습니다.");
                break;
            case 2:
                System.out.println("치즈버거를 선택하셨습니다.");
                break;
            case 3:
                System.out.println("새우버거를 선택하셨습니다.");
                break;
            case 4:
                System.out.println("감자튀김을 선택하셨습니다.");
                break;
            case 5:
                System.out.println("콜라를 선택하셨습니다.");
                break;
            default:
                System.out.println("1부터 5 사이의 숫자를 입력하세요");
        }
        System.out.println();

        // 건우님 문제


        // 약수란.. 어떤 수를 나눴을 때 나머지가 0인 수 6이라고치면 1236
        System.out.print("정수를 한 개 입력해주세요 : ");
        int num3=sc.nextInt();

        int count =0;
        int i;

        System.out.print(num3+"의 약수는 ");

        for(i=1;i<=num3;i++){
            if(num3%i==0){
                System.out.print(i);
                count++;
            }
        }
        System.out.print("이고, "+"약수의 개수는 "+count+"개입니다.");


//        for (i=1;i<=num3;i++){
//            if(num3%i==0){
//                count++;
//            }
//        }
//
//        System.out.println(num3+"의 약수는 "+i+"이고,"+"약수의 개수는 "+count+"개입니다.");

//        50의 약수는 51이고, 약수의 개수는 6개입니다. <- 약수나열이안됨

        if (count==2){
            System.out.println("소수입니다.");
        }

    }

}

// 약수 알고리즘
//        int n = 100;
//
//        for(int i = 1; i <= n; i++){
//        if(n % i == 0){
//        System.out.println(i + "는 약수 입니다.");
//            }
//                    }
//        1는 약수 입니다.
//        2는 약수 입니다.