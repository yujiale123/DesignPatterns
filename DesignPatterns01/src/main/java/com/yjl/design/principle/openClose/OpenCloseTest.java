package com.yjl.design.principle.openClose;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class OpenCloseTest {

    public static void main(String[] args) {


        ICourse course = new JavaDiscountCourse(1, "demo01", 20.00);

        System.out.println(course.toString()+","+((JavaDiscountCourse)course).getDiscountPrice());
    }
}
