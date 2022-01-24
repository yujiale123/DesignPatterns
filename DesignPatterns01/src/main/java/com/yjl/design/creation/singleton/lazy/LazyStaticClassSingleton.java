package com.yjl.design.creation.singleton.lazy;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/24
 */
public class LazyStaticClassSingleton {

    private LazyStaticClassSingleton() {

    }

    private static LazyStaticClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }


    private static class LazyHolder {
        private static final LazyStaticClassSingleton INSTANCE = new LazyStaticClassSingleton();
    }
}
