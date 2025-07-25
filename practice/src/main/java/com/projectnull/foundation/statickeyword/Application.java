package com.projectnull.foundation.statickeyword;

public class Application {

    public static void main(String[] args) {

        /* static : 정적 메모리 영역에 프로그램이 start 될 때 할당을 하는 키워드
         *  인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있음
         *  여러 인스턴스가 공유해서 사용할 목적의 공간
         */

        StaticFieldTest sft1 = new StaticFieldTest();

        System.out.println(sft1.getNonStaticCount());
        System.out.println(sft1.getStaticCount());

        sft1.increaseNonstaticCount();
        sft1.increaseStaticCount();

        System.out.println(sft1.getNonStaticCount());
        System.out.println(sft1.getStaticCount());

        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println(sft2.getNonStaticCount());   // 새롭게 생성
        System.out.println(sft2.getStaticCount());      // 값 동일

        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

        StaticMethodTest.staticMethod();
    }
}
