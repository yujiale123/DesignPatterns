package com.yjl.design.creation.singleton.lazy;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/24
 *
 * 懒汉式优点
 *  节省内存
 *  支持多线程调用
 *
 * 缺点
 *
 * 性能比较低，使用synchronized 才能保证单例
 */
public class LazyDoubleCheckSingleton {

    private  static volatile LazyDoubleCheckSingleton instance;


    /**
     * 构造器私有，外部不能实例化
     */
    private LazyDoubleCheckSingleton() {
        System.out.println("LazySingleton");
    }


    /**
     * * 懒汉优化方案
     * * 1。public static synchronized LazySingleton boss() 锁太大，导致效率很低
     * * 2。双重检查锁方案
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {
        //双重加锁机制， 检查是否要阻塞
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //检查是否要重新创建实例
                if (instance == null) {
                    //指令重排序的问题
                    LazyDoubleCheckSingleton lazySingleton = new LazyDoubleCheckSingleton();
                    instance = lazySingleton;
                }
            }
        }
        return instance;
    }
}
