package com.yjl.design.structural.proxy.cglib;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 */
public class MainTest {
    public static void main(String[] args) {

        LeiTikTok leiTikTok = new LeiTikTok();
        LeiTikTok proxy = CglibProxy.createProxy(leiTikTok);
        proxy.tikTok();
    }
}
