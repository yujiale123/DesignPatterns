package com.yjl.design.delegate.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/06
 */
public class ConcreteA implements Task {
    @Override
    public void doTask() {
        System.out.println("执行 , 由A实现");
    }
}
