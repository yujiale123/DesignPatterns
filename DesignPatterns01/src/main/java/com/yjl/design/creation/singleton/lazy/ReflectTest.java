package com.yjl.design.creation.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/24
 * <p>
 * 反射破坏单例
 */
public class ReflectTest {

    public static void main(String[] args) {
        try {
            //定义反射
            Class<?> clazz = LazyStaticClassSingleton.class;
            //通过反射获取私有的构造方法
            Constructor<?> clazzDeclaredConstructor = clazz.getDeclaredConstructor(null);
            //强制访问
            clazzDeclaredConstructor.setAccessible(true);
            //暴力初始化并进行对比
            Object instance1 = clazzDeclaredConstructor.newInstance();
            Object instance2 = clazzDeclaredConstructor.newInstance();
            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println(instance1 == instance2);
            System.out.println(clazzDeclaredConstructor);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
