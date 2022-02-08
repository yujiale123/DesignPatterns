package com.yjl.design.behavioral.strategy.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/08
 */
public class PayActivity<T> {

    private Payment<T> payment;

    public PayActivity(Payment<T> payment) {
        this.payment = payment;
    }

    public void execute() {
        payment.getPayType();
    }
}
