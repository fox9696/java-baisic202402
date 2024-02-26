package oop.modi.member.pac1;

import java.lang.reflect.Method;

public class A {

    public int x;
    int y ; //default
    private  int z;

    public A() {
        x = 1;
        y = 2;
        z = 3;

        method1();
        Method2();
        method3();
    }

    public void method1() {}
    void Method2 () {} //default
    private void method3() {}



}
