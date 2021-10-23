package com.yjl.design.behavioral.visitor;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 */
public class Disk extends HardWare {
    public Disk(String command) {
        super(command);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visitDisk(this);
    }

    @Override
    public void work() {
        System.out.println("disk保存指令的历史记录" + command);
    }
}
