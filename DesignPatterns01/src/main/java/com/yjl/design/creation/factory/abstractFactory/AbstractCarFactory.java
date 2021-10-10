package com.yjl.design.creation.factory.abstractFactory;


/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 * <p>
 * 车辆是实现车辆的类
 */
public abstract class AbstractCarFactory implements AbstractFactory {


    @Override
    public AbstractCar newCar() {
        return null;
    }


    @Override
    public abstract AbstractMask newMask();

}
