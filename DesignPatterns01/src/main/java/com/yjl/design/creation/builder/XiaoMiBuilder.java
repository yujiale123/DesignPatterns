package com.yjl.design.creation.builder;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 */
public class XiaoMiBuilder extends AbstractBuilder {

    public XiaoMiBuilder() {
        phone = new Phone();
    }


    @Override
    AbstractBuilder customCPU(String cpu) {
        phone.setCpu(cpu);
        return this;
    }

    @Override
    AbstractBuilder customMem(String mem) {
        phone.setMem(mem);
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.setDisk(disk);
        return this;
    }

    @Override
    AbstractBuilder customCamera(String camera) {
        phone.setCamera(camera);
        return this;
    }
}
