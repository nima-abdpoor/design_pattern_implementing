package com.company.Singleton;

public class Singleton {
    private static Singleton instance;

    public String testString;
    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

}
