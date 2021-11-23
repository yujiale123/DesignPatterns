package com.yjl.design.creation.builder.test;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/11/23
 */
public class MainTest {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.installDisplayed("显示器");
        computerBuilder.installMainUnit("主机");
        computerBuilder.installMouse("鼠标");
        computerBuilder.installKeyboard("键盘");
        Computer computer = computerBuilder.getComputer();
        System.out.println(computer);
    }
}
