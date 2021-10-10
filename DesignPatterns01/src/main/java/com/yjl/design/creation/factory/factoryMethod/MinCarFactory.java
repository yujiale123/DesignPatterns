package com.yjl.design.creation.factory.factoryMethod;

import com.yjl.design.creation.factory.abstractFactory.AbstractCar;

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
