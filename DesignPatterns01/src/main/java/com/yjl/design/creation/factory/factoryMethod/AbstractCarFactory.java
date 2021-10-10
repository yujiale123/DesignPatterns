package com.yjl.design.creation.factory.factoryMethod;

import com.yjl.design.creation.factory.abstractFactory.AbstractCar;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public interface AbstractCarFactory {

    /**
     * 创建车的方法
     * @return
     */
    public AbstractCar newCar();

    /**
     * 创建其他方法
     */
}
