package com.at.java;

/**
 *
 */
public class StackStruTest {
    private static int a = 1;
    static {
        a =2;
        b = 20;
        System.out.println(a);
//        System.out.println(b);//Illegal forward reference
    }

    private static int b = 10;
    public static void main(String[] args) throws InterruptedException {


        System.out.println(a);

    }
}