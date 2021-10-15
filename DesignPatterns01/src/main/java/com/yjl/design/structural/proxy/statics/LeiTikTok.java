package com.yjl.design.structural.proxy.statics;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 *
 * subject  主体
 */
public class LeiTikTok implements ManTikTok {
    @Override
    public void tikTok() {
        System.out.println("人，tiTok......");
    }
}
