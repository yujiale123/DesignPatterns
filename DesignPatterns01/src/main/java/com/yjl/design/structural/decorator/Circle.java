package com.yjl.design.structural.decorator;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/14
 */
public class Circle  implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
