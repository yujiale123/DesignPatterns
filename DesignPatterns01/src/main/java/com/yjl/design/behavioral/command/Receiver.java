package com.yjl.design.behavioral.command;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 */
public class Receiver {
    public void online() {
        System.out.println("上班");
    }

    public void travel() {
        System.out.println("出差");
    }
}
