package com.yjl.design.creation.factory.factoryMethod;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class MinCarFactory implements AbstractCarFactory {


    @Override
    public AbstractCar newCar() {
        return new MinCar();
    }
}
