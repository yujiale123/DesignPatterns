package com.yjl.design.behavioral.ChainOfResponibility.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/10
 */
public class DepartmentHeadHandler extends Leader {
    @Override
    public void handleRequest(int LeaveDays) {
        if (LeaveDays <= 7) {
            System.out.println("系主任批准您请假" + LeaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(LeaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
