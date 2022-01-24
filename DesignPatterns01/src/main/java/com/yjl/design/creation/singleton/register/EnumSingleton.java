package com.yjl.design.creation.singleton.register;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/24
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){return INSTANCE;}
}
