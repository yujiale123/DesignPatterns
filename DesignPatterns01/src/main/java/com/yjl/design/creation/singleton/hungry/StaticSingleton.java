package com.yjl.design.creation.singleton.hungry;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/24
 */
public class StaticSingleton {
    //先静态后动态
    //先上后下
    //先属性后方法


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
