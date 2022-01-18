package com.yjl.design.principle.openClose;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }


    public Double getDiscountPrice() {
        return super.getPrice() * 0.6;
    }
}
