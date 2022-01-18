package com.yjl.design.principle.dependenceInversion;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class Test {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.study(new JavaCourse());
        tom.study(new PythonCourse());
    }
}
