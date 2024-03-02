package com.at.java;

public class HeapSizeDemo {
    public static void main(String[] args) {
        long initialMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();

        System.out.println("-Xms:" + (initialMemory / 1024 / 1024) + " M");
        System.out.println("-Xmx:" + (maxMemory / 1024 / 1024) + " M");
        System.out.println("系统内存大小：" + (initialMemory * 64 / 1024 / 1024 / 1024) + " G");
        System.out.println("系统内存大小：" + (maxMemory * 4 / 1024 / 1024 / 1024) + " G");

    }
}