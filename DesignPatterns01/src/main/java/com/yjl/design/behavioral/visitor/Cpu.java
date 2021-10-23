package com.yjl.design.behavioral.visitor;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 */
public class Cpu  extends  HardWare{
    public Cpu(String command) {
        super(command);
    }
    @Override
    public void accept(Vistor vistor) {
        vistor.visitCpu(this);
    }

    @Override
    public void work() {
        System.out.println("CPU处理指令"+command);
    }
}
