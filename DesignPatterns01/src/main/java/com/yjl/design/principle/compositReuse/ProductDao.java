package com.yjl.design.principle.compositReuse;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class ProductDao {

    private DbConnection dbConnection;

    public void setConnection(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("获得数据库连接");
    }
}
