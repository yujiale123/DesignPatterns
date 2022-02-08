package com.yjl.design.behavioral.strategy.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/08
 */
public class AlipayPayment implements Payment{



    @Override
    public void getPayType(Object type) {

        if (type.equals(0)){
            System.out.println("支付宝支付");
        }

    }
}
