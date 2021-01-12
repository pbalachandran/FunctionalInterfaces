package com.functional.interfaces;

public class FixedSingleton {

    public static FixedSingleton instance = new FixedSingleton();

    private FixedSingleton() {
    }

    public static FixedSingleton getInstance() {
        return instance;
    }
}
