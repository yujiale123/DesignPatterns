package com.yjl.design.creation.factory.factoryMethod;

import com.yjl.design.creation.factory.abstractFactory.AbstractCar;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class RacingCar extends AbstractCar {
    public RacingCar() {
        this.engine = "赛车柴油机";
    }

    @Override
    public void run() {
        System.out.println(engine + ":赛车");
    }
}
