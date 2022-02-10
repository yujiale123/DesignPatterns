package com.yjl.design.behavioral.ChainOfResponibility.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/10
 *
 * 抽象处理者：领导类
 */
public abstract class Leader {

    private Leader next;


    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }


    /**
     * 处理请求的方法
     * @param LeaveDays
     */
    public abstract void handleRequest(int LeaveDays);
}
