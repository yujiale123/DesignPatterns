package com.yjl.design.principle.simpleResponsibility.interfaced;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public interface ICourseManage {

    //获得视频流
    byte[] getCourseVideo();

    //学习课程
    void studyCourse();

    //退款
    void refundCourse();
}
