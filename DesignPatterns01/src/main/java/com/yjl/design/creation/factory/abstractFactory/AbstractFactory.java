package com.yjl.design.creation.factory.abstractFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public interface AbstractFactory {

    /**
     * 车辆
     * @return
     */
    public AbstractCar newCar();

    /**
     * 口罩
     * @return
     */
    public AbstractMask newMask();
}
