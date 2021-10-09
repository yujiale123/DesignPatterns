package com.yjl.design.creation.factory.simpleFactory;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 * <p>
 * 简单工厂
 * 配置数量小
 * 违背开放原则，并且扩展不易，每次都要写大量的ifelse
 */
public class Factory {
    public AbstractCar newCar(String type) {
        /**
         * 简单工厂一切从简
         */
        if ("van".equals(type)) {
            return new VanCar();
        } else if ("min".equals(type)) {
            return new MinCar();
        }
        return null;
    }
}
