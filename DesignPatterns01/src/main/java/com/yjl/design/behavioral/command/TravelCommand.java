package com.yjl.design.behavioral.command;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 */
public class TravelCommand implements  Command{
    private   Receiver receiver =new Receiver();
    @Override
    public void execute() {
        System.out.println("出去旅游了");
        receiver.travel();
    }
}
