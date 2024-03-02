package com.at.java;

import java.util.ArrayList;

/**
 * VM args: -Xms20m -Xmx20m
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 */
public class HeapOomCase {
    static class OomObject {

    }

    public static void main(String[] args) {
        ArrayList<OomObject> list = new ArrayList<>();
        while (true) {
            list.add(new OomObject());
        }
    }
}