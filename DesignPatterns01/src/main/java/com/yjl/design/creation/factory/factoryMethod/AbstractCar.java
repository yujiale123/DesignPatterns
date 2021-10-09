package com.yjl.design.creation.factory.factoryMethod;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 *
 * 定义抽象（定义抽象类或者接口）
 * 如果有抽象类和接口，就会有多实现，多实现就会有多功能
 */
public abstract class AbstractCar {

    /**
     * 类型
     */
    public String engine;

    /**
     * 运行
     */
    public abstract void run();
}
