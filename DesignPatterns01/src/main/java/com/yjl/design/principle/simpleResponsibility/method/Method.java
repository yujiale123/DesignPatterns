package com.yjl.design.principle.simpleResponsibility.method;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/18
 */
public class Method {
    private void modifyUserInfo(String userName, String address) {
        userName = "Tom";
        address = "Changsha";
    }

    private void modifyUserName(String userName) {

    }

    private void modifyAddress(String address) {

    }

    private void modifyUserInfo(String userName, String... files) {

    }

    private void modifyUserInfo(String userName, String address, Boolean bool) {
        if (bool) {

        } else {

        }
    }
}
