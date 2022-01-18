package com.yjl.design.principle.simpleResponsibility;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class Course {

    public void study(String courseName){
        if ("直播课".equals(courseName)){
            System.out.println("不");
        }else{
            System.out.println(courseName+"可以");
        }
    }
}
