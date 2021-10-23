package com.yjl.design.behavioral.command;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 */
public class OnlineCommand implements Command {
    @Override
    public void execute() {
        System.out.println("上课了");
    }
}
