package com.yjl.design.creation.factory.simpleFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class MinCar extends AbstractCar {
    public MinCar() {
        this.engine = "轿车柴油机";
    }

    @Override
    public void run() {
        System.out.println(engine + ":轿车");
    }
}
