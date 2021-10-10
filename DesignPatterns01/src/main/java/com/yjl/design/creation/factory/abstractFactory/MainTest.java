package com.yjl.design.creation.factory.abstractFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractFactory minCarFactory = new MinCarFactory();
        AbstractCar abstractCar = minCarFactory.newCar();
        abstractCar.run();

        N95MaskFactory n95MaskFactory = new N95MaskFactory();
        AbstractMask n95Mask = n95MaskFactory.newMask();
        n95Mask.protectedMy();

    }
}
