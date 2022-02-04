package com.yjl.design.structural.composite.general.safe;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/30
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }
}
