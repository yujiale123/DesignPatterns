package com.yjl.design.principle.lawOfDemeter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class TeamLeader {

    public void commandCheckNumber(Employee employee) {

     employee.checkNumberOfCourses();
    }
}
