package com.yjl.design.creation.factory.abstractFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class N95MaskFactory extends AbstractMaskFactory {


    @Override
    public N95Mask newMask() {
        return new N95Mask();
    }

    @Override
    public AbstractCar newCar() {
        return null;
    }
}
