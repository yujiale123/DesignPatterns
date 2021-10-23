package com.yjl.design.behavioral.command;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 */
public class MainTest {
    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        invoker.setCommand(new TravelCommand());
        invoker.call();
    }
}
