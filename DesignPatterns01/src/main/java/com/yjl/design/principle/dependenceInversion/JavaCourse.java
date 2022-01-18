package com.yjl.design.principle.dependenceInversion;


/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class JavaCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("java");
    }
}
