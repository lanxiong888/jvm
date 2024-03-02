package com.at.java;

import org.junit.Test;

import java.security.Provider;

public class ClassLoaderTest {
    public static void main(String[] args) {
        //系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b
        //获取其上层：扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//jdk.internal.loader.ClassLoaders$PlatformClassLoader@6d311334
        //获取上层
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);

        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = Provider.class.getClassLoader();
        System.out.println(classLoader1);


    }

    @Test
    public void pcRegisterTest() {
        int i = 10;
        int j = 20;
        int k = i + j;
        String s = "abc";
        System.out.println(i);
        System.out.println(k);
    }


}
