package com.yjl.design.structural.composite.general.safe;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/30
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();
}