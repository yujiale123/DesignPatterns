package com.yjl.design.principle.dependenceInversion;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class Tom {

    private ICourse course;

    public ICourse getCourse() {
        return course;
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study() {
        course.study();
    }
}



