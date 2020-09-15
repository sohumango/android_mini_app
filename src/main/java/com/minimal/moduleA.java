package com.minimal;

public class moduleA {
    static {
        System.loadLibrary("moduleA");
    }
    public native String  getVersion();
}