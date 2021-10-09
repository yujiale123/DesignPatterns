package com.yjl.design.creation.factory.factoryMethod;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class VanCarFactory implements AbstractCarFactory {


    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
