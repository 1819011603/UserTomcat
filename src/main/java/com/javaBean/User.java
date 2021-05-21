package com.javaBean;

/**
 * @author 18190
 * @Date: 2021/5/21  10:36
 * @VERSION 1.0
 */
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private String sex;
    private String home;
    private String info;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex='" + sex + '\'' +
                ", home='" + home + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public String getSex() {
        return sex;
    }

    public String getHome() {
        return home;
    }

    public String getInfo() {
        return info;
    }

    public User() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
