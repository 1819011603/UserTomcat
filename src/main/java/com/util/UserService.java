package com.util;

import com.dao.UserDao;
import com.javaBean.User;

import java.util.List;

/**
 * @author 18190
 * @Date: 2021/5/21  11:29
 * @VERSION 1.0
 */
public class UserService {
    private UserDao userDao = new UserDao();
    public User getUserByNameAndPassWord(String name, String password){
        return userDao.querySingle("select * from user where name=? and pwd=?",User.class,name,password);
    }
    public boolean getUserByName(String name){
        return userDao.querySingle("select * from user where name = ? ",User.class,name)!=null;
    }
    public boolean addUser(User user){
        if (getUserByName(user.getName())){
            return false;
        }
        return  userDao.update("insert into user values(null,?,?,?,?,?)",user.getName(),user.getPwd(),user.getSex(),user.getHome(),user.getInfo());

    }
    public List<User> getList(){
        return userDao.queryMulti("select * from user",User.class);
    }
}
