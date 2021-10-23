package com.yjl.design.behavioral.visitor;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 */
public class XiaoAl {
    private Cpu cpu = new Cpu("武汉天气");
    private Disk disk = new Disk("武汉天气");


    void answerQuestion() {
        cpu.work();
        disk.work();
    }

    public void acceptUpdate(Vistor updatePackage) {


        updatePackage.visitCpu(cpu);
        updatePackage.visitDisk(disk);
    }
}
