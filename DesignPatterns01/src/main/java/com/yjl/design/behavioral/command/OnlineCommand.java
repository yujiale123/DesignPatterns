package com.yjl.design.behavioral.command;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 */
public class OnlineCommand implements Command {

   private   Receiver receiver =new Receiver();
    @Override
    public void execute() {
        System.out.println("上课了");
        receiver.online();
    }
}
