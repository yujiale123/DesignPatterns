package com.yjl.design.structural.proxy.statics;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 * <p>
 * 代理一般都和被代理对象属于同一个接口
 */
public class TikTokProxy implements ManTikTok {

    /**
     * 被代理对象
     */
    private ManTikTok manTikTok;

    public TikTokProxy(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void tikTok() {
        //增强功能
        System.out.println("渲染。。。。");
        System.out.println("代理人正在tikTok。。。。。");
    }
}
