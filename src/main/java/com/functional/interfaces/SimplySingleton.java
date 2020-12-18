package com.functional.interfaces;

public class SimplySingleton {

    private static SimplySingleton instance;

    private SimplySingleton() {
    }

    public SimplySingleton getInstance() {
        if (instance == null) {
            synchronized(this) {
                if (instance == null) {
                    instance = new SimplySingleton();
                }
            }
        }
        return instance;
    }
}
