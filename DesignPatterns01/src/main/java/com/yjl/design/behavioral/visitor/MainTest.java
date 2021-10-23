package com.yjl.design.behavioral.visitor;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 */
public class MainTest {
    public static void main(String[] args) {
        XiaoAl xiaoAl = new XiaoAl();
        xiaoAl.answerQuestion();

        //cpu联网指令、disk保存到云存储

        System.out.println("=======");


        UpdatePackage updatePackage = new UpdatePackage("联网增强");
        xiaoAl.acceptUpdate(updatePackage);
        xiaoAl.answerQuestion();
    }
}
