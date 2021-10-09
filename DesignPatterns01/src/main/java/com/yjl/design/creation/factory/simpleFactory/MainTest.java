package com.yjl.design.creation.factory.simpleFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class MainTest {

    public static void main(String[] args) {
        Factory factory = new Factory();
        AbstractCar van = factory.newCar("van");
        AbstractCar min = factory.newCar("min");
        AbstractCar zz = factory.newCar("zz");
        van.run();
        min.run();
    }
}
