package com.minimal;

public class ModuleA {
    static {
        System.loadLibrary("moduleA");
    }
    public native String  getVersion();
}