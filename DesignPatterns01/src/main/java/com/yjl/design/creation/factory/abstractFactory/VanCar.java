package com.yjl.design.creation.factory.abstractFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class VanCar extends AbstractCar {
    public VanCar() {
        this.engine = "货车柴油机";
    }

    @Override
    public void run() {
        System.out.println(engine + ":货车");
    }
}
