package com.dao;

import com.javaBean.User;

/**
 * @author 18190
 * @Date: 2021/5/21  12:21
 * @VERSION 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        UserDao userDao = new UserDao();
        System.out.println(userDao.querySingle("select * from user where name=? and pwd=?", User.class,"123","123"));
    }
}
