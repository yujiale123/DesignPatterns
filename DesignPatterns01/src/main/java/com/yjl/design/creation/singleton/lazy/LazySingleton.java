package com.yjl.design.creation.singleton.lazy;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/24
 */
public enum LazySingleton {
    INSTANCE;
    public void method(){
        System.out.println("枚举实现单例");
    }
}
