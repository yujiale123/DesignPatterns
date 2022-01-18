package com.yjl.design.principle.lawOfDemeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class Employee {

    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println(courseList.size());
    }
}
