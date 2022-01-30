package com.yjl.design.structural.composite.general.transparent;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/30
 *
 * 抽象根节点
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();

    public boolean addChild(Component component) {
        throw new UnsupportedOperationException("addChild not supported!");
    }

    public boolean removeChild(Component component) {
        throw new UnsupportedOperationException("removeChild not supported!");
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException("getChild not supported!");
    }
}
