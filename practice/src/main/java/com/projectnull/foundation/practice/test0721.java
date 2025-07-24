package com.projectnull.foundation.practice;

import java.util.Scanner;

public class test0721 {

    public static void main(String[] args) {

        // 배열 문제 1.

        int [] arr = new int[10];
        for (int i=0;i< arr.length;i++){
            arr[i]=i+1;
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // 배열 문제 2.

        String [] fruits = {"딸기", "바나나", "복숭아", "키위", "사과"};

        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        if (num>=0 && num<=4) {
            System.out.print(fruits[num]);
        } else {
            System.out.println("준비된 과일이 없습니다.");
        }
        System.out.println();

    }
}
