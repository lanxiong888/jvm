package com.at.java;

public class StackErrorTest {
    private static int a = 1;
    public static void main(String[] args) {
        System.out.println(a);//20331  4022
        a++;
        main(args);
    }
}
