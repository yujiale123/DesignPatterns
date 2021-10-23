package com.yjl.design.behavioral.visitor;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 * 抽象元素
 */
public abstract class HardWare {
    String command;


    public HardWare(String command) {
        this.command = command;

    }

    public void work(){
        System.out.println(command);
    }

    /**
     * 定义接收软件升级包的方法，这个方法应该具体硬件去实现
     * @param vistor
     */
    public abstract void  accept(Vistor vistor);
}
