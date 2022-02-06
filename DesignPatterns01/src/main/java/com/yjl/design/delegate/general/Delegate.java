package com.yjl.design.delegate.general;

import java.util.Random;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/06
 * <p>
 * 代理角色
 */
public class Delegate implements Task {
    @Override
    public void doTask() {
        System.out.println("代理执行开始....");

        Task task = null;
        if (new Random().nextBoolean()) {
            task = new ConcreteA();
            task.doTask();
        } else {
            task = new ConcreteB();
            task.doTask();
        }

        System.out.println("代理执行完毕....");
    }
}
