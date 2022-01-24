package com.yjl.design.creation.singleton.hungry;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/24
 */
public class StaticSingleton {

    private static final StaticSingleton singleton;


    static {
        singleton = new StaticSingleton();
    }

    private StaticSingleton() {

    }

    public static StaticSingleton getInstance() {
        return singleton;
    }
}
