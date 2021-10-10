package com.yjl.design.creation.factory.abstractFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class CommonMask  extends AbstractMask{

    public CommonMask(){
        this.price = 1;
    }
    @Override
    public void protectedMy() {
        System.out.println("普通口罩");
    }
}
