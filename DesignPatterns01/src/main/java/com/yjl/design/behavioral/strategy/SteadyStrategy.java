package com.yjl.design.behavioral.strategy;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class SteadyStrategy implements  GameStrategy{
    @Override
    public void warStrategy() {
        System.out.println("猥琐发育，及时支援");
    }
}
