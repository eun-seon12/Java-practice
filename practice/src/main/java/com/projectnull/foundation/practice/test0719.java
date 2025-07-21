package com.projectnull.foundation.practice;


public class test0719 {

    public static void main(String[] args) {

        /* 반복문을 사용하여 다음의 출력 예시와 동일하게 출력되게 만들어보세요! */
        // 출력예시)
        //    *
        //   ***
        //  *****
        // *******
        //*********

        int i,j;

        for (i=1; i<=5; i++){
            for (j=1; j<=5-i; j++){
                System.out.print(" ");
            }
             for (j=1;j<=2*i-1; j++){
                 System.out.print("*");
             }
            System.out.println();
        }
    }
}
