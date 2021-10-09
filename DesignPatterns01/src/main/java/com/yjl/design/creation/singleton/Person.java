package com.yjl.design.creation.singleton;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/08
 */
public class Person {
    private String name;
    private Integer age;

    /**
     * 饿汉
     * <p>
     * private final  static Person instance = new Person();
     * 懒汉式
     */
    private volatile static Person instance;

    /**
     * 构造器私有，外部不能实例化
     */
    private Person() {
        System.out.println("创建例person");
    }

    /**
     * 懒汉式
     * <p>
     * if (instance == null) {
     * Person person = new Person();
     * instance = person;
     * }
     * 懒汉优化方案
     * 1。public static synchronized Person boss() 锁太大，导致效率很低
     * 2。双重检查锁方案
     *
     * @return
     */
    public static Person boss() {
        //双重检查锁（懒汉式优化方案）
        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null) {
                    Person person = new Person();
                    instance = person;
                }
            }
        }
        return instance;
    }
}
