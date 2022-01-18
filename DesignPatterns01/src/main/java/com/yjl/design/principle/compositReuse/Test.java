package com.yjl.design.principle.compositReuse;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setConnection(new MySQLConnection());
        productDao.addProduct();
    }
}
