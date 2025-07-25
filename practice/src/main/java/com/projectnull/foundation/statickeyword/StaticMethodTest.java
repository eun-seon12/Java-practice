package com.projectnull.foundation.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod() {
        this.count++;

        System.out.println("nonStaticMethod 호출");
    }

    public static void staticMethod() {

        System.out.println("staticMethod 호출");
    }
}
