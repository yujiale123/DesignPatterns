package com.yjl.design.behavioral.strategy.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/08
 */
public class BankPayment implements Payment {
    @Override
    public void getPayType(Object type) {
        if (type.equals(2)) {
            System.out.println("银行卡支付");
        }
    }


}
