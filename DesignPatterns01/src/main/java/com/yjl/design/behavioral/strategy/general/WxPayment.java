package com.yjl.design.behavioral.strategy.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/08
 * 微信调用支付
 */
public class WxPayment implements Payment {
    @Override
    public void getPayType(Object type) {
        if (type.equals(1)){
            System.out.println("微信支付");
        }
    }
}
