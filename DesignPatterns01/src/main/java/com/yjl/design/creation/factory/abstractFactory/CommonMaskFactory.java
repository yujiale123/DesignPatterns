package com.yjl.design.creation.factory.abstractFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class CommonMaskFactory extends AbstractMaskFactory {

    @Override
    public AbstractMask newMask() {
        return new CommonMask();

    }

    @Override
    public AbstractCar newCar() {
        return null;
    }

}
