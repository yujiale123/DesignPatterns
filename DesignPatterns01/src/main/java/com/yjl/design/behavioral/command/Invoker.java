package com.yjl.design.behavioral.command;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 */
public class Invoker {
    Command command;

    public void call() {
        //命令
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
