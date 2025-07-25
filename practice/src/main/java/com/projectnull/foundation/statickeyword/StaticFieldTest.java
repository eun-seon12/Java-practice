package com.projectnull.foundation.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;

    private static int staticCount;

    public StaticFieldTest() {}

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public int getStaticCount() {
        return StaticFieldTest.staticCount;
    }

    public void increaseNonstaticCount() {
        nonStaticCount++;
    }

    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }
}
