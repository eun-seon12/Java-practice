package com.projectnull.foundation.practice;

public class test1 {

    public static void main(String[] args) {

        /* 실습문제 1 */
        int inum1=20;
        int inum2=30;

        System.out.println("더하기 결과 : "+ (inum1+inum2));
        System.out.println("빼기 결과 : "+ (inum1-inum2));
        System.out.println("곱하기 결과 : "+ (inum1*inum2));
        System.out.println("나누기한 몫 : "+ (inum1/inum2));
        System.out.println("나누기한 나머지 : "+ (inum1%inum2));

        /* 실습문제 2 */
        double dnum1=12.5;
        double dnum2=36.4;

        System.out.println("면적 : "+ (dnum1*dnum2));
        System.out.println("둘레 : "+ 2*(dnum1+dnum2));

        /* 실습문제 3 */
        double dnum3=80.5;
        double dnum4=50.6;
        double dnum5=70.8;

        long lum1= (long)(dnum3+dnum4+dnum5);
        long lum2= (long)(dnum3+dnum4+dnum5)/3;

        System.out.println("총점 : "+ lum1);
        System.out.println("평균 : "+ lum2);
    }
}
