package com.yjl.design.creation.factory.abstractFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class MinCarFactory extends AbstractCarFactory {
    @Override
    public MinCar newCar() {
        return new MinCar();
    }

    @Override
    public AbstractMask newMask() {
        return null;
    }


}
