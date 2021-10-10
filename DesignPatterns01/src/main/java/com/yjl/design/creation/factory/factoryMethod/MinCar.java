package com.yjl.design.creation.factory.factoryMethod;

import com.yjl.design.creation.factory.abstractFactory.AbstractCar;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class MinCar extends AbstractCar {


    public MinCar(){
        this.engine="轿车发动机";
    }


    @Override
    public void run() {
        System.out.println("轿车");
    }
}
