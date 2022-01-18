package com.yjl.design.principle.compositReuse;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class MyOracleConnection extends DbConnection{
    @Override
    public String getConnection() {
        return "获取Oracle数据连接";
    }
}
