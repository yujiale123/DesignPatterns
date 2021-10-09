package com.yjl.design.creation.singleton;

/**
 * @author yujiale
 * @create 2021-10-08-2021/10/8
 * <p>
 * 单例模式：单例类负责自己创建自己的对象并且一个类只有一个实例对象,并且向整个系统提供这个实例.系统可以直接访问这个实例而不需要实例化
 * <p>
 * 特点：
 * 1。某个类只能由一个实例（构造器私有） 单例类只有一个实例
 * 2。他必须自行创建这个实例（自己编写实例化逻辑） 单例类必须自己创建自身的唯一实例
 * 3。他必须自行向整个系统提供这个实例（对外提供实例的方法） 单例类必须给其余系统对象提供创建的唯一实例
 **/

public class MainTest {

    public static void main(String[] args) {
        Person person1 = Person.boss();
        Person person2 = Person.boss();
        System.out.println(person1.equals(person2));
    }
}
