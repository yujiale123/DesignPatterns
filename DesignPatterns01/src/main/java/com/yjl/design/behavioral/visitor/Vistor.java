package com.yjl.design.behavioral.visitor;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 *
 * 接口
 */
public interface Vistor {
    void visitDisk(Disk disk);

    void visitCpu(Cpu cpu);
}
