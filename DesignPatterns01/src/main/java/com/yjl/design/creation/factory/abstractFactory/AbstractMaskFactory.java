package com.yjl.design.creation.factory.abstractFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 */
public abstract class AbstractMaskFactory implements AbstractFactory {

    @Override
    public AbstractMask newMask() {
        return null;
    }

    @Override
    public abstract AbstractCar newCar();


}
