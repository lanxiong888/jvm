package com.at.java;

public class ClinitTest1 {
    static class Father {
        public static int A = 1;

        static {
            A = 2;
        }
    }
    static class Son extends Father {
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Son.B);
    }
}
