package com.yjl.design.creation.builder;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 * <p>
 * 建造者
 */
public abstract class AbstractBuilder {


    public Phone phone;

    abstract AbstractBuilder customCPU(String cpu);

    abstract AbstractBuilder customMem(String mem);

    abstract AbstractBuilder customDisk(String disk);

    abstract AbstractBuilder customCamera(String camera);

    public Phone getProduct() {
        return phone;
    }


}
