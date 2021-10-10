package com.yjl.design.creation.factory.factoryMethod;

import com.yjl.design.creation.factory.abstractFactory.AbstractCar;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class MainTest {

    public static void main(String[] args) {
        AbstractCarFactory racingCarFactory = new RacingCarFactory();
        AbstractCar abstractCar = racingCarFactory.newCar();
        abstractCar.run();

        AbstractCarFactory vanCarFactory = new VanCarFactory();
        AbstractCar abstractCar1 = vanCarFactory.newCar();
        abstractCar1.run();

        AbstractCarFactory minCarFactory = new MinCarFactory();
        AbstractCar abstractCar2 = minCarFactory.newCar();
        abstractCar2.run();
    }
}
