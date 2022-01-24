package com.yjl.design.creation.builder;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractBuilder xiaoMiBuilder = new XiaoMiBuilder();
        Phone product = xiaoMiBuilder.customCPU("晓龙888")
                .customMem("16G")
                .customDisk("512G")
                .customCamera("索尼").getProduct();

        new StringBuffer();

        System.out.println(product);

    }
}
