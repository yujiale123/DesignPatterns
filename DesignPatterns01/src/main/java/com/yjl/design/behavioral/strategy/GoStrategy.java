package com.yjl.design.behavioral.strategy;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class GoStrategy  implements  GameStrategy{
    @Override
    public void warStrategy() {
        System.out.println("冲呀");
    }
}
