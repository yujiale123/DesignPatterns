package com.yjl.design.behavioral.interpreter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 */
public class MainTest {
    public static void main(String[] args) {
        Area area = new Area();
        String sr = "上海市:张三-医1生1";
        area.getTicker(sr);
    }
}
