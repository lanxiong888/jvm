package com.at.java;

public class StackFrameTest {
    public static void main(String[] args) {
        try {
            StackFrameTest test = new StackFrameTest();
            test.method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main结束");
    }

    public void method1() {
        System.out.println("method1()开始执行...");
        method2();
        System.out.println("method1()执行结束");
//        System.out.println(10/0);
    }

    public int method2() {
        System.out.println("method2()开始执行...");
        int i = 10;
        int m = (int) method3();

        System.out.println("method2()执行结束");
        return i + m;
    }

    public double method3() {
        System.out.println("method3()开始执行...");
        double j = 20.0;
        System.out.println("method3()即将结束");
        return j;
    }
}

