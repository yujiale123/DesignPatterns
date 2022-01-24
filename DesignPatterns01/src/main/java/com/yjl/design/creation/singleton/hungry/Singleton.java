package com.yjl.design.creation.singleton.hungry;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/24
 *
 * 饿汉式优点
 *  执行效率高
 *  性能高，没有添加任何锁机制
 *
 *  缺点
 *  某些情况下内存浪费
 *  线程不安全，无法在多线程场景使用
 *  仅限于少量的类可以使用，如果类很多就不适合使用
 *
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }
}
