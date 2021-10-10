package com.yjl.design.creation.factory.abstractFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 *
 * 具体产品
 */
public class N95Mask  extends AbstractMask{

    public N95Mask(){
        this.price = 2;
    }
    @Override
    public void protectedMy() {
        System.out.println("N95口罩");
    }
}
